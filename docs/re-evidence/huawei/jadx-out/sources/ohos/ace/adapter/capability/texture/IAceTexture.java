package ohos.ace.adapter.capability.texture;

/* JADX INFO: loaded from: classes20.dex */
public interface IAceTexture {
    long attachNaitveSurface(Object obj);

    void markTextureFrameAvailable(long j);

    void registerSurface(long j, Object obj);

    void registerTexture(long j, Object obj);

    void unregisterSurface(long j);

    void unregisterTexture(long j);
}
