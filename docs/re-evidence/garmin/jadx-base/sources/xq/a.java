package xq;

import am.x0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import uq.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxq/a;", "Landroidx/fragment/app/e0;", "Landroidx/fragment/app/Fragment;", "fragment", "", "activityId", "", "activityTypeKey", "", "Lxq/b;", "tabList", "<init>", "(Landroidx/fragment/app/Fragment;JLjava/lang/String;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Fragment f191910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f191911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<b> f191912j;

    /* JADX INFO: renamed from: xq.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3573a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f191913a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.LAPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.ALL_LAPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.REST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SPLITS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.WEIGHT_SPLITS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.ALL_RUNS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.ALL_RUNS_ALTERNATE_TITLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.RUNS_ALTERNATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.PACEPRO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.TOP_SPLITS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f191913a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Fragment fragment, long j8, String str, List<? extends b> list) {
        super(fragment.getChildFragmentManager(), 1);
        fragment.getClass();
        list.getClass();
        this.f191910h = fragment;
        this.f191911i = j8;
        this.f191912j = list;
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF44034e() {
        return this.f191912j.size();
    }

    @Override // androidx.fragment.app.e0
    public final Fragment getItem(int i14) {
        int i15 = C3573a.f191913a[this.f191912j.get(i14).ordinal()];
        long j8 = this.f191911i;
        switch (i15) {
            case 1:
            case 2:
                return new wr.b();
            case 3:
                k kVar = k.READ_ONLY;
                boolean z14 = b.REST.f191926b;
                wr.k.f186755l.getClass();
                return wr.k.a.a(j8, kVar, z14, null);
            case 4:
                k kVar2 = k.READ_ONLY;
                boolean z15 = b.SPLITS.f191926b;
                wr.k.f186755l.getClass();
                return wr.k.a.a(j8, kVar2, z15, null);
            case 5:
                k kVar3 = k.READ_ONLY;
                boolean z16 = b.WEIGHT_SPLITS.f191926b;
                x0 x0Var = x0.E3;
                wr.k.f186755l.getClass();
                return wr.k.a.a(j8, kVar3, z16, x0Var);
            case 6:
                k kVar4 = k.READ_ONLY;
                boolean z17 = b.ALL_RUNS.f191926b;
                wr.k.f186755l.getClass();
                return wr.k.a.a(j8, kVar4, z17, null);
            case 7:
                k kVar5 = k.READ_ONLY;
                boolean z18 = b.ALL_RUNS_ALTERNATE_TITLE.f191926b;
                wr.k.f186755l.getClass();
                return wr.k.a.a(j8, kVar5, z18, null);
            case 8:
                k kVar6 = k.ALTERNATE;
                boolean z19 = b.RUNS_ALTERNATE.f191926b;
                wr.k.f186755l.getClass();
                return wr.k.a.a(j8, kVar6, z19, null);
            case 9:
                k kVar7 = k.COMPARISON;
                boolean z24 = b.PACEPRO.f191926b;
                wr.k.f186755l.getClass();
                return wr.k.a.a(j8, kVar7, z24, null);
            case 10:
                k kVar8 = k.TOP_SPLITS;
                boolean z25 = b.TOP_SPLITS.f191926b;
                wr.k.f186755l.getClass();
                return wr.k.a.a(j8, kVar8, z25, null);
            default:
                u0.r();
                return null;
        }
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        return dh.b.B(this.f191910h, this.f191912j.get(i14).f191925a);
    }
}
