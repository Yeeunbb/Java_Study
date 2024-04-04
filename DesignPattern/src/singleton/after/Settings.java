package singleton.after;

public class Settings {

    private Settings() {}; // new로 생성할 수 없게됨
    private static Settings settings = null;

    public static Settings getSettings () {
        if (settings == null) {
            settings = new Settings();
        }
        return settings;
    }

    /**
     * static으로 선언한 객체는 메모리의 지정된 공간에 딱 하나씩만 존재하게 됨
     */

    private boolean darkMode = false;
    private int fontSize = 13;

    public boolean getDarkMode () { return darkMode; }
    public int getFontSize() { return fontSize; }

    public void setDarkMode (boolean _darkMode) {
        darkMode = _darkMode;
    }

    public void setFontSize (int _fontSize) {
        fontSize = _fontSize;
    }
}
