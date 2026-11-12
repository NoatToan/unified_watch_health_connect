package ohos.ace.adapter.capability.platformview;

/* JADX INFO: loaded from: classes46.dex */
public abstract class PlatformViewFactory {
    public abstract IPlatformView getPlatformView(String str);

    public IPlatformView getPlatformView(String str, String str2) {
        return getPlatformView(str);
    }
}
