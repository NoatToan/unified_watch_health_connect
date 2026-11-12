package qt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$getEditReviewState$1", f = "TrailDetailsViewModel.kt", l = {1002, 1005, 1011}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qs1.u f147841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f147842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f147843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f147844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f147845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(k kVar, long j8, Context context, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f147843c = kVar;
        this.f147844d = j8;
        this.f147845e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f147843c, this.f147844d, this.f147845e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0147 A[EDGE_INSN: B:106:0x0147->B:60:0x0147 BREAK  A[LOOP:1: B:54:0x0130->B:58:0x0141], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[PHI: r11
      0x0094: PHI (r11v10 java.lang.Long) = (r11v3 java.lang.Long), (r11v4 java.lang.Long) binds: [B:31:0x0092, B:34:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141 A[LOOP:1: B:54:0x0130->B:58:0x0141, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0149  */
    /* JADX WARN: Code duplicated, block: B:67:0x015e  */
    /* JADX WARN: Code duplicated, block: B:71:0x016b  */
    /* JADX WARN: Code duplicated, block: B:74:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0199  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f3  */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0211, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objN0;
        qs1.u uVar;
        Object objC3;
        v2 v2Var;
        String str;
        Long activityDateMs;
        long millis;
        Integer rating;
        int iIntValue;
        String reviewComment;
        String str2;
        List<String> listF;
        qs1.u uVar2;
        i53.c cVarB;
        List<String> listU;
        i53.c cVarB2;
        List<qs1.b> listM;
        i53.c cVarB3;
        ArrayList arrayList;
        String imageUrl;
        String str3;
        ArrayList arrayList2;
        us1.i iVarA;
        ArrayList arrayList3;
        Iterator it;
        String str4;
        us1.g[] gVarArrValues;
        int length;
        int i14;
        us1.g gVar;
        int i15;
        int i16;
        String courseName;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = this.f147842b;
        k kVar = this.f147843c;
        if (i17 == 0) {
            o13.r.b(obj);
            kVar.Q4(true);
            ss1.a0 a0Var = kVar.f147667b;
            this.f147842b = 1;
            objN0 = a0Var.n0(this.f147844d, this);
            if (objN0 != aVar) {
            }
            return aVar;
        }
        if (i17 == 1) {
            o13.r.b(obj);
            objN0 = obj;
        } else if (i17 == 2) {
            uVar = this.f147841a;
            o13.r.b(obj);
            objC3 = obj;
            v2Var = (v2) objC3;
            if ((v2Var instanceof v2.b) || (courseName = ((qs1.s) ((v2.b) v2Var).f47386a).f147341a.getCourseName()) == null) {
                str = "";
            } else {
                str = courseName;
            }
            p2 p2Var = kVar.f147674i;
            lt1.j jVar = lt1.j.f114865a;
            activityDateMs = ((pt1.o) kVar.f147673h.getValue()).f140918p;
            if (activityDateMs != null && (activityDateMs = uVar.getActivityDateMs()) == null) {
                millis = DateTime.now().withTimeAtStartOfDay().getMillis();
            } else {
                millis = activityDateMs.longValue();
            }
            jVar.getClass();
            uVar.getClass();
            Context context = this.f147845e;
            context.getClass();
            Long curatedCourseId = uVar.getCuratedCourseId();
            long jLongValue = curatedCourseId != null ? curatedCourseId.longValue() : -1L;
            Long activityId = uVar.getActivityId();
            Long tripReportId = uVar.getTripReportId();
            rating = uVar.getRating();
            if (rating != null) {
                iIntValue = rating.intValue();
            } else {
                iIntValue = 0;
            }
            String strA = new pi0.e(context).a(new DateTime(millis), qi0.a.YEAR_ABBREV_MONTH_DAY);
            reviewComment = uVar.getReviewComment();
            if (reviewComment == null) {
                str2 = "";
            } else {
                str2 = reviewComment;
            }
            boolean zA = uVar.A();
            us1.h.a aVar2 = us1.h.f172403e;
            Integer difficulty = uVar.getDifficulty();
            aVar2.getClass();
            us1.h hVarA = us1.h.a.a(difficulty);
            listF = uVar.f();
            if (listF != null) {
                arrayList3 = new ArrayList();
                it = listF.iterator();
                while (it.hasNext()) {
                    str4 = (String) it.next();
                    us1.g.f172395c.getClass();
                    gVarArrValues = us1.g.values();
                    qs1.u uVar3 = uVar;
                    length = gVarArrValues.length;
                    Iterator it3 = it;
                    i14 = 0;
                    while (true) {
                        if (i14 < length) {
                            gVar = null;
                            break;
                        }
                        i15 = length;
                        gVar = gVarArrValues[i14];
                        i16 = i14;
                        if (p005kotlin.jvm.internal.s.g(gVar.f172401a, str4)) {
                            break;
                        }
                        i14 = i16 + 1;
                        length = i15;
                    }
                    if (gVar != null) {
                        arrayList3.add(gVar);
                    }
                    uVar = uVar3;
                    it = it3;
                }
                uVar2 = uVar;
                cVarB = i53.a.e(arrayList3);
                if (cVarB == null) {
                }
                i53.c cVar = cVarB;
                listU = uVar2.u();
                if (listU != null) {
                    arrayList2 = new ArrayList();
                    for (String str5 : listU) {
                        us1.i.f172411c.getClass();
                        iVarA = us1.i.a.a(str5);
                        if (iVarA != null) {
                            arrayList2.add(iVarA);
                        }
                    }
                    cVarB2 = i53.a.e(arrayList2);
                    if (cVarB2 == null) {
                        cVarB2 = j53.l.b();
                    }
                } else {
                    cVarB2 = j53.l.b();
                }
                i53.c cVar2 = cVarB2;
                listM = uVar2.m();
                if (listM != null) {
                    arrayList = new ArrayList(p13.y.r(listM, 10));
                    for (qs1.b bVar : listM) {
                        imageUrl = bVar.getImageUrl();
                        if (imageUrl == null) {
                            str3 = "";
                        } else {
                            str3 = imageUrl;
                        }
                        arrayList.add(new pt1.u(str3, bVar.getImageId(), null, null, 0.0d, 0, false, 124, null));
                    }
                    cVarB3 = i53.a.e(arrayList);
                    if (cVarB3 == null) {
                        cVarB3 = j53.l.b();
                    }
                } else {
                    cVarB3 = j53.l.b();
                }
                pt1.l lVar = new pt1.l(jLongValue, activityId, tripReportId, str, iIntValue, millis, strA, str2, zA, hVarA, cVar, cVar2, cVarB3, null, false, 24576, null);
                this.f147841a = null;
                this.f147842b = 3;
                p2Var.k(null, lVar);
            } else {
                uVar2 = uVar;
            }
            cVarB = j53.l.b();
            i53.c cVar3 = cVarB;
            listU = uVar2.u();
            if (listU != null) {
                arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                    us1.i.f172411c.getClass();
                    iVarA = us1.i.a.a(str5);
                    if (iVarA != null) {
                        arrayList2.add(iVarA);
                    }
                }
                cVarB2 = i53.a.e(arrayList2);
                if (cVarB2 == null) {
                    cVarB2 = j53.l.b();
                }
            } else {
                cVarB2 = j53.l.b();
            }
            i53.c cVar4 = cVarB2;
            listM = uVar2.m();
            if (listM != null) {
                arrayList = new ArrayList(p13.y.r(listM, 10));
                while (r2.hasNext()) {
                    imageUrl = bVar.getImageUrl();
                    if (imageUrl == null) {
                        str3 = "";
                    } else {
                        str3 = imageUrl;
                    }
                    arrayList.add(new pt1.u(str3, bVar.getImageId(), null, null, 0.0d, 0, false, 124, null));
                }
                cVarB3 = i53.a.e(arrayList);
                if (cVarB3 == null) {
                    cVarB3 = j53.l.b();
                }
            } else {
                cVarB3 = j53.l.b();
            }
            pt1.l lVar2 = new pt1.l(jLongValue, activityId, tripReportId, str, iIntValue, millis, strA, str2, zA, hVarA, cVar3, cVar4, cVarB3, null, false, 24576, null);
            this.f147841a = null;
            this.f147842b = 3;
            p2Var.k(null, lVar2);
        } else {
            if (i17 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        kVar.Q4(false);
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) objN0;
        if (v2Var2 instanceof v2.b) {
            uVar = (qs1.u) ((v2.b) v2Var2).f47386a;
            ss1.a aVar3 = kVar.f147666a;
            Long curatedCourseId2 = uVar.getCuratedCourseId();
            long jLongValue2 = curatedCourseId2 != null ? curatedCourseId2.longValue() : -1L;
            this.f147841a = uVar;
            this.f147842b = 2;
            objC3 = aVar3.c3(jLongValue2, this);
            if (objC3 != aVar) {
                v2Var = (v2) objC3;
                if (v2Var instanceof v2.b) {
                    str = "";
                } else {
                    str = "";
                }
                p2 p2Var2 = kVar.f147674i;
                lt1.j jVar2 = lt1.j.f114865a;
                activityDateMs = ((pt1.o) kVar.f147673h.getValue()).f140918p;
                if (activityDateMs != null) {
                    millis = activityDateMs.longValue();
                } else {
                    millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                }
                jVar2.getClass();
                uVar.getClass();
                Context context2 = this.f147845e;
                context2.getClass();
                Long curatedCourseId3 = uVar.getCuratedCourseId();
                if (curatedCourseId3 != null) {
                }
                Long activityId2 = uVar.getActivityId();
                Long tripReportId2 = uVar.getTripReportId();
                rating = uVar.getRating();
                if (rating != null) {
                    iIntValue = rating.intValue();
                } else {
                    iIntValue = 0;
                }
                String strA2 = new pi0.e(context2).a(new DateTime(millis), qi0.a.YEAR_ABBREV_MONTH_DAY);
                reviewComment = uVar.getReviewComment();
                if (reviewComment == null) {
                    str2 = "";
                } else {
                    str2 = reviewComment;
                }
                boolean zA2 = uVar.A();
                us1.h.a aVar4 = us1.h.f172403e;
                Integer difficulty2 = uVar.getDifficulty();
                aVar4.getClass();
                us1.h hVarA2 = us1.h.a.a(difficulty2);
                listF = uVar.f();
                if (listF != null) {
                    arrayList3 = new ArrayList();
                    it = listF.iterator();
                    while (it.hasNext()) {
                        str4 = (String) it.next();
                        us1.g.f172395c.getClass();
                        gVarArrValues = us1.g.values();
                        qs1.u uVar4 = uVar;
                        length = gVarArrValues.length;
                        Iterator it4 = it;
                        i14 = 0;
                        while (true) {
                            if (i14 < length) {
                                gVar = null;
                                break;
                            }
                            i15 = length;
                            gVar = gVarArrValues[i14];
                            i16 = i14;
                            if (p005kotlin.jvm.internal.s.g(gVar.f172401a, str4)) {
                                break;
                                break;
                            }
                            i14 = i16 + 1;
                            length = i15;
                        }
                        if (gVar != null) {
                            arrayList3.add(gVar);
                        }
                        uVar = uVar4;
                        it = it4;
                    }
                    uVar2 = uVar;
                    cVarB = i53.a.e(arrayList3);
                    if (cVarB == null) {
                    }
                    i53.c cVar5 = cVarB;
                    listU = uVar2.u();
                    if (listU != null) {
                        arrayList2 = new ArrayList();
                        while (r2.hasNext()) {
                            us1.i.f172411c.getClass();
                            iVarA = us1.i.a.a(str5);
                            if (iVarA != null) {
                                arrayList2.add(iVarA);
                            }
                        }
                        cVarB2 = i53.a.e(arrayList2);
                        if (cVarB2 == null) {
                            cVarB2 = j53.l.b();
                        }
                    } else {
                        cVarB2 = j53.l.b();
                    }
                    i53.c cVar6 = cVarB2;
                    listM = uVar2.m();
                    if (listM != null) {
                        arrayList = new ArrayList(p13.y.r(listM, 10));
                        while (r2.hasNext()) {
                            imageUrl = bVar.getImageUrl();
                            if (imageUrl == null) {
                                str3 = "";
                            } else {
                                str3 = imageUrl;
                            }
                            arrayList.add(new pt1.u(str3, bVar.getImageId(), null, null, 0.0d, 0, false, 124, null));
                        }
                        cVarB3 = i53.a.e(arrayList);
                        if (cVarB3 == null) {
                            cVarB3 = j53.l.b();
                        }
                    } else {
                        cVarB3 = j53.l.b();
                    }
                    pt1.l lVar3 = new pt1.l(jLongValue, activityId2, tripReportId2, str, iIntValue, millis, strA2, str2, zA2, hVarA2, cVar5, cVar6, cVarB3, null, false, 24576, null);
                    this.f147841a = null;
                    this.f147842b = 3;
                    p2Var2.k(null, lVar3);
                } else {
                    uVar2 = uVar;
                }
                cVarB = j53.l.b();
                i53.c cVar7 = cVarB;
                listU = uVar2.u();
                if (listU != null) {
                    arrayList2 = new ArrayList();
                    while (r2.hasNext()) {
                        us1.i.f172411c.getClass();
                        iVarA = us1.i.a.a(str5);
                        if (iVarA != null) {
                            arrayList2.add(iVarA);
                        }
                    }
                    cVarB2 = i53.a.e(arrayList2);
                    if (cVarB2 == null) {
                        cVarB2 = j53.l.b();
                    }
                } else {
                    cVarB2 = j53.l.b();
                }
                i53.c cVar8 = cVarB2;
                listM = uVar2.m();
                if (listM != null) {
                    arrayList = new ArrayList(p13.y.r(listM, 10));
                    while (r2.hasNext()) {
                        imageUrl = bVar.getImageUrl();
                        if (imageUrl == null) {
                            str3 = "";
                        } else {
                            str3 = imageUrl;
                        }
                        arrayList.add(new pt1.u(str3, bVar.getImageId(), null, null, 0.0d, 0, false, 124, null));
                    }
                    cVarB3 = i53.a.e(arrayList);
                    if (cVarB3 == null) {
                        cVarB3 = j53.l.b();
                    }
                } else {
                    cVarB3 = j53.l.b();
                }
                pt1.l lVar4 = new pt1.l(jLongValue, activityId2, tripReportId2, str, iIntValue, millis, strA2, str2, zA2, hVarA2, cVar7, cVar8, cVarB3, null, false, 24576, null);
                this.f147841a = null;
                this.f147842b = 3;
                p2Var2.k(null, lVar4);
            }
            return aVar;
        }
        kVar.Q4(false);
        return Unit.INSTANCE;
    }
}
