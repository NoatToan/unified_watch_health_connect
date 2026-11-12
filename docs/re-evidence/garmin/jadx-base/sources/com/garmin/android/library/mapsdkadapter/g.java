package com.garmin.android.library.mapsdkadapter;

import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/g;", "Lcom/garmin/android/library/mapsdkadapter/h;", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "mapProvider", "Ljava/util/Locale;", "locale", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/i$d;Ljava/util/Locale;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f50285a;

    public g(i.d dVar, Locale locale) {
        locale.getClass();
        ie2.n.f93149a.getClass();
        this.f50285a = new c(((r) ie2.n.a()).f50330a, locale);
    }

    @Override // com.garmin.android.library.mapsdkadapter.h
    public final Object a(f fVar, v13.c cVar) {
        return this.f50285a.a(fVar, cVar);
    }

    @Override // com.garmin.android.library.mapsdkadapter.h
    public final Object b(String str, v13.c cVar) {
        return this.f50285a.b(str, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g(i.d dVar, Locale locale, int i14, p005kotlin.jvm.internal.j jVar) {
        dVar = (i14 & 1) != 0 ? null : dVar;
        if ((i14 & 2) != 0) {
            locale = Locale.getDefault();
            locale.getClass();
        }
        this(dVar, locale);
    }
}
