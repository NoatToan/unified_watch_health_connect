package gw;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.biz.operations.MigrateLTAndIDInfoToGCContactsOperations", f = "MigrateLTAndIDInfoToGCContactsOperations.kt", l = {105}, m = "saveMergedContacts", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f79535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f79536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f79537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f79537c = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f79536b = obj;
        this.f79538d |= Integer.MIN_VALUE;
        int i14 = p.f79527d;
        return this.f79537c.b(null, null, this);
    }
}
