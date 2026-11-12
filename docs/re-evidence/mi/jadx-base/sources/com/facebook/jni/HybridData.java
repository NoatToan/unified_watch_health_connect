package com.facebook.jni;

import com.facebook.soloader.SoLoader;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class HybridData {

    @v07
    private Destructor mDestructor = new Destructor(this);

    public static class Destructor extends a.b {

        @v07
        private long mNativePointer;

        public Destructor(Object obj) {
            super(obj);
        }

        public static native void deleteNative(long j);

        @Override // com.facebook.jni.a.b
        public final void e() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }

    static {
        SoLoader.q("fb");
    }

    public synchronized void a() {
        this.mDestructor.e();
    }
}
