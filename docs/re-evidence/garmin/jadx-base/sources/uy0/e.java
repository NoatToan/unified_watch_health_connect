package uy0;

import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$k;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetActivityStatsItemsUseCase$invoke$2", f = "GetActivityStatsItemsUseCase.kt", l = {29}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f173136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f173137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ty0.b[] f173138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f173139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f173140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f173141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f173142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f173143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f173144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f173145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f173146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f173147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f173148m;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173149a;

        static {
            int[] iArr = new int[ty0.b.values().length];
            try {
                iArr[ty0.b.f166920v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ty0.b.f166932z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ty0.b.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f173149a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, boolean z14, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f173147l = fVar;
        this.f173148m = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f173147l, this.f173148m, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.k>> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084 A[LOOP:0: B:25:0x0082->B:26:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf A[LOOP:1: B:36:0x00cd->B:37:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:43:0x012c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0067 -> B:45:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x012a -> B:6:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:31:0x00b5
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uy0.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
