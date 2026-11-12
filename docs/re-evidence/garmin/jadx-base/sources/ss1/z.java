package ss1;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lss1/z;", "Lss1/a;", "Lps1/a;", "trailsApi", "Ld60/a;", "coursesApi", "<init>", "(Lps1/a;Ld60/a;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f160773c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps1.a f160774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d60.a f160775b;

    public z(ps1.a aVar, d60.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f160774a = aVar;
        this.f160775b = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:
    
        if (r0 == r7) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ss1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C3(String str, String str2, String str3, v13.c cVar) {
        m mVar;
        qs1.d dVar;
        List<GeoPointDTO> list;
        ArrayList arrayList;
        ArrayList arrayList2;
        Double d14;
        double dDoubleValue;
        Double d15;
        double dDoubleValue2;
        ArrayList arrayList3;
        Double d16;
        double dDoubleValue3;
        Double d17;
        double dDoubleValue4;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f160696f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f160696f = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        m mVar2 = mVar;
        Object objJ = mVar2.f160694d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar2.f160696f;
        if (i15 == 0) {
            o13.r.b(objJ);
            if (d53.w.J(str) || d53.w.J(str2) || d53.w.J(str3)) {
                return new v2.a(new Exception(), null, null, 6, null);
            }
            mVar2.f160696f = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, new q(this, str, str2, str3, null), mVar2);
            if (objJ != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objJ);
        } else if (i15 == 2) {
            qs1.d dVar2 = mVar2.f160691a;
            o13.r.b(objJ);
            dVar = dVar2;
            list = (List) objJ;
            if (list != null) {
                arrayList3 = new ArrayList();
                for (GeoPointDTO geoPointDTO : list) {
                    d16 = geoPointDTO.distance;
                    if (d16 != null) {
                        dDoubleValue3 = d16.doubleValue();
                    } else {
                        dDoubleValue3 = 0.0d;
                    }
                    d17 = geoPointDTO.elevation;
                    if (d17 != null) {
                        dDoubleValue4 = d17.doubleValue();
                    } else {
                        dDoubleValue4 = 0.0d;
                    }
                    arrayList3.add(new o20.a(dDoubleValue3, dDoubleValue4));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            if (list != null) {
                arrayList2 = new ArrayList();
                for (GeoPointDTO geoPointDTO2 : list) {
                    d14 = geoPointDTO2.latitude;
                    if (d14 != null) {
                        dDoubleValue = d14.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    d15 = geoPointDTO2.longitude;
                    if (d15 != null) {
                        dDoubleValue2 = d15.doubleValue();
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    arrayList2.add(new LatLng(dDoubleValue, dDoubleValue2));
                }
            } else {
                arrayList2 = null;
            }
            n nVar = new n(this, dVar, null);
            mVar2.f160691a = dVar;
            mVar2.f160692b = arrayList;
            mVar2.f160693c = arrayList2;
            mVar2.f160696f = 3;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, nVar, mVar2);
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList2 = mVar2.f160693c;
            arrayList = mVar2.f160692b;
            dVar = mVar2.f160691a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        return new v2.b(new qs1.s(dVar, arrayList, arrayList2, v2Var instanceof v2.b ? (qs1.l) ((v2.b) v2Var).f47386a : null), 200, null, null, 12, null);
        v2 v2Var2 = (v2) objJ;
        if (!(v2Var2 instanceof v2.b)) {
            return new v2.a(new Exception(), null, null, 6, null);
        }
        qs1.d curatedCourseDTO = ((qs1.e) ((v2.b) v2Var2).f47386a).getCuratedCourseDTO();
        Long connectCourseId = curatedCourseDTO.getConnectCourseId();
        long jLongValue = connectCourseId != null ? connectCourseId.longValue() : -1L;
        mVar2.f160691a = curatedCourseDTO;
        mVar2.f160696f = 2;
        Object objD4 = d4(jLongValue, mVar2);
        if (objD4 != obj) {
            dVar = curatedCourseDTO;
            objJ = objD4;
            list = (List) objJ;
            if (list != null) {
                arrayList3 = new ArrayList();
                while (r9.hasNext()) {
                    d16 = geoPointDTO.distance;
                    if (d16 != null) {
                        dDoubleValue3 = d16.doubleValue();
                    } else {
                        dDoubleValue3 = 0.0d;
                    }
                    d17 = geoPointDTO.elevation;
                    if (d17 != null) {
                        dDoubleValue4 = d17.doubleValue();
                    } else {
                        dDoubleValue4 = 0.0d;
                    }
                    arrayList3.add(new o20.a(dDoubleValue3, dDoubleValue4));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            if (list != null) {
                arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                    d14 = geoPointDTO2.latitude;
                    if (d14 != null) {
                        dDoubleValue = d14.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    d15 = geoPointDTO2.longitude;
                    if (d15 != null) {
                        dDoubleValue2 = d15.doubleValue();
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    arrayList2.add(new LatLng(dDoubleValue, dDoubleValue2));
                }
            } else {
                arrayList2 = null;
            }
            n nVar2 = new n(this, dVar, null);
            mVar2.f160691a = dVar;
            mVar2.f160692b = arrayList;
            mVar2.f160693c = arrayList2;
            mVar2.f160696f = 3;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, nVar2, mVar2);
        }
        return obj;
    }

    @Override // ss1.a
    public final Object H1(long j8, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new i(this, j8, null), cVar);
    }

    @Override // ss1.a
    public final Object K2(qs1.x xVar, qt1.d dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new r(this, xVar, null), dVar);
    }

    @Override // ss1.a
    public final Object R2(long j8, qt1.k.f fVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new s(this, j8, null), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // ss1.a
    public final Object W(long j8, qs1.h hVar, String str, v13.c cVar) {
        l lVar;
        String provinceUriComponent;
        long j14;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f160686d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f160686d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objJ = lVar.f160684b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f160686d;
        if (i15 == 0) {
            o13.r.b(objJ);
            String countryCode = hVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String();
            if ((countryCode != null && d53.w.J(countryCode)) || (((provinceUriComponent = hVar.getProvinceUriComponent()) != null && d53.w.J(provinceUriComponent)) || d53.w.J(str))) {
                return new v2.a(new Exception(), null, null, 6, null);
            }
            String countryCode2 = hVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String();
            String str2 = countryCode2 == null ? "" : countryCode2;
            String provinceUriComponent2 = hVar.getProvinceUriComponent();
            String str3 = provinceUriComponent2 == null ? "" : provinceUriComponent2;
            j14 = j8;
            lVar.f160683a = j14;
            lVar.f160686d = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, new q(this, str2, str3, str, null), lVar);
            if (objJ != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objJ);
                return objJ;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j15 = lVar.f160683a;
        o13.r.b(objJ);
        j14 = j15;
        lVar.f160683a = j14;
        lVar.f160686d = 2;
        Object objB = b((v2) objJ, j14, lVar);
        return objB == obj ? obj : objB;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    /* JADX WARN: Code duplicated, block: B:44:0x0121  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0136  */
    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0141  */
    /* JADX WARN: Code duplicated, block: B:53:0x0148  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0153  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:59:0x015e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x016d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x0175  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0182  */
    /* JADX WARN: Code duplicated, block: B:74:0x018a  */
    /* JADX WARN: Code duplicated, block: B:76:0x018e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(long j8, long j14, boolean z14, boolean z15, v13.c cVar) {
        j jVar;
        long j15;
        boolean z16;
        long j16;
        boolean z17;
        Exception exc;
        v2 v2Var;
        v2 bVar;
        long j17;
        qs1.u uVar;
        qs1.h locationDTO;
        String strF;
        qs1.b coverImage;
        String strS;
        Long tripReportId;
        Integer rating;
        Long submissionDateMs;
        String profileImage;
        Long tripReportId2;
        Boolean boolValueOf;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f160669h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f160669h = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.f160667f;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f160669h;
        if (i15 == 0) {
            o13.r.b(obj);
            jVar.f160662a = j8;
            j15 = j14;
            jVar.f160663b = j15;
            jVar.f160664c = z14;
            jVar.f160665d = z15;
            jVar.f160669h = 1;
            Object objH1 = H1(j8, jVar);
            if (objH1 != obj2) {
                z16 = z14;
                obj = objH1;
                j16 = j8;
                z17 = z15;
            }
            return obj2;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                j17 = jVar.f160662a;
                v2Var = jVar.f160666e;
                o13.r.b(obj);
                bVar = (v2) obj;
                j16 = j17;
                if (bVar instanceof v2.b) {
                    uVar = (qs1.u) ((v2.b) bVar).f47386a;
                } else {
                    uVar = null;
                }
                v2.b bVar2 = (v2.b) v2Var;
                qs1.d curatedCourseDTO = ((qs1.e) bVar2.f47386a).getCuratedCourseDTO();
                Long l14 = new Long(j16);
                String courseName = curatedCourseDTO.getCourseName();
                locationDTO = curatedCourseDTO.getLocationDTO();
                if (locationDTO != null) {
                    lt1.j.f114865a.getClass();
                    strF = lt1.j.f(locationDTO);
                } else {
                    strF = "";
                }
                String str = strF;
                coverImage = curatedCourseDTO.getCoverImage();
                if (coverImage != null) {
                    strS = oc.b.s(coverImage);
                } else {
                    strS = null;
                }
                if (uVar != null) {
                    tripReportId = uVar.getTripReportId();
                } else {
                    tripReportId = null;
                }
                if (uVar != null) {
                    rating = uVar.getRating();
                } else {
                    rating = null;
                }
                if (uVar != null) {
                    submissionDateMs = uVar.getSubmissionDateMs();
                } else {
                    submissionDateMs = null;
                }
                if (uVar != null) {
                    profileImage = uVar.getProfileImage();
                } else {
                    profileImage = null;
                }
                if (uVar != null) {
                    tripReportId2 = uVar.getTripReportId();
                } else {
                    tripReportId2 = null;
                }
                if (tripReportId2 != null) {
                    boolValueOf = Boolean.valueOf(uVar.getProfileImage() != null && uVar.getUserName() == null);
                } else {
                    boolValueOf = null;
                }
                return new v2.b(new ms1.d(l14, courseName, str, strS, tripReportId, rating, submissionDateMs, profileImage, boolValueOf, uVar != null ? uVar.getHidden() : null, curatedCourseDTO.getCourseDistanceCM()), bVar2.f47387b, null, null, 12, null);
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j17 = jVar.f160662a;
            v2Var = jVar.f160666e;
            o13.r.b(obj);
            bVar = (v2) obj;
            j16 = j17;
            if (bVar instanceof v2.b) {
                uVar = (qs1.u) ((v2.b) bVar).f47386a;
            } else {
                uVar = null;
            }
            v2.b bVar3 = (v2.b) v2Var;
            qs1.d curatedCourseDTO2 = ((qs1.e) bVar3.f47386a).getCuratedCourseDTO();
            Long l15 = new Long(j16);
            String courseName2 = curatedCourseDTO2.getCourseName();
            locationDTO = curatedCourseDTO2.getLocationDTO();
            if (locationDTO != null) {
                lt1.j.f114865a.getClass();
                strF = lt1.j.f(locationDTO);
            } else {
                strF = "";
            }
            String str2 = strF;
            coverImage = curatedCourseDTO2.getCoverImage();
            if (coverImage != null) {
                strS = oc.b.s(coverImage);
            } else {
                strS = null;
            }
            if (uVar != null) {
                tripReportId = uVar.getTripReportId();
            } else {
                tripReportId = null;
            }
            if (uVar != null) {
                rating = uVar.getRating();
            } else {
                rating = null;
            }
            if (uVar != null) {
                submissionDateMs = uVar.getSubmissionDateMs();
            } else {
                submissionDateMs = null;
            }
            if (uVar != null) {
                profileImage = uVar.getProfileImage();
            } else {
                profileImage = null;
            }
            if (uVar != null) {
                tripReportId2 = uVar.getTripReportId();
            } else {
                tripReportId2 = null;
            }
            if (tripReportId2 != null) {
                boolValueOf = Boolean.valueOf(uVar.getProfileImage() != null && uVar.getUserName() == null);
            } else {
                boolValueOf = null;
            }
            return new v2.b(new ms1.d(l15, courseName2, str2, strS, tripReportId, rating, submissionDateMs, profileImage, boolValueOf, uVar != null ? uVar.getHidden() : null, curatedCourseDTO2.getCourseDistanceCM()), bVar3.f47387b, null, null, 12, null);
        }
        z17 = jVar.f160665d;
        z16 = jVar.f160664c;
        j15 = jVar.f160663b;
        j16 = jVar.f160662a;
        o13.r.b(obj);
        v2 v2Var2 = (v2) obj;
        if (!(v2Var2 instanceof v2.b)) {
            v2.a aVar = v2Var2 instanceof v2.a ? (v2.a) v2Var2 : null;
            if (aVar == null || (exc = aVar.f47383a) == null) {
                exc = new Exception();
            }
            return new v2.a(exc, null, null, 6, null);
        }
        if (!z16) {
            if (z17) {
                jVar.f160666e = (v2.b) v2Var2;
                jVar.f160662a = j16;
                jVar.f160663b = j15;
                jVar.f160664c = z16;
                jVar.f160665d = z17;
                jVar.f160669h = 2;
                Object objC = C(new g(this, j16, j15, null), jVar);
                if (objC != obj2) {
                    v2Var = v2Var2;
                    obj = objC;
                    j17 = j16;
                    bVar = (v2) obj;
                    j16 = j17;
                }
            } else {
                jVar.f160666e = (v2.b) v2Var2;
                jVar.f160662a = j16;
                jVar.f160663b = j15;
                jVar.f160664c = z16;
                jVar.f160665d = z17;
                jVar.f160669h = 3;
                Object objC2 = C(new f(this, j16, j15, null), jVar);
                if (objC2 != obj2) {
                    v2Var = v2Var2;
                    obj = objC2;
                    j17 = j16;
                    bVar = (v2) obj;
                    j16 = j17;
                }
            }
            return obj2;
        }
        v2Var = v2Var2;
        bVar = new v2.b(null, 200, null, null, 12, null);
        if (bVar instanceof v2.b) {
            uVar = (qs1.u) ((v2.b) bVar).f47386a;
        } else {
            uVar = null;
        }
        v2.b bVar4 = (v2.b) v2Var;
        qs1.d curatedCourseDTO3 = ((qs1.e) bVar4.f47386a).getCuratedCourseDTO();
        Long l16 = new Long(j16);
        String courseName3 = curatedCourseDTO3.getCourseName();
        locationDTO = curatedCourseDTO3.getLocationDTO();
        if (locationDTO != null) {
            lt1.j.f114865a.getClass();
            strF = lt1.j.f(locationDTO);
        } else {
            strF = "";
        }
        String str3 = strF;
        coverImage = curatedCourseDTO3.getCoverImage();
        if (coverImage != null) {
            strS = oc.b.s(coverImage);
        } else {
            strS = null;
        }
        if (uVar != null) {
            tripReportId = uVar.getTripReportId();
        } else {
            tripReportId = null;
        }
        if (uVar != null) {
            rating = uVar.getRating();
        } else {
            rating = null;
        }
        if (uVar != null) {
            submissionDateMs = uVar.getSubmissionDateMs();
        } else {
            submissionDateMs = null;
        }
        if (uVar != null) {
            profileImage = uVar.getProfileImage();
        } else {
            profileImage = null;
        }
        if (uVar != null) {
            tripReportId2 = uVar.getTripReportId();
        } else {
            tripReportId2 = null;
        }
        if (tripReportId2 != null) {
            boolValueOf = Boolean.valueOf(uVar.getProfileImage() != null && uVar.getUserName() == null);
        } else {
            boolValueOf = null;
        }
        return new v2.b(new ms1.d(l16, courseName3, str3, strS, tripReportId, rating, submissionDateMs, profileImage, boolValueOf, uVar != null ? uVar.getHidden() : null, curatedCourseDTO3.getCourseDistanceCM()), bVar4.f47387b, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.garmin.android.apps.connectmobile.f0, ss1.z] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object b(v2 v2Var, long j8, v13.c cVar) {
        o oVar;
        qs1.d curatedCourseDTO;
        long j14;
        List<GeoPointDTO> list;
        ?? arrayList;
        u13.a aVar;
        ?? r14;
        List list2;
        Object objJ;
        qs1.d dVar;
        List list3;
        ?? r15;
        ArrayList arrayList2;
        ?? r16;
        Double d14;
        double dDoubleValue;
        Double d15;
        double dDoubleValue2;
        Iterator it;
        Double d16;
        double dDoubleValue3;
        Double d17;
        double dDoubleValue4;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f160712g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f160712g = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objD4 = oVar.f160710e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f160712g;
        if (i15 != 0) {
            if (i15 == 1) {
                long j15 = oVar.f160709d;
                curatedCourseDTO = oVar.f160706a;
                o13.r.b(objD4);
                j14 = j15;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list3 = (List) oVar.f160708c;
                List list4 = (List) oVar.f160707b;
                dVar = oVar.f160706a;
                o13.r.b(objD4);
                r15 = list4;
            }
            v2 v2Var2 = (v2) objD4;
            return new v2.b(new qs1.s(dVar, r15, list3, v2Var2 instanceof v2.b ? (qs1.l) ((v2.b) v2Var2).f47386a : null), 200, null, null, 12, null);
        }
        o13.r.b(objD4);
        if (!(v2Var instanceof v2.b)) {
            return new v2.a(new Exception(), null, null, 6, null);
        }
        qs1.e eVar = (qs1.e) ((v2.b) v2Var).f47386a;
        Long connectCourseId = eVar.getCuratedCourseDTO().getConnectCourseId();
        curatedCourseDTO = eVar.getCuratedCourseDTO();
        if (connectCourseId != null) {
            long jLongValue = connectCourseId.longValue();
            oVar.f160706a = curatedCourseDTO;
            j14 = j8;
            oVar.f160709d = j14;
            oVar.f160712g = 1;
            objD4 = d4(jLongValue, oVar);
            if (objD4 == aVar2) {
                return aVar2;
            }
        } else {
            j14 = j8;
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (it = list.iterator(); it.hasNext(); it = it) {
                GeoPointDTO geoPointDTO = (GeoPointDTO) it.next();
                d16 = geoPointDTO.distance;
                if (d16 != null) {
                    dDoubleValue3 = d16.doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                d17 = geoPointDTO.elevation;
                if (d17 != null) {
                    dDoubleValue4 = d17.doubleValue();
                } else {
                    dDoubleValue4 = 0.0d;
                }
                arrayList.add(new o20.a(dDoubleValue3, dDoubleValue4));
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        if (list != null) {
            arrayList2 = new ArrayList();
            r16 = arrayList;
            for (GeoPointDTO geoPointDTO2 : list) {
                d14 = geoPointDTO2.latitude;
                if (d14 != null) {
                    dDoubleValue = d14.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                d15 = geoPointDTO2.longitude;
                if (d15 != null) {
                    dDoubleValue2 = d15.doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
                arrayList2.add(new LatLng(dDoubleValue, dDoubleValue2));
                aVar2 = aVar2;
                r16 = r16;
            }
            aVar = aVar2;
            r14 = r16;
            list2 = arrayList2;
        } else {
            aVar = aVar2;
            r14 = arrayList;
            list2 = p13.j0.f134944a;
        }
        p pVar = new p(this, j14, null);
        oVar.f160706a = curatedCourseDTO;
        oVar.f160707b = r14;
        oVar.f160708c = list2;
        oVar.f160709d = j14;
        oVar.f160712g = 2;
        objJ = com.garmin.android.apps.connectmobile.f0.J(this, pVar, oVar);
        if (objJ == aVar) {
            return aVar;
        }
        dVar = curatedCourseDTO;
        list3 = list2;
        objD4 = objJ;
        r15 = r14;
        v2 v2Var3 = (v2) objD4;
        return new v2.b(new qs1.s(dVar, r15, list3, v2Var3 instanceof v2.b ? (qs1.l) ((v2.b) v2Var3).f47386a : null), 200, null, null, 12, null);
        list = (List) objD4;
        if (list != null) {
            arrayList = new ArrayList();
            while (it.hasNext()) {
                GeoPointDTO geoPointDTO3 = (GeoPointDTO) it.next();
                d16 = geoPointDTO3.distance;
                if (d16 != null) {
                    dDoubleValue3 = d16.doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                d17 = geoPointDTO3.elevation;
                if (d17 != null) {
                    dDoubleValue4 = d17.doubleValue();
                } else {
                    dDoubleValue4 = 0.0d;
                }
                arrayList.add(new o20.a(dDoubleValue3, dDoubleValue4));
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        if (list != null) {
            arrayList2 = new ArrayList();
            r16 = arrayList;
            while (r2.hasNext()) {
                d14 = geoPointDTO2.latitude;
                if (d14 != null) {
                    dDoubleValue = d14.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                d15 = geoPointDTO2.longitude;
                if (d15 != null) {
                    dDoubleValue2 = d15.doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
                arrayList2.add(new LatLng(dDoubleValue, dDoubleValue2));
                aVar2 = aVar2;
                r16 = r16;
            }
            aVar = aVar2;
            r14 = r16;
            list2 = arrayList2;
        } else {
            aVar = aVar2;
            r14 = arrayList;
            list2 = p13.j0.f134944a;
        }
        p pVar2 = new p(this, j14, null);
        oVar.f160706a = curatedCourseDTO;
        oVar.f160707b = r14;
        oVar.f160708c = list2;
        oVar.f160709d = j14;
        oVar.f160712g = 2;
        objJ = com.garmin.android.apps.connectmobile.f0.J(this, pVar2, oVar);
        if (objJ == aVar) {
            return aVar;
        }
        dVar = curatedCourseDTO;
        list3 = list2;
        objD4 = objJ;
        r15 = r14;
        v2 v2Var4 = (v2) objD4;
        return new v2.b(new qs1.s(dVar, r15, list3, v2Var4 instanceof v2.b ? (qs1.l) ((v2.b) v2Var4).f47386a : null), 200, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ss1.a
    public final Object c3(long j8, v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f160679d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f160679d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objH1 = kVar.f160677b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f160679d;
        if (i15 == 0) {
            o13.r.b(objH1);
            kVar.f160676a = j8;
            kVar.f160679d = 1;
            objH1 = H1(j8, kVar);
            if (objH1 != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objH1);
                return objH1;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = kVar.f160676a;
        o13.r.b(objH1);
        kVar.f160676a = j8;
        kVar.f160679d = 2;
        Object objB = b((v2) objH1, j8, kVar);
        return objB == obj ? obj : objB;
    }

    @Override // ss1.a
    public final Object c4(long j8, vs1.s sVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new w(this, j8, null), sVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ss1.a
    public final Object d4(long j8, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f160627c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f160627c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objJ = dVar.f160625a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f160627c;
        if (i15 == 0) {
            o13.r.b(objJ);
            dVar.f160627c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, new c(this, j8, null), dVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        return v2Var instanceof v2.b ? ((com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a).geoPoints : p13.j0.f134944a;
    }

    @Override // ss1.a
    public final Object g0(qs1.o oVar, qt1.e eVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new x(this, oVar, null), eVar);
    }

    @Override // ss1.a
    public final Object g1(vs1.r rVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new h(this, null), rVar);
    }

    @Override // ss1.a
    public final Object n2(qs1.b0 b0Var, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new v(this, b0Var, null), iVar);
    }

    @Override // ss1.a
    public final Object p3(qs1.r rVar, qt1.f.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new y(this, rVar, null), aVar);
    }

    @Override // ss1.a
    public final Object w2(long j8, qt1.k.C2778k c2778k) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new t(this, j8, null), c2778k);
    }

    @Override // ss1.a
    public final Object x0(long j8, vs1.q qVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new b(this, j8, null), qVar);
    }

    @Override // ss1.a
    public final Object y1(long j8, qt1.k.C2778k c2778k) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new u(this, j8, null), c2778k);
    }

    @Override // ss1.a
    public final Object z(long j8, int i14, int i15, rs1.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new e(this, j8, i14, i15, null), aVar);
    }
}
