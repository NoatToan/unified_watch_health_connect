package vs1;

import android.content.Context;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.UserReviewsUseCase$fetchUserReviews$1", f = "UserReviewsUseCase.kt", l = {37, 43, 45, 60}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f179826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f179827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f179828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h0 h0Var, boolean z14, Context context, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f179826b = h0Var;
        this.f179827c = z14;
        this.f179828d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f179826b, this.f179827c, this.f179828d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x027f  */
    /* JADX WARN: Code duplicated, block: B:106:0x028e  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:125:0x02da  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:132:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:136:0x0300  */
    /* JADX WARN: Code duplicated, block: B:145:0x0320  */
    /* JADX WARN: Code duplicated, block: B:150:0x035b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0392  */
    /* JADX WARN: Code duplicated, block: B:157:0x0397  */
    /* JADX WARN: Code duplicated, block: B:167:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x01c8 A[EDGE_INSN: B:169:0x01c8->B:77:0x01c8 BREAK  A[LOOP:2: B:70:0x01a8->B:75:0x01c1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0084 A[PHI: r2
      0x0084: PHI (r2v7 java.lang.Object) = (r2v6 java.lang.Object), (r2v47 java.lang.Object) binds: [B:22:0x0080, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00db  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:40:0x010a  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x012c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0144  */
    /* JADX WARN: Code duplicated, block: B:48:0x014b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0153  */
    /* JADX WARN: Code duplicated, block: B:54:0x0161  */
    /* JADX WARN: Code duplicated, block: B:55:0x0164  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177  */
    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0182  */
    /* JADX WARN: Code duplicated, block: B:66:0x018b  */
    /* JADX WARN: Code duplicated, block: B:69:0x019a  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c1 A[LOOP:2: B:70:0x01a8->B:75:0x01c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:83:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:99:0x026e  */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03b8, code lost:
    
        if (r2.emit(r3, r64) == r1) goto L159;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00b0, please report this as an issue */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objB1;
        v2 v2Var;
        z1<pt1.a0> z1Var;
        List list;
        z1<pt1.a0> z1Var2;
        boolean z14;
        i53.c cVarB;
        pt1.a0 a0VarA;
        boolean z15;
        ArrayList arrayList;
        int i14;
        Iterator it;
        qs1.u uVar;
        Context context;
        Long activityDateMs;
        long jLongValue;
        String strA;
        us1.h hVarA;
        int i15;
        String string;
        Long tripReportId;
        long jLongValue2;
        String courseName;
        String str;
        Integer rating;
        int iIntValue;
        String reviewComment;
        String str2;
        List<String> listU;
        boolean z16;
        List<qs1.b> listM;
        Iterator it3;
        ArrayList arrayList2;
        qs1.u uVar2;
        i53.c cVarB2;
        List<String> listF;
        i53.c cVarB3;
        Integer helpfulRatingCount;
        int iIntValue2;
        String courseName2;
        String str3;
        Boolean hidden;
        boolean zBooleanValue;
        List<qs1.b> listM2;
        boolean z17;
        ArrayList arrayList3;
        List listM0;
        Iterator<T> it4;
        Object next;
        us1.g gVar;
        List listN0;
        ArrayList arrayList4;
        List listM1;
        Iterator<T> it5;
        boolean z18;
        Object next2;
        us1.i iVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f179825a;
        boolean z19 = true;
        h0 h0Var = this.f179826b;
        if (i16 == 0) {
            o13.r.b(obj);
            if (!h0Var.f179818h || this.f179827c) {
                z1<pt1.a0> z1Var3 = h0Var.f179815e;
                pt1.a0 a0VarA2 = pt1.a0.a(z1Var3.getValue(), true, false, false, null, (us1.o) us1.o.f172455h.get(h0Var.f179816f.i2(0, "userTrailsSortOrder")), null, null, null, null, false, false, 2030);
                this.f179825a = 1;
                if (z1Var3.emit(a0VarA2, this) != aVar) {
                    ss1.a0 a0Var = h0Var.f179813c;
                    this.f179825a = 2;
                    objB1 = a0Var.b1(this);
                    if (objB1 != aVar) {
                        v2Var = (v2) objB1;
                        if (v2Var instanceof v2.b) {
                            z1Var = h0Var.f179815e;
                            pt1.a0 value = z1Var.getValue();
                            list = (List) ((v2.b) v2Var).f47386a;
                            if (list != null) {
                                i14 = 10;
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    uVar = (qs1.u) it.next();
                                    lt1.j.f114865a.getClass();
                                    uVar.getClass();
                                    context = this.f179828d;
                                    context.getClass();
                                    pi0.e eVar = new pi0.e(context);
                                    activityDateMs = uVar.getActivityDateMs();
                                    if (activityDateMs != null) {
                                        jLongValue = activityDateMs.longValue();
                                    } else {
                                        jLongValue = 0;
                                    }
                                    strA = eVar.a(new DateTime(jLongValue), qi0.a.YEAR_ABBREV_MONTH_DAY);
                                    Long activityDateMs2 = uVar.getActivityDateMs();
                                    long jLongValue3 = activityDateMs2 != null ? activityDateMs2.longValue() : 0L;
                                    String string2 = context.getString(R.string.common_difficulty);
                                    us1.h.a aVar2 = us1.h.f172403e;
                                    Integer difficulty = uVar.getDifficulty();
                                    aVar2.getClass();
                                    hVarA = us1.h.a.a(difficulty);
                                    if (hVarA != null) {
                                        i15 = hVarA.f172408b;
                                    } else {
                                        i15 = R.string.no_value;
                                    }
                                    string = context.getString(R.string.string_colon_string_pattern, string2, context.getString(i15));
                                    string.getClass();
                                    if (us1.h.a.a(uVar.getDifficulty()) != null) {
                                        strA = context.getString(R.string.string_space_dot_space_string_pattern, strA, string);
                                    }
                                    String str4 = strA;
                                    str4.getClass();
                                    tripReportId = uVar.getTripReportId();
                                    if (tripReportId != null) {
                                        jLongValue2 = tripReportId.longValue();
                                    } else {
                                        jLongValue2 = -1;
                                    }
                                    Long curatedCourseId = uVar.getCuratedCourseId();
                                    long jLongValue4 = curatedCourseId != null ? curatedCourseId.longValue() : -1L;
                                    courseName = uVar.getCourseName();
                                    if (courseName == null) {
                                        str = "";
                                    } else {
                                        str = courseName;
                                    }
                                    String profileImage = uVar.getProfileImage();
                                    rating = uVar.getRating();
                                    if (rating != null) {
                                        iIntValue = rating.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    reviewComment = uVar.getReviewComment();
                                    if (reviewComment == null) {
                                        str2 = "";
                                    } else {
                                        str2 = reviewComment;
                                    }
                                    listU = uVar.u();
                                    Boolean bool = null;
                                    if (listU != null) {
                                        arrayList4 = new ArrayList();
                                        for (String str5 : listU) {
                                            it5 = us1.i.f172416h.iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    z18 = z19;
                                                    next2 = null;
                                                    break;
                                                }
                                                next2 = it5.next();
                                                z18 = z19;
                                                if (p005kotlin.jvm.internal.s.g(((us1.i) next2).f172417a, str5)) {
                                                    break;
                                                    break;
                                                }
                                                z19 = z18;
                                            }
                                            iVar = (us1.i) next2;
                                            if (iVar != null) {
                                                arrayList4.add(iVar);
                                            }
                                            z19 = z18;
                                        }
                                        z16 = z19;
                                        listM1 = p13.h0.M0(arrayList4);
                                        if (listM1 != null) {
                                        }
                                        i53.c cVar = cVarB;
                                        listM = uVar.m();
                                        if (listM != null) {
                                            it3 = it;
                                            arrayList2 = arrayList;
                                            uVar2 = uVar;
                                            cVarB2 = j53.l.b();
                                        } else {
                                            it3 = it;
                                            arrayList2 = arrayList;
                                            uVar2 = uVar;
                                            cVarB2 = j53.l.b();
                                        }
                                        i53.c cVar2 = cVarB2;
                                        listF = uVar2.f();
                                        if (listF != null) {
                                            arrayList3 = new ArrayList();
                                            for (String str6 : listF) {
                                                it4 = us1.g.f172400h.iterator();
                                                do {
                                                    if (!it4.hasNext()) {
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it4.next();
                                                } while (!p005kotlin.jvm.internal.s.g(((us1.g) next).f172401a, str6));
                                                gVar = (us1.g) next;
                                                if (gVar != null) {
                                                    arrayList3.add(gVar);
                                                }
                                            }
                                            listM0 = p13.h0.M0(arrayList3);
                                            if (listM0 != null) {
                                                cVarB3 = j53.l.b();
                                            } else {
                                                cVarB3 = j53.l.b();
                                            }
                                        } else {
                                            cVarB3 = j53.l.b();
                                        }
                                        i53.c cVar3 = cVarB3;
                                        helpfulRatingCount = uVar2.getHelpfulRatingCount();
                                        if (helpfulRatingCount != null) {
                                            iIntValue2 = helpfulRatingCount.intValue();
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        courseName2 = uVar2.getCourseName();
                                        if (courseName2 == null) {
                                            str3 = "";
                                        } else {
                                            str3 = courseName2;
                                        }
                                        boolean zA = uVar2.A();
                                        hidden = uVar2.getHidden();
                                        if (hidden != null) {
                                            zBooleanValue = hidden.booleanValue();
                                        } else {
                                            zBooleanValue = false;
                                        }
                                        listM2 = uVar2.m();
                                        if (listM2 != null) {
                                            z17 = false;
                                            break;
                                            break;
                                        }
                                        z17 = false;
                                        break;
                                        break;
                                        ArrayList arrayList5 = arrayList2;
                                        arrayList5.add(new pt1.x(jLongValue2, jLongValue4, str, profileImage, str4, iIntValue, str2, cVar, cVar2, cVar3, iIntValue2, false, null, null, str3, true, zA, jLongValue3, "", zBooleanValue, z17, !s3.b(), 12288, null));
                                        arrayList = arrayList5;
                                        it = it3;
                                        z1Var = z1Var;
                                        z19 = z16;
                                        i14 = 10;
                                    } else {
                                        z16 = z19;
                                    }
                                    i53.c cVarB4 = j53.l.b();
                                    i53.c cVar4 = cVarB4;
                                    listM = uVar.m();
                                    if (listM != null) {
                                        it3 = it;
                                        arrayList2 = arrayList;
                                        uVar2 = uVar;
                                        cVarB2 = j53.l.b();
                                    } else {
                                        it3 = it;
                                        arrayList2 = arrayList;
                                        uVar2 = uVar;
                                        cVarB2 = j53.l.b();
                                    }
                                    i53.c cVar5 = cVarB2;
                                    listF = uVar2.f();
                                    if (listF != null) {
                                        arrayList3 = new ArrayList();
                                        while (r2.hasNext()) {
                                            it4 = us1.g.f172400h.iterator();
                                            do {
                                                if (!it4.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it4.next();
                                            } while (!p005kotlin.jvm.internal.s.g(((us1.g) next).f172401a, str6));
                                            gVar = (us1.g) next;
                                            if (gVar != null) {
                                                arrayList3.add(gVar);
                                            }
                                        }
                                        listM0 = p13.h0.M0(arrayList3);
                                        if (listM0 != null) {
                                            cVarB3 = j53.l.b();
                                        } else {
                                            cVarB3 = j53.l.b();
                                        }
                                    } else {
                                        cVarB3 = j53.l.b();
                                    }
                                    i53.c cVar6 = cVarB3;
                                    helpfulRatingCount = uVar2.getHelpfulRatingCount();
                                    if (helpfulRatingCount != null) {
                                        iIntValue2 = helpfulRatingCount.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    courseName2 = uVar2.getCourseName();
                                    if (courseName2 == null) {
                                        str3 = "";
                                    } else {
                                        str3 = courseName2;
                                    }
                                    boolean zA2 = uVar2.A();
                                    hidden = uVar2.getHidden();
                                    if (hidden != null) {
                                        zBooleanValue = hidden.booleanValue();
                                    } else {
                                        zBooleanValue = false;
                                    }
                                    listM2 = uVar2.m();
                                    if (listM2 != null) {
                                        z17 = false;
                                        break;
                                        break;
                                    }
                                    z17 = false;
                                    break;
                                    break;
                                    ArrayList arrayList6 = arrayList2;
                                    arrayList6.add(new pt1.x(jLongValue2, jLongValue4, str, profileImage, str4, iIntValue, str2, cVar4, cVar5, cVar6, iIntValue2, false, null, null, str3, true, zA2, jLongValue3, "", zBooleanValue, z17, !s3.b(), 12288, null));
                                    arrayList = arrayList6;
                                    it = it3;
                                    z1Var = z1Var;
                                    z19 = z16;
                                    i14 = 10;
                                }
                                z1Var2 = z1Var;
                                z14 = z19;
                                cVarB = i53.a.e(arrayList);
                                if (cVarB == null) {
                                }
                                a0VarA = pt1.a0.a(value, false, false, false, h0.a(h0Var, cVarB, h0Var.f179815e.getValue().f140807e), null, null, null, null, null, false, false, 2038);
                                this.f179825a = 3;
                                if (z1Var2.emit(a0VarA, this) != aVar) {
                                    z15 = z14;
                                    h0Var.f179818h = z15;
                                }
                            } else {
                                z1Var2 = z1Var;
                                z14 = true;
                            }
                            cVarB = j53.l.b();
                            a0VarA = pt1.a0.a(value, false, false, false, h0.a(h0Var, cVarB, h0Var.f179815e.getValue().f140807e), null, null, null, null, null, false, false, 2038);
                            this.f179825a = 3;
                            if (z1Var2.emit(a0VarA, this) != aVar) {
                                z15 = z14;
                                h0Var.f179818h = z15;
                            }
                        } else {
                            z1<pt1.a0> z1Var4 = h0Var.f179815e;
                            pt1.a0 a0VarA3 = pt1.a0.a(z1Var4.getValue(), false, false, true, null, null, null, null, null, null, false, false, 2042);
                            this.f179825a = 4;
                        }
                    }
                }
                return aVar;
            }
        } else {
            if (i16 == 1) {
                o13.r.b(obj);
                ss1.a0 a0Var2 = h0Var.f179813c;
                this.f179825a = 2;
                objB1 = a0Var2.b1(this);
                if (objB1 != aVar) {
                    v2Var = (v2) objB1;
                    if (v2Var instanceof v2.b) {
                        z1Var = h0Var.f179815e;
                        pt1.a0 value2 = z1Var.getValue();
                        list = (List) ((v2.b) v2Var).f47386a;
                        if (list != null) {
                            i14 = 10;
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                uVar = (qs1.u) it.next();
                                lt1.j.f114865a.getClass();
                                uVar.getClass();
                                context = this.f179828d;
                                context.getClass();
                                pi0.e eVar2 = new pi0.e(context);
                                activityDateMs = uVar.getActivityDateMs();
                                if (activityDateMs != null) {
                                    jLongValue = activityDateMs.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                strA = eVar2.a(new DateTime(jLongValue), qi0.a.YEAR_ABBREV_MONTH_DAY);
                                Long activityDateMs3 = uVar.getActivityDateMs();
                                long jLongValue5 = activityDateMs3 != null ? activityDateMs3.longValue() : 0L;
                                String string3 = context.getString(R.string.common_difficulty);
                                us1.h.a aVar3 = us1.h.f172403e;
                                Integer difficulty2 = uVar.getDifficulty();
                                aVar3.getClass();
                                hVarA = us1.h.a.a(difficulty2);
                                if (hVarA != null) {
                                    i15 = hVarA.f172408b;
                                } else {
                                    i15 = R.string.no_value;
                                }
                                string = context.getString(R.string.string_colon_string_pattern, string3, context.getString(i15));
                                string.getClass();
                                if (us1.h.a.a(uVar.getDifficulty()) != null) {
                                    strA = context.getString(R.string.string_space_dot_space_string_pattern, strA, string);
                                }
                                String str7 = strA;
                                str7.getClass();
                                tripReportId = uVar.getTripReportId();
                                if (tripReportId != null) {
                                    jLongValue2 = tripReportId.longValue();
                                } else {
                                    jLongValue2 = -1;
                                }
                                Long curatedCourseId2 = uVar.getCuratedCourseId();
                                long jLongValue6 = curatedCourseId2 != null ? curatedCourseId2.longValue() : -1L;
                                courseName = uVar.getCourseName();
                                if (courseName == null) {
                                    str = "";
                                } else {
                                    str = courseName;
                                }
                                String profileImage2 = uVar.getProfileImage();
                                rating = uVar.getRating();
                                if (rating != null) {
                                    iIntValue = rating.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                reviewComment = uVar.getReviewComment();
                                if (reviewComment == null) {
                                    str2 = "";
                                } else {
                                    str2 = reviewComment;
                                }
                                listU = uVar.u();
                                Boolean bool2 = null;
                                if (listU != null) {
                                    arrayList4 = new ArrayList();
                                    while (r3.hasNext()) {
                                        it5 = us1.i.f172416h.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                z18 = z19;
                                                next2 = null;
                                                break;
                                            }
                                            next2 = it5.next();
                                            z18 = z19;
                                            if (p005kotlin.jvm.internal.s.g(((us1.i) next2).f172417a, str5)) {
                                                break;
                                                break;
                                            }
                                            z19 = z18;
                                        }
                                        iVar = (us1.i) next2;
                                        if (iVar != null) {
                                            arrayList4.add(iVar);
                                        }
                                        z19 = z18;
                                    }
                                    z16 = z19;
                                    listM1 = p13.h0.M0(arrayList4);
                                    if (listM1 != null) {
                                    }
                                    i53.c cVar7 = cVarB4;
                                    listM = uVar.m();
                                    if (listM != null) {
                                        it3 = it;
                                        arrayList2 = arrayList;
                                        uVar2 = uVar;
                                        cVarB2 = j53.l.b();
                                    } else {
                                        it3 = it;
                                        arrayList2 = arrayList;
                                        uVar2 = uVar;
                                        cVarB2 = j53.l.b();
                                    }
                                    i53.c cVar8 = cVarB2;
                                    listF = uVar2.f();
                                    if (listF != null) {
                                        arrayList3 = new ArrayList();
                                        while (r2.hasNext()) {
                                            it4 = us1.g.f172400h.iterator();
                                            do {
                                                if (!it4.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it4.next();
                                            } while (!p005kotlin.jvm.internal.s.g(((us1.g) next).f172401a, str6));
                                            gVar = (us1.g) next;
                                            if (gVar != null) {
                                                arrayList3.add(gVar);
                                            }
                                        }
                                        listM0 = p13.h0.M0(arrayList3);
                                        if (listM0 != null) {
                                            cVarB3 = j53.l.b();
                                        } else {
                                            cVarB3 = j53.l.b();
                                        }
                                    } else {
                                        cVarB3 = j53.l.b();
                                    }
                                    i53.c cVar9 = cVarB3;
                                    helpfulRatingCount = uVar2.getHelpfulRatingCount();
                                    if (helpfulRatingCount != null) {
                                        iIntValue2 = helpfulRatingCount.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    courseName2 = uVar2.getCourseName();
                                    if (courseName2 == null) {
                                        str3 = "";
                                    } else {
                                        str3 = courseName2;
                                    }
                                    boolean zA3 = uVar2.A();
                                    hidden = uVar2.getHidden();
                                    if (hidden != null) {
                                        zBooleanValue = hidden.booleanValue();
                                    } else {
                                        zBooleanValue = false;
                                    }
                                    listM2 = uVar2.m();
                                    if (listM2 != null) {
                                        z17 = false;
                                        break;
                                        break;
                                    }
                                    z17 = false;
                                    break;
                                    break;
                                    ArrayList arrayList7 = arrayList2;
                                    arrayList7.add(new pt1.x(jLongValue2, jLongValue6, str, profileImage2, str7, iIntValue, str2, cVar7, cVar8, cVar9, iIntValue2, false, null, null, str3, true, zA3, jLongValue5, "", zBooleanValue, z17, !s3.b(), 12288, null));
                                    arrayList = arrayList7;
                                    it = it3;
                                    z1Var = z1Var;
                                    z19 = z16;
                                    i14 = 10;
                                } else {
                                    z16 = z19;
                                }
                                i53.c cVarB5 = j53.l.b();
                                i53.c cVar10 = cVarB5;
                                listM = uVar.m();
                                if (listM != null) {
                                    it3 = it;
                                    arrayList2 = arrayList;
                                    uVar2 = uVar;
                                    cVarB2 = j53.l.b();
                                } else {
                                    it3 = it;
                                    arrayList2 = arrayList;
                                    uVar2 = uVar;
                                    cVarB2 = j53.l.b();
                                }
                                i53.c cVar11 = cVarB2;
                                listF = uVar2.f();
                                if (listF != null) {
                                    arrayList3 = new ArrayList();
                                    while (r2.hasNext()) {
                                        it4 = us1.g.f172400h.iterator();
                                        do {
                                            if (!it4.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it4.next();
                                        } while (!p005kotlin.jvm.internal.s.g(((us1.g) next).f172401a, str6));
                                        gVar = (us1.g) next;
                                        if (gVar != null) {
                                            arrayList3.add(gVar);
                                        }
                                    }
                                    listM0 = p13.h0.M0(arrayList3);
                                    if (listM0 != null) {
                                        cVarB3 = j53.l.b();
                                    } else {
                                        cVarB3 = j53.l.b();
                                    }
                                } else {
                                    cVarB3 = j53.l.b();
                                }
                                i53.c cVar12 = cVarB3;
                                helpfulRatingCount = uVar2.getHelpfulRatingCount();
                                if (helpfulRatingCount != null) {
                                    iIntValue2 = helpfulRatingCount.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                courseName2 = uVar2.getCourseName();
                                if (courseName2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = courseName2;
                                }
                                boolean zA4 = uVar2.A();
                                hidden = uVar2.getHidden();
                                if (hidden != null) {
                                    zBooleanValue = hidden.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                                listM2 = uVar2.m();
                                if (listM2 != null) {
                                    z17 = false;
                                    break;
                                    break;
                                }
                                z17 = false;
                                break;
                                break;
                                ArrayList arrayList8 = arrayList2;
                                arrayList8.add(new pt1.x(jLongValue2, jLongValue6, str, profileImage2, str7, iIntValue, str2, cVar10, cVar11, cVar12, iIntValue2, false, null, null, str3, true, zA4, jLongValue5, "", zBooleanValue, z17, !s3.b(), 12288, null));
                                arrayList = arrayList8;
                                it = it3;
                                z1Var = z1Var;
                                z19 = z16;
                                i14 = 10;
                            }
                            z1Var2 = z1Var;
                            z14 = z19;
                            cVarB = i53.a.e(arrayList);
                            if (cVarB == null) {
                            }
                            a0VarA = pt1.a0.a(value2, false, false, false, h0.a(h0Var, cVarB, h0Var.f179815e.getValue().f140807e), null, null, null, null, null, false, false, 2038);
                            this.f179825a = 3;
                            if (z1Var2.emit(a0VarA, this) != aVar) {
                                z15 = z14;
                                h0Var.f179818h = z15;
                            }
                        } else {
                            z1Var2 = z1Var;
                            z14 = true;
                        }
                        cVarB = j53.l.b();
                        a0VarA = pt1.a0.a(value2, false, false, false, h0.a(h0Var, cVarB, h0Var.f179815e.getValue().f140807e), null, null, null, null, null, false, false, 2038);
                        this.f179825a = 3;
                        if (z1Var2.emit(a0VarA, this) != aVar) {
                            z15 = z14;
                            h0Var.f179818h = z15;
                        }
                    } else {
                        z1<pt1.a0> z1Var5 = h0Var.f179815e;
                        pt1.a0 a0VarA4 = pt1.a0.a(z1Var5.getValue(), false, false, true, null, null, null, null, null, null, false, false, 2042);
                        this.f179825a = 4;
                    }
                }
                return aVar;
            }
            if (i16 == 2) {
                o13.r.b(obj);
                objB1 = obj;
                v2Var = (v2) objB1;
                if (v2Var instanceof v2.b) {
                    z1Var = h0Var.f179815e;
                    pt1.a0 value3 = z1Var.getValue();
                    list = (List) ((v2.b) v2Var).f47386a;
                    if (list != null) {
                        i14 = 10;
                        arrayList = new ArrayList(p13.y.r(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            uVar = (qs1.u) it.next();
                            lt1.j.f114865a.getClass();
                            uVar.getClass();
                            context = this.f179828d;
                            context.getClass();
                            pi0.e eVar3 = new pi0.e(context);
                            activityDateMs = uVar.getActivityDateMs();
                            if (activityDateMs != null) {
                                jLongValue = activityDateMs.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            strA = eVar3.a(new DateTime(jLongValue), qi0.a.YEAR_ABBREV_MONTH_DAY);
                            Long activityDateMs4 = uVar.getActivityDateMs();
                            long jLongValue7 = activityDateMs4 != null ? activityDateMs4.longValue() : 0L;
                            String string4 = context.getString(R.string.common_difficulty);
                            us1.h.a aVar4 = us1.h.f172403e;
                            Integer difficulty3 = uVar.getDifficulty();
                            aVar4.getClass();
                            hVarA = us1.h.a.a(difficulty3);
                            if (hVarA != null) {
                                i15 = hVarA.f172408b;
                            } else {
                                i15 = R.string.no_value;
                            }
                            string = context.getString(R.string.string_colon_string_pattern, string4, context.getString(i15));
                            string.getClass();
                            if (us1.h.a.a(uVar.getDifficulty()) != null) {
                                strA = context.getString(R.string.string_space_dot_space_string_pattern, strA, string);
                            }
                            String str8 = strA;
                            str8.getClass();
                            tripReportId = uVar.getTripReportId();
                            if (tripReportId != null) {
                                jLongValue2 = tripReportId.longValue();
                            } else {
                                jLongValue2 = -1;
                            }
                            Long curatedCourseId3 = uVar.getCuratedCourseId();
                            long jLongValue8 = curatedCourseId3 != null ? curatedCourseId3.longValue() : -1L;
                            courseName = uVar.getCourseName();
                            if (courseName == null) {
                                str = "";
                            } else {
                                str = courseName;
                            }
                            String profileImage3 = uVar.getProfileImage();
                            rating = uVar.getRating();
                            if (rating != null) {
                                iIntValue = rating.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            reviewComment = uVar.getReviewComment();
                            if (reviewComment == null) {
                                str2 = "";
                            } else {
                                str2 = reviewComment;
                            }
                            listU = uVar.u();
                            Boolean bool3 = null;
                            if (listU != null) {
                                arrayList4 = new ArrayList();
                                while (r3.hasNext()) {
                                    it5 = us1.i.f172416h.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            z18 = z19;
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it5.next();
                                        z18 = z19;
                                        if (p005kotlin.jvm.internal.s.g(((us1.i) next2).f172417a, str5)) {
                                            break;
                                        }
                                        z19 = z18;
                                    }
                                    iVar = (us1.i) next2;
                                    if (iVar != null) {
                                        arrayList4.add(iVar);
                                    }
                                    z19 = z18;
                                }
                                z16 = z19;
                                listM1 = p13.h0.M0(arrayList4);
                                if (listM1 != null || (cVarB5 = i53.a.e(listM1)) == null) {
                                }
                                i53.c cVar13 = cVarB5;
                                listM = uVar.m();
                                if (listM != null || (listN0 = p13.h0.N0(listM, new lt1.k())) == null) {
                                    it3 = it;
                                    arrayList2 = arrayList;
                                    uVar2 = uVar;
                                } else {
                                    ArrayList arrayList9 = new ArrayList(p13.y.r(listN0, i14));
                                    Iterator it6 = listN0.iterator();
                                    while (it6.hasNext()) {
                                        kt1.b bVarP = ge1.b.p((qs1.b) it6.next(), new pi0.e(context), bool3);
                                        long j8 = bVarP.f106447a;
                                        String str9 = bVarP.f106448b;
                                        String str10 = bVarP.f106449c;
                                        long j14 = bVarP.f106450d;
                                        Iterator it7 = it;
                                        String str11 = bVarP.f106451e;
                                        int i17 = bVarP.f106452f;
                                        int i18 = bVarP.f106453g;
                                        boolean z24 = bVarP.f106454h;
                                        str11.getClass();
                                        arrayList9.add(new kt1.b(j8, str9, str10, j14, str11, i17, i18, z24, true));
                                        uVar = uVar;
                                        arrayList = arrayList;
                                        it = it7;
                                        bool3 = null;
                                    }
                                    it3 = it;
                                    arrayList2 = arrayList;
                                    uVar2 = uVar;
                                    cVarB2 = i53.a.e(arrayList9);
                                    if (cVarB2 == null) {
                                    }
                                    i53.c cVar14 = cVarB2;
                                    listF = uVar2.f();
                                    if (listF != null) {
                                        arrayList3 = new ArrayList();
                                        while (r2.hasNext()) {
                                            it4 = us1.g.f172400h.iterator();
                                            do {
                                                if (!it4.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it4.next();
                                            } while (!p005kotlin.jvm.internal.s.g(((us1.g) next).f172401a, str6));
                                            gVar = (us1.g) next;
                                            if (gVar != null) {
                                                arrayList3.add(gVar);
                                            }
                                        }
                                        listM0 = p13.h0.M0(arrayList3);
                                        if (listM0 != null || (cVarB3 = i53.a.e(listM0)) == null) {
                                            cVarB3 = j53.l.b();
                                        }
                                    } else {
                                        cVarB3 = j53.l.b();
                                    }
                                    i53.c cVar15 = cVarB3;
                                    helpfulRatingCount = uVar2.getHelpfulRatingCount();
                                    if (helpfulRatingCount != null) {
                                        iIntValue2 = helpfulRatingCount.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    courseName2 = uVar2.getCourseName();
                                    if (courseName2 == null) {
                                        str3 = "";
                                    } else {
                                        str3 = courseName2;
                                    }
                                    boolean zA5 = uVar2.A();
                                    hidden = uVar2.getHidden();
                                    if (hidden != null) {
                                        zBooleanValue = hidden.booleanValue();
                                    } else {
                                        zBooleanValue = false;
                                    }
                                    listM2 = uVar2.m();
                                    if (listM2 != null || listM2.isEmpty()) {
                                        z17 = false;
                                        break;
                                    }
                                    Iterator<T> it8 = listM2.iterator();
                                    while (true) {
                                        if (!it8.hasNext()) {
                                            z17 = false;
                                            break;
                                            break;
                                        }
                                        if (((qs1.b) it8.next()).getHidden()) {
                                            z17 = z16;
                                            break;
                                        }
                                    }
                                    ArrayList arrayList10 = arrayList2;
                                    arrayList10.add(new pt1.x(jLongValue2, jLongValue8, str, profileImage3, str8, iIntValue, str2, cVar13, cVar14, cVar15, iIntValue2, false, null, null, str3, true, zA5, jLongValue7, "", zBooleanValue, z17, !s3.b(), 12288, null));
                                    arrayList = arrayList10;
                                    it = it3;
                                    z1Var = z1Var;
                                    z19 = z16;
                                    i14 = 10;
                                }
                                cVarB2 = j53.l.b();
                                i53.c cVar16 = cVarB2;
                                listF = uVar2.f();
                                if (listF != null) {
                                    arrayList3 = new ArrayList();
                                    while (r2.hasNext()) {
                                        it4 = us1.g.f172400h.iterator();
                                        do {
                                            if (!it4.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it4.next();
                                        } while (!p005kotlin.jvm.internal.s.g(((us1.g) next).f172401a, str6));
                                        gVar = (us1.g) next;
                                        if (gVar != null) {
                                            arrayList3.add(gVar);
                                        }
                                    }
                                    listM0 = p13.h0.M0(arrayList3);
                                    if (listM0 != null) {
                                        cVarB3 = j53.l.b();
                                    } else {
                                        cVarB3 = j53.l.b();
                                    }
                                } else {
                                    cVarB3 = j53.l.b();
                                }
                                i53.c cVar17 = cVarB3;
                                helpfulRatingCount = uVar2.getHelpfulRatingCount();
                                if (helpfulRatingCount != null) {
                                    iIntValue2 = helpfulRatingCount.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                courseName2 = uVar2.getCourseName();
                                if (courseName2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = courseName2;
                                }
                                boolean zA6 = uVar2.A();
                                hidden = uVar2.getHidden();
                                if (hidden != null) {
                                    zBooleanValue = hidden.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                                listM2 = uVar2.m();
                                if (listM2 != null) {
                                    z17 = false;
                                    break;
                                    break;
                                }
                                z17 = false;
                                break;
                                break;
                                ArrayList arrayList11 = arrayList2;
                                arrayList11.add(new pt1.x(jLongValue2, jLongValue8, str, profileImage3, str8, iIntValue, str2, cVar13, cVar16, cVar17, iIntValue2, false, null, null, str3, true, zA6, jLongValue7, "", zBooleanValue, z17, !s3.b(), 12288, null));
                                arrayList = arrayList11;
                                it = it3;
                                z1Var = z1Var;
                                z19 = z16;
                                i14 = 10;
                            } else {
                                z16 = z19;
                            }
                            i53.c cVarB6 = j53.l.b();
                            i53.c cVar18 = cVarB6;
                            listM = uVar.m();
                            if (listM != null) {
                                it3 = it;
                                arrayList2 = arrayList;
                                uVar2 = uVar;
                                cVarB2 = j53.l.b();
                            } else {
                                it3 = it;
                                arrayList2 = arrayList;
                                uVar2 = uVar;
                                cVarB2 = j53.l.b();
                            }
                            i53.c cVar19 = cVarB2;
                            listF = uVar2.f();
                            if (listF != null) {
                                arrayList3 = new ArrayList();
                                while (r2.hasNext()) {
                                    it4 = us1.g.f172400h.iterator();
                                    do {
                                        if (!it4.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it4.next();
                                    } while (!p005kotlin.jvm.internal.s.g(((us1.g) next).f172401a, str6));
                                    gVar = (us1.g) next;
                                    if (gVar != null) {
                                        arrayList3.add(gVar);
                                    }
                                }
                                listM0 = p13.h0.M0(arrayList3);
                                if (listM0 != null) {
                                    cVarB3 = j53.l.b();
                                } else {
                                    cVarB3 = j53.l.b();
                                }
                            } else {
                                cVarB3 = j53.l.b();
                            }
                            i53.c cVar110 = cVarB3;
                            helpfulRatingCount = uVar2.getHelpfulRatingCount();
                            if (helpfulRatingCount != null) {
                                iIntValue2 = helpfulRatingCount.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            courseName2 = uVar2.getCourseName();
                            if (courseName2 == null) {
                                str3 = "";
                            } else {
                                str3 = courseName2;
                            }
                            boolean zA7 = uVar2.A();
                            hidden = uVar2.getHidden();
                            if (hidden != null) {
                                zBooleanValue = hidden.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            listM2 = uVar2.m();
                            if (listM2 != null) {
                                z17 = false;
                                break;
                                break;
                            }
                            z17 = false;
                            break;
                            break;
                            ArrayList arrayList12 = arrayList2;
                            arrayList12.add(new pt1.x(jLongValue2, jLongValue8, str, profileImage3, str8, iIntValue, str2, cVar18, cVar19, cVar110, iIntValue2, false, null, null, str3, true, zA7, jLongValue7, "", zBooleanValue, z17, !s3.b(), 12288, null));
                            arrayList = arrayList12;
                            it = it3;
                            z1Var = z1Var;
                            z19 = z16;
                            i14 = 10;
                        }
                        z1Var2 = z1Var;
                        z14 = z19;
                        cVarB = i53.a.e(arrayList);
                        if (cVarB == null) {
                        }
                        a0VarA = pt1.a0.a(value3, false, false, false, h0.a(h0Var, cVarB, h0Var.f179815e.getValue().f140807e), null, null, null, null, null, false, false, 2038);
                        this.f179825a = 3;
                        if (z1Var2.emit(a0VarA, this) != aVar) {
                            z15 = z14;
                            h0Var.f179818h = z15;
                        }
                    } else {
                        z1Var2 = z1Var;
                        z14 = true;
                    }
                    cVarB = j53.l.b();
                    a0VarA = pt1.a0.a(value3, false, false, false, h0.a(h0Var, cVarB, h0Var.f179815e.getValue().f140807e), null, null, null, null, null, false, false, 2038);
                    this.f179825a = 3;
                    if (z1Var2.emit(a0VarA, this) != aVar) {
                        z15 = z14;
                        h0Var.f179818h = z15;
                    }
                } else {
                    z1<pt1.a0> z1Var6 = h0Var.f179815e;
                    pt1.a0 a0VarA5 = pt1.a0.a(z1Var6.getValue(), false, false, true, null, null, null, null, null, null, false, false, 2042);
                    this.f179825a = 4;
                }
                return aVar;
            }
            if (i16 == 3) {
                o13.r.b(obj);
                z15 = true;
                h0Var.f179818h = z15;
            } else {
                if (i16 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
    }
}
