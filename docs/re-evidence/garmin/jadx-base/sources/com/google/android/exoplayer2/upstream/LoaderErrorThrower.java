package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes14.dex */
public interface LoaderErrorThrower {

    public static final class Dummy implements LoaderErrorThrower {
        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError() {
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError(int i14) {
        }
    }

    void maybeThrowError();

    void maybeThrowError(int i14);
}
