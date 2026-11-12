package miuipub.hybrid;

/* JADX INFO: loaded from: classes3.dex */
public interface HybridFeature {

    public enum Mode {
        SYNC,
        ASYNC,
        CALLBACK
    }

    Mode getInvocationMode(Request request);

    Response invoke(Request request);
}
