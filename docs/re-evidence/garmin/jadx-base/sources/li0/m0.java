package li0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lli0/m0;", "", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f112791a = new m0();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lli0/m0$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        SEND_REQUEST,
        ACCEPT_REQUEST,
        CANCEL_REQUEST,
        ADD_FAVORITE,
        REMOVE_FAVORITE,
        MUTE,
        UNMUTE,
        BLOCK,
        UNBLOCK,
        UNFOLLOW,
        DISMISS_SUGGESTION,
        UNDISMISS_SUGGESTION,
        REMOVE_FOLLOWER
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f112807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f112808c;

        static {
            int[] iArr = new int[hi0.c.b.values().length];
            try {
                iArr[hi0.c.b.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hi0.c.b.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112806a = iArr;
            int[] iArr2 = new int[hi0.e.b.values().length];
            try {
                iArr2[hi0.e.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[hi0.e.b.FOLLOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[hi0.e.b.FOLLOWED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[hi0.e.b.MUTUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f112807b = iArr2;
            int[] iArr3 = new int[a.values().length];
            try {
                iArr3[a.SEND_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[a.ACCEPT_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[a.CANCEL_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[a.ADD_FAVORITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[a.REMOVE_FAVORITE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[a.MUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[a.UNMUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[a.BLOCK.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[a.UNBLOCK.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[a.UNFOLLOW.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[a.DISMISS_SUGGESTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[a.UNDISMISS_SUGGESTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[a.REMOVE_FOLLOWER.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            f112808c = iArr3;
        }
    }

    private m0() {
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0177 A[PHI: r4 r5
      0x0177: PHI (r4v23 li0.n0) = (r4v7 li0.n0), (r4v25 li0.n0) binds: [B:178:0x0275, B:99:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r5v42 li0.b0) = (r5v19 li0.b0), (r5v43 li0.b0) binds: [B:178:0x0275, B:99:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:209:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:210:0x02eb A[PHI: r2 r4
      0x02eb: PHI (r2v3 li0.b0) = (r2v2 li0.b0), (r2v8 li0.b0) binds: [B:212:0x02f3, B:208:0x02df] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r4v2 li0.n0) = (r4v1 li0.n0), (r4v4 li0.n0) binds: [B:212:0x02f3, B:208:0x02df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:215:0x0300  */
    /* JADX WARN: Code duplicated, block: B:217:0x0307 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    public static l0 a(l0 l0Var, a aVar, hi0.c cVar) {
        int i14;
        n0 n0VarB;
        Integer numB;
        b0 b0Var;
        n0 n0Var;
        n0 n0Var2;
        aVar.getClass();
        b0 b0Var2 = l0Var != null ? l0Var.f112785a : null;
        Long lValueOf = l0Var != null ? l0Var.f112787c : null;
        n0 n0VarB2 = l0Var != null ? l0Var.f112789e : null;
        switch (b.f112808c[aVar.ordinal()]) {
            case 1:
                if (b0Var2 == b0.FOLLOW || b0Var2 == b0.FOLLOW_BACK) {
                    hi0.c.b bVarD = cVar != null ? cVar.getRequestStatus() : null;
                    i14 = bVarD != null ? b.f112806a[bVarD.ordinal()] : -1;
                    if (i14 == 1) {
                        b0Var2 = b0.REQUEST_SENT;
                        Integer numB2 = cVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        if (numB2 != null) {
                            lValueOf = Long.valueOf(numB2.intValue());
                        } else {
                            lValueOf = null;
                        }
                    } else if (i14 != 2) {
                        String str = "An unexpected state reached: data.requestStatus = " + (cVar != null ? cVar.getRequestStatus() : null);
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var, "FollowStateHandler", str);
                    } else {
                        if ((n0VarB2 != null ? n0VarB2.f112816a : null) == hi0.e.b.FOLLOWED) {
                            n0VarB = n0.b(n0VarB2, hi0.e.b.MUTUAL, null, null, 14);
                        } else {
                            if (n0VarB2 != null) {
                                n0VarB = n0.b(n0VarB2, hi0.e.b.FOLLOWING, null, null, 14);
                            } else {
                                n0VarB2 = null;
                            }
                            b0Var2 = b0.FOLLOWING;
                            numB = cVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                            if (numB != null) {
                                lValueOf = Long.valueOf(numB.intValue());
                            } else {
                                lValueOf = null;
                            }
                        }
                        n0VarB2 = n0VarB;
                        b0Var2 = b0.FOLLOWING;
                        numB = cVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        if (numB != null) {
                            lValueOf = Long.valueOf(numB.intValue());
                        } else {
                            lValueOf = null;
                        }
                    }
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 2:
                hi0.e.b bVar = (l0Var == null || (n0Var = l0Var.f112789e) == null) ? null : n0Var.f112816a;
                int i15 = bVar == null ? -1 : b.f112807b[bVar.ordinal()];
                if (i15 == -1 || i15 == 1) {
                    n0VarB2 = n0VarB2 != null ? n0.b(n0VarB2, hi0.e.b.FOLLOWED, null, null, 14) : null;
                    if ((l0Var != null ? l0Var.f112787c : null) != null) {
                        b0 b0Var3 = l0Var.f112785a;
                        b0Var = b0.REQUEST_SENT;
                        if (b0Var3 == b0Var) {
                            b0Var2 = b0Var;
                        }
                    }
                    b0Var2 = b0.FOLLOW_BACK;
                } else if (i15 != 2) {
                    String str2 = "An unexpected state reached: followStatusDTO.relationshipStatus = " + (n0VarB2 != null ? n0VarB2.f112816a : null);
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var2, "FollowStateHandler", str2);
                } else {
                    n0VarB2 = n0VarB2 != null ? n0.b(n0VarB2, hi0.e.b.MUTUAL, null, null, 14) : null;
                    if (n0VarB2 != null ? p005kotlin.jvm.internal.s.g(n0VarB2.f112818c, Boolean.TRUE) : false) {
                        b0Var2 = b0.UNMUTE;
                    } else {
                        b0Var2 = n0VarB2 != null ? p005kotlin.jvm.internal.s.g(n0VarB2.f112819d, Boolean.TRUE) : false ? b0.FAVORITE : b0.FOLLOWING;
                    }
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 3:
                if (b0Var2 == b0.REQUEST_SENT) {
                    hi0.e.b bVar2 = n0VarB2 != null ? n0VarB2.f112816a : null;
                    b0Var2 = (bVar2 != null ? b.f112807b[bVar2.ordinal()] : -1) == 3 ? b0.FOLLOW_BACK : b0.FOLLOW;
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 4:
                if (b0Var2 == b0.MUTED) {
                    if (n0VarB2 != null) {
                        n0VarB2 = n0.b(n0VarB2, null, null, Boolean.TRUE, 7);
                    } else {
                        n0VarB2 = null;
                    }
                } else if (b0Var2 == b0.FOLLOWING) {
                    n0VarB2 = n0VarB2 != null ? n0.b(n0VarB2, null, null, Boolean.TRUE, 7) : null;
                    b0Var2 = b0.FAVORITE;
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 5:
                if (b0Var2 == b0.FAVORITE) {
                    n0VarB2 = n0VarB2 != null ? n0.b(n0VarB2, null, null, Boolean.FALSE, 7) : null;
                    b0Var2 = b0.FOLLOWING;
                } else if (b0Var2 == b0.MUTED) {
                    if (n0VarB2 != null) {
                        n0VarB2 = n0.b(n0VarB2, null, null, Boolean.FALSE, 7);
                    } else {
                        n0VarB2 = null;
                    }
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 6:
                if (b0Var2 == b0.FOLLOWING || b0Var2 == b0.FAVORITE) {
                    n0VarB2 = n0VarB2 != null ? n0.b(n0VarB2, null, Boolean.TRUE, null, 11) : null;
                    b0Var2 = b0.MUTED;
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 7:
                b0Var = b0.FOLLOWING;
                if (b0Var2 == b0Var || b0Var2 == b0.MUTED || b0Var2 == b0.UNMUTE) {
                    n0VarB2 = n0VarB2 != null ? n0.b(n0VarB2, null, Boolean.FALSE, null, 11) : null;
                    if (p005kotlin.jvm.internal.s.g(n0VarB2 != null ? n0VarB2.f112819d : null, Boolean.TRUE)) {
                        b0Var2 = b0.FAVORITE;
                    } else {
                        b0Var2 = b0Var;
                    }
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 8:
                if (n0VarB2 != null) {
                    hi0.e.b bVar3 = hi0.e.b.NONE;
                    Boolean bool = Boolean.TRUE;
                    Boolean bool2 = Boolean.FALSE;
                    n0VarB2 = new n0(bVar3, bool, bool2, bool2);
                } else {
                    n0VarB2 = null;
                }
                b0Var2 = b0.UNBLOCK;
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 9:
                if (b0Var2 == b0.UNBLOCK) {
                    n0VarB2 = n0VarB2 != null ? n0.b(n0VarB2, null, null, null, 13) : null;
                    b0Var2 = b0.FOLLOW;
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 10:
                if (b0Var2 == b0.MUTED || b0Var2 == b0.FOLLOWING || b0Var2 == b0.FAVORITE) {
                    hi0.e.b bVar4 = n0VarB2 != null ? n0VarB2.f112816a : null;
                    i14 = bVar4 != null ? b.f112807b[bVar4.ordinal()] : -1;
                    if (i14 == 2) {
                        hi0.e.b bVar5 = hi0.e.b.NONE;
                        Boolean bool3 = Boolean.FALSE;
                        n0VarB2 = n0.b(n0VarB2, bVar5, bool3, bool3, 2);
                        b0Var2 = b0.FOLLOW;
                    } else if (i14 != 4) {
                        String str3 = "An unexpected state reached: followStatusDTO.relationshipStatus = " + (n0VarB2 != null ? n0VarB2.f112816a : null);
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.f(a2Var3, "FollowStateHandler", str3);
                    } else {
                        hi0.e.b bVar6 = hi0.e.b.FOLLOWED;
                        Boolean bool4 = Boolean.FALSE;
                        n0VarB2 = n0.b(n0VarB2, bVar6, bool4, bool4, 2);
                        b0Var2 = b0.FOLLOW_BACK;
                    }
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 11:
                if (b0Var2 == b0.FOLLOW || b0Var2 == b0.FOLLOW_BACK) {
                    b0Var2 = b0.UNDO;
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 12:
                hi0.e.b bVar7 = n0VarB2 != null ? n0VarB2.f112816a : null;
                i14 = bVar7 != null ? b.f112807b[bVar7.ordinal()] : -1;
                if (i14 == 1) {
                    b0Var2 = b0.FOLLOW;
                } else if (i14 != 3) {
                    String str4 = "An unexpected state reached: followStatusDTO.relationshipStatus = " + (n0VarB2 != null ? n0VarB2.f112816a : null);
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var4, "FollowStateHandler", str4);
                } else {
                    b0Var2 = b0.FOLLOW_BACK;
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            case 13:
                hi0.e.b bVar8 = (l0Var == null || (n0Var2 = l0Var.f112789e) == null) ? null : n0Var2.f112816a;
                i14 = bVar8 != null ? b.f112807b[bVar8.ordinal()] : -1;
                if (i14 == 3) {
                    n0VarB2 = n0VarB2 != null ? n0.b(n0VarB2, hi0.e.b.NONE, null, null, 14) : null;
                    b0Var2 = b0.FOLLOW;
                } else if (i14 != 4) {
                    String str5 = "An unexpected state reached: followStatusDTO.relationshipStatus = " + (n0VarB2 != null ? n0VarB2.f112816a : null);
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var5, "FollowStateHandler", str5);
                } else if (n0VarB2 != null) {
                    n0VarB2 = n0.b(n0VarB2, hi0.e.b.FOLLOWING, null, null, 14);
                } else {
                    n0VarB2 = null;
                }
                if (l0Var != null) {
                    return l0.a(l0Var, b0Var2, lValueOf, n0VarB2, 10);
                }
                return null;
            default:
                lc.u0.r();
                return null;
        }
    }

    public static /* synthetic */ l0 b(m0 m0Var, l0 l0Var, a aVar) {
        m0Var.getClass();
        return a(l0Var, aVar, null);
    }
}
