package defpackage;

/* JADX INFO: loaded from: classes13.dex */
public class osf {
    public static final int ERROR_CODE = -1;
    protected int dataType;
    protected String huid = "";
    protected int key = 0;
    protected String values = "";
    protected String type = "";
    protected int year = 0;

    public osf(int i) {
        this.dataType = i;
    }

    public String getHuid() {
        return this.huid;
    }

    public void setHuid(String str) {
        this.huid = str;
    }

    public int acquireDataType() {
        return this.dataType;
    }

    public String getValues() {
        return this.values;
    }

    public void setValues(String str) {
        this.values = str;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int i) {
        this.key = i;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }
}
