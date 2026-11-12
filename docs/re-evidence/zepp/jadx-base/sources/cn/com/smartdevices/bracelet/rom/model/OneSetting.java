package cn.com.smartdevices.bracelet.rom.model;

import cn.com.smartdevices.bracelet.rom.IWrapIntent;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class OneSetting implements Serializable {
    public static OneSetting NULL = new OneSetting(null);
    private static final long serialVersionUID = 1;
    private final String a;
    private final TYPE b;
    private final IWrapIntent c;
    private boolean d;
    private boolean e;

    public enum TYPE {
        ACTIVITY,
        ACTION,
        PACKAGE
    }

    public OneSetting(String str) {
        this(str, TYPE.ACTIVITY);
    }

    public String getSetting() {
        return this.a;
    }

    public IWrapIntent getWrapIntent() {
        return this.c;
    }

    public boolean isAction() {
        return this.b == TYPE.ACTION;
    }

    public boolean isActivity() {
        return this.b == TYPE.ACTIVITY;
    }

    public boolean isExist() {
        return this.d;
    }

    public boolean isPackage() {
        return this.b == TYPE.PACKAGE;
    }

    public boolean isValid() {
        return this.e;
    }

    public void setExist(boolean z) {
        this.d = z;
    }

    public void setValid(boolean z) {
        this.e = z;
    }

    public OneSetting(String str, TYPE type) {
        this(str, type, null);
    }

    public OneSetting(String str, TYPE type, IWrapIntent iWrapIntent) {
        this.a = str;
        this.b = type;
        this.c = iWrapIntent;
    }
}
