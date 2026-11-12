package qt1;

import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$onDuplicateTrailCourseRequested$1", f = "TrailDetailsViewModel.kt", l = {1278, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, 1280, 1283, 1287, 1291}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f147633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f147634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f147635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(k kVar, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f147635c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f147635c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0088 A[PHI: r2
      0x0088: PHI (r2v7 java.lang.Object) = (r2v6 java.lang.Object), (r2v9 java.lang.Object) binds: [B:14:0x0084, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x00d5 A[PHI: r2
      0x00d5: PHI (r2v10 java.util.List) = (r2v8 java.util.List), (r2v21 java.util.List) binds: [B:17:0x00d1, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:24:0x012a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0130  */
    /* JADX WARN: Code duplicated, block: B:29:0x0176  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0126, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0173, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01b8, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        List list;
        p2 p2Var;
        p2 p2Var2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147634b;
        k kVar = this.f147635c;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                p2 p2Var3 = kVar.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var3.getValue(), true, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644667);
                this.f147634b = 1;
                p2Var3.k(null, oVarA);
                if (Unit.INSTANCE != aVar) {
                    ts1.a aVar2 = (ts1.a) KoinJavaComponent.get$default(ts1.a.class, null, null, 6, null);
                    this.f147634b = 2;
                    objA = aVar2.a();
                    if (objA != aVar) {
                        list = (List) objA;
                        p2 p2Var4 = kVar.f147673h;
                        pt1.o oVarA2 = pt1.o.a((pt1.o) p2Var4.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                        this.f147633a = list;
                        this.f147634b = 3;
                        p2Var4.k(null, oVarA2);
                        if (Unit.INSTANCE != aVar) {
                            p2Var = kVar.f147673h;
                            p2Var2 = kVar.f147673h;
                            if (((pt1.o) p2Var.getValue()).f140927y) {
                                pt1.o oVarA3 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, true, false, false, false, 1040187391);
                                this.f147633a = null;
                                this.f147634b = 4;
                                p2Var2.k(null, oVarA3);
                            } else if (list.isEmpty()) {
                                pt1.o oVarA4 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, vs1.i.NO_SUBSCRIPTION, null, null, false, false, false, false, false, 1071644671);
                                this.f147633a = null;
                                this.f147634b = 6;
                                p2Var2.k(null, oVarA4);
                            } else {
                                pt1.o oVarA5 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, vs1.i.NO_COMPATIBLE_DEVICES, null, null, false, false, false, false, false, 1071644671);
                                this.f147633a = null;
                                this.f147634b = 5;
                                p2Var2.k(null, oVarA5);
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                ts1.a aVar3 = (ts1.a) KoinJavaComponent.get$default(ts1.a.class, null, null, 6, null);
                this.f147634b = 2;
                objA = aVar3.a();
                if (objA != aVar) {
                    list = (List) objA;
                    p2 p2Var5 = kVar.f147673h;
                    pt1.o oVarA6 = pt1.o.a((pt1.o) p2Var5.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                    this.f147633a = list;
                    this.f147634b = 3;
                    p2Var5.k(null, oVarA6);
                    if (Unit.INSTANCE != aVar) {
                        p2Var = kVar.f147673h;
                        p2Var2 = kVar.f147673h;
                        if (((pt1.o) p2Var.getValue()).f140927y) {
                            pt1.o oVarA7 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, true, false, false, false, 1040187391);
                            this.f147633a = null;
                            this.f147634b = 4;
                            p2Var2.k(null, oVarA7);
                        } else if (list.isEmpty()) {
                            pt1.o oVarA8 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, vs1.i.NO_SUBSCRIPTION, null, null, false, false, false, false, false, 1071644671);
                            this.f147633a = null;
                            this.f147634b = 6;
                            p2Var2.k(null, oVarA8);
                        } else {
                            pt1.o oVarA9 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, vs1.i.NO_COMPATIBLE_DEVICES, null, null, false, false, false, false, false, 1071644671);
                            this.f147633a = null;
                            this.f147634b = 5;
                            p2Var2.k(null, oVarA9);
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                o13.r.b(obj);
                objA = obj;
                list = (List) objA;
                p2 p2Var6 = kVar.f147673h;
                pt1.o oVarA10 = pt1.o.a((pt1.o) p2Var6.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                this.f147633a = list;
                this.f147634b = 3;
                p2Var6.k(null, oVarA10);
                if (Unit.INSTANCE != aVar) {
                    p2Var = kVar.f147673h;
                    p2Var2 = kVar.f147673h;
                    if (((pt1.o) p2Var.getValue()).f140927y) {
                        pt1.o oVarA11 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, true, false, false, false, 1040187391);
                        this.f147633a = null;
                        this.f147634b = 4;
                        p2Var2.k(null, oVarA11);
                    } else if (list.isEmpty()) {
                        pt1.o oVarA12 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, vs1.i.NO_SUBSCRIPTION, null, null, false, false, false, false, false, 1071644671);
                        this.f147633a = null;
                        this.f147634b = 6;
                        p2Var2.k(null, oVarA12);
                    } else {
                        pt1.o oVarA13 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, vs1.i.NO_COMPATIBLE_DEVICES, null, null, false, false, false, false, false, 1071644671);
                        this.f147633a = null;
                        this.f147634b = 5;
                        p2Var2.k(null, oVarA13);
                    }
                    break;
                }
                return aVar;
            case 3:
                list = this.f147633a;
                o13.r.b(obj);
                p2Var = kVar.f147673h;
                p2Var2 = kVar.f147673h;
                if (((pt1.o) p2Var.getValue()).f140927y) {
                    pt1.o oVarA14 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, true, false, false, false, 1040187391);
                    this.f147633a = null;
                    this.f147634b = 4;
                    p2Var2.k(null, oVarA14);
                } else if (list.isEmpty()) {
                    pt1.o oVarA15 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, vs1.i.NO_SUBSCRIPTION, null, null, false, false, false, false, false, 1071644671);
                    this.f147633a = null;
                    this.f147634b = 6;
                    p2Var2.k(null, oVarA15);
                } else {
                    pt1.o oVarA16 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, vs1.i.NO_COMPATIBLE_DEVICES, null, null, false, false, false, false, false, 1071644671);
                    this.f147633a = null;
                    this.f147634b = 5;
                    p2Var2.k(null, oVarA16);
                }
                break;
            case 4:
            case 5:
            case 6:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
