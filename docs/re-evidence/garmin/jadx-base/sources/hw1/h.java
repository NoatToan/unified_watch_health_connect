package hw1;

import e23.l;
import e23.p;
import i3.b3;
import i3.bc;
import i3.cc;
import i3.l3;
import i3.x3;
import java.util.Locale;
import l3.e0;
import l3.h0;
import m4.b0;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85959a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f85960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f85961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f85962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f85963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f85964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f85965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f85966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f85967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f85968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f85969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f85970l;

    public /* synthetic */ h(Long l14, long j8, int i14, l lVar, l lVar2, e0 e0Var, j23.l lVar3, l3 l3Var, bc bcVar, b3 b3Var, b0 b0Var, int i15) {
        this.f85962d = l14;
        this.f85960b = j8;
        this.f85961c = i14;
        this.f85963e = lVar;
        this.f85964f = lVar2;
        this.f85965g = e0Var;
        this.f85966h = lVar3;
        this.f85967i = l3Var;
        this.f85968j = bcVar;
        this.f85969k = b3Var;
        this.f85970l = b0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f85959a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                i.c((u4.d) this.f85962d, this.f85960b, (String) this.f85963e, (String) this.f85964f, (String) this.f85965g, (String) this.f85966h, (String) this.f85967i, (String) this.f85968j, (String) this.f85969k, (e23.a) this.f85970l, (m) obj, iT, this.f85961c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(this.f85961c | 1);
                x3.i((h0) this.f85962d, (l) this.f85963e, this.f85960b, (Long) this.f85964f, (Long) this.f85965g, (cc) this.f85966h, (l3) this.f85967i, (bc) this.f85968j, (b3) this.f85969k, (Locale) this.f85970l, (m) obj, iT2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(1);
                x3.k((Long) this.f85962d, this.f85960b, this.f85961c, (l) this.f85963e, (l) this.f85964f, (e0) this.f85965g, (j23.l) this.f85966h, (l3) this.f85967i, (bc) this.f85968j, (b3) this.f85969k, (b0) this.f85970l, (m) obj, iT3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(h0 h0Var, l lVar, long j8, Long l14, Long l15, cc ccVar, l3 l3Var, bc bcVar, b3 b3Var, Locale locale, int i14) {
        this.f85962d = h0Var;
        this.f85963e = lVar;
        this.f85960b = j8;
        this.f85964f = l14;
        this.f85965g = l15;
        this.f85966h = ccVar;
        this.f85967i = l3Var;
        this.f85968j = bcVar;
        this.f85969k = b3Var;
        this.f85970l = locale;
        this.f85961c = i14;
    }

    public /* synthetic */ h(u4.d dVar, long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, e23.a aVar, int i14, int i15) {
        this.f85962d = dVar;
        this.f85960b = j8;
        this.f85963e = str;
        this.f85964f = str2;
        this.f85965g = str3;
        this.f85966h = str4;
        this.f85967i = str5;
        this.f85968j = str6;
        this.f85969k = str7;
        this.f85970l = aVar;
        this.f85961c = i15;
    }
}
