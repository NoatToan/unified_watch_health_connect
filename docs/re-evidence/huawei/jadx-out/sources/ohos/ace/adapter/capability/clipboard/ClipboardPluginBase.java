package ohos.ace.adapter.capability.clipboard;

/* JADX INFO: loaded from: classes46.dex */
public abstract class ClipboardPluginBase {
    public abstract void clear();

    public abstract String getData();

    public abstract String getMultiTypeData();

    public abstract boolean hasData();

    public abstract boolean isMultiTypeData();

    protected native void nativeInit();

    public abstract void setData(String str);

    public abstract void setMultiTypeData(String str);
}
