package io.netty.util;

/* JADX INFO: loaded from: classes2.dex */
public interface ReferenceCounted {
    int refCnt();

    boolean release();

    boolean release(int i);

    ReferenceCounted retain();

    ReferenceCounted retain(int i);

    ReferenceCounted touch();

    ReferenceCounted touch(Object obj);
}
