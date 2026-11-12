package a91;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.LanguageSelectionRepository", f = "LanguageSelectionRepository.kt", l = {81, 86}, m = "getShownLanguagePrompts", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f2154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f2156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f2156c = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f2155b = obj;
        this.f2157d |= Integer.MIN_VALUE;
        return this.f2156c.b(this);
    }
}
