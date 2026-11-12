package iu1;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002By\b\u0005\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Liu1/h;", "T", "Liu1/d;", "Liu1/e;", "objectParser", "Ld80/h;", "cacheHandler", "", "cacheFetchEnabled", "Ljava/lang/Class;", "clazz", "Liu1/k;", "objectResultListener", "Liu1/i;", "listResultListener", "Liu1/j;", "noParsingListener", "Liu1/l;", "resultHeaderParsingListener", "<init>", "(Liu1/e;Ld80/h;ZLjava/lang/Class;Liu1/k;Liu1/i;Liu1/j;Liu1/l;)V", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h<T> extends d<T> {
    public /* synthetic */ h(e eVar, d80.h hVar, boolean z14, Class cls, k kVar, i iVar, j jVar, l lVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? new g() : eVar, (i14 & 2) != 0 ? null : hVar, (i14 & 4) != 0 ? false : z14, cls, (i14 & 16) != 0 ? null : kVar, (i14 & 32) != 0 ? null : iVar, (i14 & 64) != 0 ? null : jVar, (i14 & 128) != 0 ? null : lVar);
    }

    @Override // iu1.d
    public final ju1.c d(d.b bVar) {
        return new ju1.c(f(), bVar);
    }

    public abstract c83.d<String> f();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(e<T> eVar, d80.h hVar, boolean z14, Class<T> cls) {
        this(eVar, hVar, z14, cls, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
        eVar.getClass();
        cls.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(e<T> eVar, d80.h hVar, boolean z14, Class<T> cls, k<? super T> kVar) {
        this(eVar, hVar, z14, cls, kVar, null, null, null, 224, null);
        eVar.getClass();
        cls.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(e<T> eVar, d80.h hVar, boolean z14, Class<T> cls, k<? super T> kVar, i<? super T> iVar) {
        this(eVar, hVar, z14, cls, kVar, iVar, null, null, 192, null);
        eVar.getClass();
        cls.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(e<T> eVar, d80.h hVar, boolean z14, Class<T> cls, k<? super T> kVar, i<? super T> iVar, j jVar) {
        this(eVar, hVar, z14, cls, kVar, iVar, jVar, null, 128, null);
        eVar.getClass();
        cls.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(e<T> eVar, Class<T> cls) {
        this(eVar, null, false, cls, null, null, null, null, 246, null);
        eVar.getClass();
        cls.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Class<T> cls) {
        this(null, null, false, cls, null, null, null, null, 247, null);
        cls.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e<T> eVar, d80.h hVar, boolean z14, Class<T> cls, k<? super T> kVar, i<? super T> iVar, j jVar, l lVar) {
        super(eVar, hVar, z14, cls, kVar, iVar, jVar, lVar);
        eVar.getClass();
        cls.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(e<T> eVar, d80.h hVar, Class<T> cls) {
        this(eVar, hVar, false, cls, null, null, null, null, 244, null);
        eVar.getClass();
        cls.getClass();
    }
}
