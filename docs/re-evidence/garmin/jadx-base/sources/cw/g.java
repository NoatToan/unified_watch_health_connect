package cw;

import java.util.ArrayList;
import m20.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.biz.ContactsBizManager", f = "ContactsBizManager.kt", l = {36, 38}, m = "replaceContacts", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f55919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f55920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f55921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f55922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f55922d = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f55921c = obj;
        this.f55923e |= Integer.MIN_VALUE;
        return this.f55922d.c(null, this);
    }
}
