package fe2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIGroupLiveTrack;
import com.garmin.proto.generated.GDILiveTrackMessagingProto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lfe2/j1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceUnitId", "Lxd2/a1;", "repository", "<init>", "(Landroid/content/Context;JLxd2/a1;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f70814e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f70815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f70816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd2.a1 f70817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Logger f70818d;

    public j1(Context context, long j8, xd2.a1 a1Var) {
        context.getClass();
        a1Var.getClass();
        this.f70815a = context;
        this.f70816b = j8;
        this.f70817c = a1Var;
        this.f70818d = i2.a("GrouptrackManager");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (fe2.j1.a.b(r4, r14, r15, r2, r9) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        if (r14 == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i14, String str, int i15, List list, Integer num, Integer num2, v13.c cVar) {
        k1 k1Var;
        Object obj;
        int i16;
        if (cVar instanceof k1) {
            k1Var = (k1) cVar;
            int i17 = k1Var.f70829f;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                k1Var.f70829f = i17 - Integer.MIN_VALUE;
            } else {
                k1Var = new k1(this, cVar);
            }
        } else {
            k1Var = new k1(this, cVar);
        }
        k1 k1Var2 = k1Var;
        Object obj2 = k1Var2.f70827d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = k1Var2.f70829f;
        if (i18 == 0) {
            o13.r.b(obj2);
            List listC = list == null ? p13.w.c(new ae2.r.b().f2990a) : list;
            k1Var2.f70826c = str;
            k1Var2.f70824a = i14;
            k1Var2.f70825b = i15;
            k1Var2.f70829f = 1;
            Object objW = this.f70817c.w(this.f70816b, i15, listC, num, num2, k1Var2);
            if (objW != aVar) {
                obj = objW;
                i16 = i15;
            }
            return aVar;
        }
        if (i18 != 1) {
            if (i18 == 2) {
                o13.r.b(obj2);
                return Unit.INSTANCE;
            }
            if (i18 == 3) {
                o13.r.b(obj2);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i19 = k1Var2.f70825b;
        int i24 = k1Var2.f70824a;
        String str2 = k1Var2.f70826c;
        o13.r.b(obj2);
        i16 = i19;
        i14 = i24;
        str = str2;
        obj = obj2;
        xd2.g1 g1Var = (xd2.g1) obj;
        boolean z14 = g1Var instanceof xd2.g1.b;
        Context context = this.f70815a;
        a aVar2 = f70814e;
        if (z14) {
            List list2 = (List) ((xd2.g1.b) g1Var).f190167a;
            k1Var2.f70826c = null;
            k1Var2.f70824a = i14;
            k1Var2.f70825b = i16;
            k1Var2.f70829f = 2;
            aVar2.getClass();
        } else {
            GDIGroupLiveTrack.ResponseFailureStatus responseFailureStatus = GDIGroupLiveTrack.ResponseFailureStatus.SERVER_ERROR;
            k1Var2.f70826c = null;
            k1Var2.f70824a = i14;
            k1Var2.f70825b = i16;
            k1Var2.f70829f = 3;
            this.f70818d.debug("Respond to device with connections error " + responseFailureStatus.name());
            GDIGroupLiveTrack.GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponseBuild = GDIGroupLiveTrack.GetLiveTrackConnectionsResponse.newBuilder().setGroupTrackResponse(GDIGroupLiveTrack.GroupTrackResponse.newBuilder().setSuccess(false).setFailureStatus(responseFailureStatus)).build();
            GDIGroupLiveTrack.GroupLiveTrackService.Builder builderNewBuilder = GDIGroupLiveTrack.GroupLiveTrackService.newBuilder();
            builderNewBuilder.setGetLiveTrackConnectionsResponse(getLiveTrackConnectionsResponseBuild);
            aVar2.getClass();
            Object objD = a.d(context, i14, str, builderNewBuilder, k1Var2);
            if (objD != aVar) {
                objD = Unit.INSTANCE;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (fe2.j1.a.c(r8.f70815a, r9, r10, r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (e(r9, r10, r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (e(r9, r10, r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i14, String str, List list, v13.c cVar) {
        l1 l1Var;
        xd2.g1 g1Var;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i15 = l1Var.f70839e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                l1Var.f70839e = i15 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, cVar);
            }
        } else {
            l1Var = new l1(this, cVar);
        }
        Object objF = l1Var.f70837c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = l1Var.f70839e;
        if (i16 == 0) {
            o13.r.b(objF);
            if (list == null || list.isEmpty()) {
                GDIGroupLiveTrack.ResponseFailureStatus responseFailureStatus = GDIGroupLiveTrack.ResponseFailureStatus.EMPTY_SESSION_IDS_LIST;
                l1Var.f70836b = null;
                l1Var.f70835a = i14;
                l1Var.f70839e = 1;
            } else {
                l1Var.f70836b = str;
                l1Var.f70835a = i14;
                l1Var.f70839e = 2;
                objF = this.f70817c.f(this.f70816b, list, l1Var);
                if (objF != aVar) {
                    g1Var = (xd2.g1) objF;
                    if (g1Var instanceof xd2.g1.b) {
                        ae2.i iVar = (ae2.i) ((xd2.g1.b) g1Var).f190167a;
                        l1Var.f70836b = null;
                        l1Var.f70835a = i14;
                        l1Var.f70839e = 3;
                        f70814e.getClass();
                    } else {
                        GDIGroupLiveTrack.ResponseFailureStatus responseFailureStatus2 = GDIGroupLiveTrack.ResponseFailureStatus.SERVER_ERROR;
                        l1Var.f70836b = null;
                        l1Var.f70835a = i14;
                        l1Var.f70839e = 4;
                    }
                }
            }
            return aVar;
        }
        if (i16 == 1) {
            o13.r.b(objF);
            return Unit.INSTANCE;
        }
        if (i16 != 2) {
            if (i16 == 3) {
                o13.r.b(objF);
                return Unit.INSTANCE;
            }
            if (i16 == 4) {
                o13.r.b(objF);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i14 = l1Var.f70835a;
        str = l1Var.f70836b;
        o13.r.b(objF);
        g1Var = (xd2.g1) objF;
        if (g1Var instanceof xd2.g1.b) {
            ae2.i iVar2 = (ae2.i) ((xd2.g1.b) g1Var).f190167a;
            l1Var.f70836b = null;
            l1Var.f70835a = i14;
            l1Var.f70839e = 3;
            f70814e.getClass();
        } else {
            GDIGroupLiveTrack.ResponseFailureStatus responseFailureStatus3 = GDIGroupLiveTrack.ResponseFailureStatus.SERVER_ERROR;
            l1Var.f70836b = null;
            l1Var.f70835a = i14;
            l1Var.f70839e = 4;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:51:0x011e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    /* JADX WARN: Code duplicated, block: B:62:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:83:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015f, code lost:
    
        if (fe2.j1.a.a(r12, r1, r7, r9, r8) == r10) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017e, code lost:
    
        if (fe2.j1.a.e(r12, r1, r7, r0, r8) == r10) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019d, code lost:
    
        if (fe2.j1.a.e(r12, r1, r7, r0, r8) == r10) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c2, code lost:
    
        if (fe2.j1.a.e(r12, r1, r23, r0, r8) == r10) goto L78;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00a7, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i14, long j8, String str, String str2, long j14, v13.c cVar) {
        m1 m1Var;
        long j15;
        long j16;
        String str3;
        xd2.g1 g1Var;
        GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.Builder builderNewBuilder;
        Iterator it;
        GDILiveTrackMessagingProto.LiveTrackMessage.Builder builderNewBuilder2;
        String str4;
        Long l14;
        Long l15;
        Long l16;
        String str5;
        GDILiveTrackMessagingProto.LiveTrackMessageBody.Builder builderNewBuilder3;
        String str6;
        int i15 = i14;
        if (cVar instanceof m1) {
            m1Var = (m1) cVar;
            int i16 = m1Var.f70852g;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                m1Var.f70852g = i16 - Integer.MIN_VALUE;
            } else {
                m1Var = new m1(this, cVar);
            }
        } else {
            m1Var = new m1(this, cVar);
        }
        Object objB = m1Var.f70850e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = m1Var.f70852g;
        Context context = this.f70815a;
        a aVar2 = f70814e;
        Logger logger = this.f70818d;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 == 2) {
                    o13.r.b(objB);
                    return Unit.INSTANCE;
                }
                if (i17 == 3) {
                    o13.r.b(objB);
                    return Unit.INSTANCE;
                }
                if (i17 == 4) {
                    o13.r.b(objB);
                    return Unit.INSTANCE;
                }
                if (i17 == 5) {
                    o13.r.b(objB);
                    return Unit.INSTANCE;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j15 = m1Var.f70848c;
            j16 = m1Var.f70847b;
            i15 = m1Var.f70846a;
            str3 = m1Var.f70849d;
            o13.r.b(objB);
            g1Var = (xd2.g1) objB;
            if (g1Var instanceof xd2.g1.b) {
                GDILiveTrackMessagingProto.LiveTrackMessagingService.Builder builderNewBuilder4 = GDILiveTrackMessagingProto.LiveTrackMessagingService.newBuilder();
                List list = (List) ((xd2.g1.b) g1Var).f190167a;
                logger.debug("GET messages success successful, message count: " + list.size() + ", responding to device");
                builderNewBuilder = GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.newBuilder();
                builderNewBuilder.setGetLiveTrackMessagesStatus(GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus.OK);
                it = list.iterator();
                while (it.hasNext()) {
                    s1 s1Var = (s1) it.next();
                    builderNewBuilder2 = GDILiveTrackMessagingProto.LiveTrackMessage.newBuilder();
                    str4 = s1Var.f70925e;
                    l14 = s1Var.f70922b;
                    l15 = s1Var.f70921a;
                    l16 = s1Var.f70927g;
                    if (str4 != null) {
                        builderNewBuilder2.setSenderSessionId(str4);
                    }
                    str5 = s1Var.f70926f;
                    if (str5 != null) {
                        builderNewBuilder2.setSenderDisplayName(str5);
                    }
                    Iterator it3 = it;
                    long j17 = j15;
                    if (l16 != null) {
                        builderNewBuilder2.setTrackerMessageSeq(l16.longValue());
                    }
                    builderNewBuilder3 = GDILiveTrackMessagingProto.LiveTrackMessageBody.newBuilder();
                    if (l15 != null) {
                        builderNewBuilder3.setMessageId(l15.longValue());
                    }
                    str6 = s1Var.f70923c;
                    if (str6 != null) {
                        builderNewBuilder3.setMessageText(str6);
                    }
                    if (l14 != null) {
                        builderNewBuilder3.setTimestamp(l14.longValue());
                    }
                    builderNewBuilder2.setLiveTrackMessageBody(builderNewBuilder3);
                    GDILiveTrackMessagingProto.LiveTrackMessage liveTrackMessageBuild = builderNewBuilder2.build();
                    liveTrackMessageBuild.getClass();
                    builderNewBuilder.addLiveTrackMessages(liveTrackMessageBuild);
                    j15 = j17;
                    it = it3;
                }
                GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse getLiveTrackMessagesResponseBuild = builderNewBuilder.build();
                getLiveTrackMessagesResponseBuild.getClass();
                builderNewBuilder4.setGetLiveTrackMessagesResponse(getLiveTrackMessagesResponseBuild);
                Unit unit = Unit.INSTANCE;
                m1Var.f70849d = null;
                m1Var.f70846a = i15;
                m1Var.f70847b = j16;
                m1Var.f70848c = j15;
                m1Var.f70852g = 2;
                aVar2.getClass();
            } else if (g1Var instanceof xd2.g1.a.d) {
                GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus getLiveTrackMessagesStatus = GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus.NETWORK_FAILURE;
                m1Var.f70849d = null;
                m1Var.f70846a = i15;
                m1Var.f70847b = j16;
                m1Var.f70848c = j15;
                m1Var.f70852g = 3;
                aVar2.getClass();
            } else {
                if (g1Var instanceof xd2.g1.a) {
                    lc.u0.r();
                    return null;
                }
                GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus getLiveTrackMessagesStatus2 = GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus.SERVER_ERROR;
                m1Var.f70849d = null;
                m1Var.f70846a = i15;
                m1Var.f70847b = j16;
                m1Var.f70848c = j15;
                m1Var.f70852g = 4;
                aVar2.getClass();
            }
            return aVar;
        }
        o13.r.b(objB);
        logger.debug("handleGrouptrackGetMessagesRequest for device: " + j8 + ", recipientSessionId: " + str2);
        if (str2 != null) {
            m1Var.f70849d = str;
            m1Var.f70846a = i15;
            m1Var.f70847b = j8;
            m1Var.f70848c = j14;
            m1Var.f70852g = 1;
            objB = this.f70817c.B(str2, j14, j8, m1Var);
            if (objB != aVar) {
                j15 = j14;
                j16 = j8;
                str3 = str;
                g1Var = (xd2.g1) objB;
                if (g1Var instanceof xd2.g1.b) {
                    GDILiveTrackMessagingProto.LiveTrackMessagingService.Builder builderNewBuilder5 = GDILiveTrackMessagingProto.LiveTrackMessagingService.newBuilder();
                    List list2 = (List) ((xd2.g1.b) g1Var).f190167a;
                    logger.debug("GET messages success successful, message count: " + list2.size() + ", responding to device");
                    builderNewBuilder = GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.newBuilder();
                    builderNewBuilder.setGetLiveTrackMessagesStatus(GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus.OK);
                    it = list2.iterator();
                    while (it.hasNext()) {
                        s1 s1Var2 = (s1) it.next();
                        builderNewBuilder2 = GDILiveTrackMessagingProto.LiveTrackMessage.newBuilder();
                        str4 = s1Var2.f70925e;
                        l14 = s1Var2.f70922b;
                        l15 = s1Var2.f70921a;
                        l16 = s1Var2.f70927g;
                        if (str4 != null) {
                            builderNewBuilder2.setSenderSessionId(str4);
                        }
                        str5 = s1Var2.f70926f;
                        if (str5 != null) {
                            builderNewBuilder2.setSenderDisplayName(str5);
                        }
                        Iterator it4 = it;
                        long j18 = j15;
                        if (l16 != null) {
                            builderNewBuilder2.setTrackerMessageSeq(l16.longValue());
                        }
                        builderNewBuilder3 = GDILiveTrackMessagingProto.LiveTrackMessageBody.newBuilder();
                        if (l15 != null) {
                            builderNewBuilder3.setMessageId(l15.longValue());
                        }
                        str6 = s1Var2.f70923c;
                        if (str6 != null) {
                            builderNewBuilder3.setMessageText(str6);
                        }
                        if (l14 != null) {
                            builderNewBuilder3.setTimestamp(l14.longValue());
                        }
                        builderNewBuilder2.setLiveTrackMessageBody(builderNewBuilder3);
                        GDILiveTrackMessagingProto.LiveTrackMessage liveTrackMessageBuild2 = builderNewBuilder2.build();
                        liveTrackMessageBuild2.getClass();
                        builderNewBuilder.addLiveTrackMessages(liveTrackMessageBuild2);
                        j15 = j18;
                        it = it4;
                    }
                    GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse getLiveTrackMessagesResponseBuild2 = builderNewBuilder.build();
                    getLiveTrackMessagesResponseBuild2.getClass();
                    builderNewBuilder5.setGetLiveTrackMessagesResponse(getLiveTrackMessagesResponseBuild2);
                    Unit unit2 = Unit.INSTANCE;
                    m1Var.f70849d = null;
                    m1Var.f70846a = i15;
                    m1Var.f70847b = j16;
                    m1Var.f70848c = j15;
                    m1Var.f70852g = 2;
                    aVar2.getClass();
                } else if (g1Var instanceof xd2.g1.a.d) {
                    GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus getLiveTrackMessagesStatus3 = GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus.NETWORK_FAILURE;
                    m1Var.f70849d = null;
                    m1Var.f70846a = i15;
                    m1Var.f70847b = j16;
                    m1Var.f70848c = j15;
                    m1Var.f70852g = 3;
                    aVar2.getClass();
                } else {
                    if (g1Var instanceof xd2.g1.a) {
                        lc.u0.r();
                        return null;
                    }
                    GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus getLiveTrackMessagesStatus4 = GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus.SERVER_ERROR;
                    m1Var.f70849d = null;
                    m1Var.f70846a = i15;
                    m1Var.f70847b = j16;
                    m1Var.f70848c = j15;
                    m1Var.f70852g = 4;
                    aVar2.getClass();
                }
            }
        } else {
            logger.debug("ERROR: No group tracking session id found.");
            GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus getLiveTrackMessagesStatus5 = GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus.NOT_LIVE_TRACKING;
            m1Var.f70849d = null;
            m1Var.f70846a = i15;
            m1Var.f70847b = j8;
            m1Var.f70848c = j14;
            m1Var.f70852g = 5;
            aVar2.getClass();
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:91:0x0207  */
    /* JADX WARN: Code duplicated, block: B:96:0x021f  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c6, code lost:
    
        if (r1 == r14) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01df, code lost:
    
        if (fe2.j1.a.f(r15, r1, r4, r6, r13) == r14) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01fd, code lost:
    
        if (fe2.j1.a.f(r15, r1, r4, r6, r13) == r14) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0219, code lost:
    
        if (fe2.j1.a.f(r15, r1, r4, r6, r13) == r14) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023d, code lost:
    
        if (fe2.j1.a.f(r15, r1, r4, r6, r13) == r14) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i14, long j8, String str, String str2, wd2.j jVar, v13.c cVar) {
        n1 n1Var;
        String str3;
        xd2.g1 g1Var;
        List<ae2.f0> list;
        GDILiveTrackMessagingProto.SendLiveTrackMessageError.LiveTrackMessageErrorType liveTrackMessageErrorType;
        int i15 = i14;
        long j14 = j8;
        String str4 = str;
        if (cVar instanceof n1) {
            n1Var = (n1) cVar;
            int i16 = n1Var.f70868f;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                n1Var.f70868f = i16 - Integer.MIN_VALUE;
            } else {
                n1Var = new n1(this, cVar);
            }
        } else {
            n1Var = new n1(this, cVar);
        }
        n1 n1Var2 = n1Var;
        Object objC = n1Var2.f70866d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = n1Var2.f70868f;
        Context context = this.f70815a;
        a aVar2 = f70814e;
        switch (i17) {
            case 0:
                o13.r.b(objC);
                Logger logger = this.f70818d;
                logger.debug("handleGrouptrackSendMessagesRequest for device: " + j14 + ", senderSessionId: " + str2 + ", message " + jVar);
                if (str2 == null) {
                    logger.debug("ERROR: No group tracking session id found.");
                    GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus sendLiveTrackMessageStatus = GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus.NOT_LIVE_TRACKING;
                    n1Var2.f70865c = null;
                    n1Var2.f70863a = i15;
                    n1Var2.f70864b = j14;
                    n1Var2.f70868f = 6;
                    aVar2.getClass();
                    break;
                } else {
                    str3 = null;
                    s1 s1Var = new s1(jVar.f184507b, jVar.f184509d, jVar.f184508c, jVar.f184506a, str2, null, null);
                    n1Var2.f70865c = str4;
                    n1Var2.f70863a = i15;
                    n1Var2.f70864b = j14;
                    n1Var2.f70868f = 1;
                    objC = this.f70817c.C(j14, s1Var, n1Var2);
                    if (objC != aVar) {
                        g1Var = (xd2.g1) objC;
                        if (g1Var instanceof xd2.g1.b) {
                            list = (List) ((xd2.g1.b) g1Var).f190167a;
                            if (list == null && !list.isEmpty()) {
                                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                                for (ae2.f0 f0Var : list) {
                                    GDILiveTrackMessagingProto.SendLiveTrackMessageError.Builder builderNewBuilder = GDILiveTrackMessagingProto.SendLiveTrackMessageError.newBuilder();
                                    List<String> listC = f0Var.c();
                                    if (listC != null) {
                                        Iterator<T> it = listC.iterator();
                                        while (it.hasNext()) {
                                            builderNewBuilder.addSessionIds((String) it.next());
                                        }
                                    }
                                    ae2.g0 errorType = f0Var.getErrorType();
                                    if (errorType != null) {
                                        if (errorType instanceof ae2.g0.c) {
                                            liveTrackMessageErrorType = GDILiveTrackMessagingProto.SendLiveTrackMessageError.LiveTrackMessageErrorType.RECIPIENT_SESSION_INVALID;
                                        } else if (errorType instanceof ae2.g0.d) {
                                            liveTrackMessageErrorType = GDILiveTrackMessagingProto.SendLiveTrackMessageError.LiveTrackMessageErrorType.SENDER_SESSION_ENDED;
                                        } else if (errorType instanceof ae2.g0.b) {
                                            liveTrackMessageErrorType = GDILiveTrackMessagingProto.SendLiveTrackMessageError.LiveTrackMessageErrorType.RECIPIENT_SESSION_ENDED;
                                        } else {
                                            liveTrackMessageErrorType = errorType instanceof ae2.g0.e ? GDILiveTrackMessagingProto.SendLiveTrackMessageError.LiveTrackMessageErrorType.SENDER_SESSION_INVALID : GDILiveTrackMessagingProto.SendLiveTrackMessageError.LiveTrackMessageErrorType.UNKNOWN_ERROR;
                                        }
                                        builderNewBuilder.setLiveTrackMessageErrorType(liveTrackMessageErrorType);
                                    }
                                    String errorMessageText = f0Var.getErrorMessageText();
                                    if (errorMessageText != null) {
                                        builderNewBuilder.setErrorMessageText(errorMessageText);
                                    }
                                    GDILiveTrackMessagingProto.SendLiveTrackMessageError sendLiveTrackMessageErrorBuild = builderNewBuilder.build();
                                    sendLiveTrackMessageErrorBuild.getClass();
                                    arrayList.add(sendLiveTrackMessageErrorBuild);
                                }
                                n1Var2.f70865c = str3;
                                n1Var2.f70863a = i15;
                                n1Var2.f70864b = j14;
                                n1Var2.f70868f = 3;
                                aVar2.getClass();
                                Logger loggerA = i2.a("GrouptrackManager");
                                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((GDILiveTrackMessagingProto.SendLiveTrackMessageError) it3.next()).getLiveTrackMessageErrorType().name());
                                }
                                loggerA.debug("Responding with errors = " + arrayList2);
                                GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.Builder builderNewBuilder2 = GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.newBuilder();
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    builderNewBuilder2.addSendLiveTrackMessageErrors((GDILiveTrackMessagingProto.SendLiveTrackMessageError) it4.next());
                                }
                                GDILiveTrackMessagingProto.SendLiveTrackMessageResponse sendLiveTrackMessageResponseBuild = builderNewBuilder2.build();
                                GDILiveTrackMessagingProto.LiveTrackMessagingService.Builder builderNewBuilder3 = GDILiveTrackMessagingProto.LiveTrackMessagingService.newBuilder();
                                builderNewBuilder3.setSendLiveTrackMessageResponse(sendLiveTrackMessageResponseBuild);
                                Object objA = a.a(context, i15, str4, builderNewBuilder3, n1Var2);
                                if (objA != u13.a.COROUTINE_SUSPENDED) {
                                    objA = Unit.INSTANCE;
                                }
                            } else {
                                GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus sendLiveTrackMessageStatus2 = GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus.OK;
                                n1Var2.f70865c = str3;
                                n1Var2.f70863a = i15;
                                n1Var2.f70864b = j14;
                                n1Var2.f70868f = 2;
                                aVar2.getClass();
                            }
                        } else if (g1Var instanceof xd2.g1.a.d) {
                            if (g1Var instanceof xd2.g1.a) {
                                lc.u0.r();
                                return null;
                            }
                            GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus sendLiveTrackMessageStatus3 = GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus.SERVER_ERROR;
                            n1Var2.f70865c = str3;
                            n1Var2.f70863a = i15;
                            n1Var2.f70864b = j14;
                            n1Var2.f70868f = 5;
                            aVar2.getClass();
                        } else {
                            GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus sendLiveTrackMessageStatus4 = GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus.NETWORK_FAILURE;
                            n1Var2.f70865c = str3;
                            n1Var2.f70863a = i15;
                            n1Var2.f70864b = j14;
                            n1Var2.f70868f = 4;
                            aVar2.getClass();
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                long j15 = n1Var2.f70864b;
                int i18 = n1Var2.f70863a;
                str4 = n1Var2.f70865c;
                o13.r.b(objC);
                i15 = i18;
                j14 = j15;
                str3 = null;
                g1Var = (xd2.g1) objC;
                if (g1Var instanceof xd2.g1.b) {
                    list = (List) ((xd2.g1.b) g1Var).f190167a;
                    if (list == null) {
                        GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus sendLiveTrackMessageStatus5 = GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus.OK;
                        n1Var2.f70865c = str3;
                        n1Var2.f70863a = i15;
                        n1Var2.f70864b = j14;
                        n1Var2.f70868f = 2;
                        aVar2.getClass();
                    } else {
                        GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus sendLiveTrackMessageStatus6 = GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus.OK;
                        n1Var2.f70865c = str3;
                        n1Var2.f70863a = i15;
                        n1Var2.f70864b = j14;
                        n1Var2.f70868f = 2;
                        aVar2.getClass();
                    }
                    break;
                } else {
                    if (g1Var instanceof xd2.g1.a.d) {
                        if (g1Var instanceof xd2.g1.a) {
                            lc.u0.r();
                            return null;
                        }
                        GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus sendLiveTrackMessageStatus7 = GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus.SERVER_ERROR;
                        n1Var2.f70865c = str3;
                        n1Var2.f70863a = i15;
                        n1Var2.f70864b = j14;
                        n1Var2.f70868f = 5;
                        aVar2.getClass();
                    } else {
                        GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus sendLiveTrackMessageStatus8 = GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus.NETWORK_FAILURE;
                        n1Var2.f70865c = str3;
                        n1Var2.f70863a = i15;
                        n1Var2.f70864b = j14;
                        n1Var2.f70868f = 4;
                        aVar2.getClass();
                    }
                    break;
                }
                return aVar;
            case 2:
                o13.r.b(objC);
                return Unit.INSTANCE;
            case 3:
                o13.r.b(objC);
                return Unit.INSTANCE;
            case 4:
                o13.r.b(objC);
                return Unit.INSTANCE;
            case 5:
                o13.r.b(objC);
                return Unit.INSTANCE;
            case 6:
                o13.r.b(objC);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public final Object e(int i14, String str, GDIGroupLiveTrack.ResponseFailureStatus responseFailureStatus, l1 l1Var) {
        this.f70818d.debug("Respond to device with location error " + responseFailureStatus.name());
        GDIGroupLiveTrack.GetLastKnownLocationResponse.Builder groupTrackResponse = GDIGroupLiveTrack.GetLastKnownLocationResponse.newBuilder().setGroupTrackResponse(GDIGroupLiveTrack.GroupTrackResponse.newBuilder().setSuccess(false).setFailureStatus(responseFailureStatus));
        GDIGroupLiveTrack.GroupLiveTrackService.Builder builderNewBuilder = GDIGroupLiveTrack.GroupLiveTrackService.newBuilder();
        builderNewBuilder.setGetLastKnownLocationResponse(groupTrackResponse);
        f70814e.getClass();
        Object objD = a.d(this.f70815a, i14, str, builderNewBuilder, l1Var);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/j1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Object a(Context context, int i14, String str, GDILiveTrackMessagingProto.LiveTrackMessagingService.Builder builder, v13.c cVar) {
            x53.c cVar2 = o53.s0.f129406a;
            return ge1.b.e0(x53.b.f189152a, new h1(builder, context, str, i14, null), cVar);
        }

        public static Object b(Context context, int i14, String str, List list, v13.c cVar) {
            i2.a("GrouptrackManager").debug("Respond to device with " + list.size() + " connections/sessions/points");
            GDIGroupLiveTrack.GetLiveTrackConnectionsResponse.Builder builderNewBuilder = GDIGroupLiveTrack.GetLiveTrackConnectionsResponse.newBuilder();
            builderNewBuilder.setGroupTrackResponse(GDIGroupLiveTrack.GroupTrackResponse.newBuilder().setSuccess(true));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ae2.q0 q0Var = (ae2.q0) it.next();
                GDIGroupLiveTrack.LiveConnectionUserTrackPoint.Builder builderNewBuilder2 = GDIGroupLiveTrack.LiveConnectionUserTrackPoint.newBuilder();
                String userDisplayName = q0Var.getUserDisplayName();
                if (userDisplayName == null) {
                    userDisplayName = "";
                }
                builderNewBuilder2.setUserDisplayName(userDisplayName);
                ae2.k groupConnectionTrackPoint = q0Var.getGroupConnectionTrackPoint();
                builderNewBuilder2.setTrackPoint(groupConnectionTrackPoint != null ? o1.a(groupConnectionTrackPoint) : null);
                builderNewBuilder2.setIsLivetrackMessagingAvailable(p005kotlin.jvm.internal.s.g(q0Var.getLiveTrackMessagingAvailable(), Boolean.TRUE));
                builderNewBuilder.addTrackPoints(builderNewBuilder2);
            }
            GDIGroupLiveTrack.GroupLiveTrackService.Builder getLiveTrackConnectionsResponse = GDIGroupLiveTrack.GroupLiveTrackService.newBuilder().setGetLiveTrackConnectionsResponse(builderNewBuilder.build());
            getLiveTrackConnectionsResponse.getClass();
            Object objD = d(context, i14, str, getLiveTrackConnectionsResponse, cVar);
            return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
        }

        public static Object c(Context context, int i14, String str, ae2.i iVar, v13.c cVar) {
            Logger loggerA = i2.a("GrouptrackManager");
            List<ae2.k> listB = iVar.b();
            loggerA.debug("Respond to device with location response " + (listB != null ? new Integer(listB.size()) : null) + " points");
            GDIGroupLiveTrack.GetLastKnownLocationResponse.Builder builderNewBuilder = GDIGroupLiveTrack.GetLastKnownLocationResponse.newBuilder();
            builderNewBuilder.setGroupTrackResponse(GDIGroupLiveTrack.GroupTrackResponse.newBuilder().setSuccess(true));
            Boolean dirty = iVar.getDirty();
            if (dirty != null) {
                builderNewBuilder.setDirty(dirty.booleanValue());
            }
            List<ae2.k> listB2 = iVar.b();
            if (listB2 != null) {
                Iterator<T> it = listB2.iterator();
                while (it.hasNext()) {
                    builderNewBuilder.addTrackPoints(o1.a((ae2.k) it.next()));
                }
            }
            GDIGroupLiveTrack.GroupLiveTrackService.Builder builderNewBuilder2 = GDIGroupLiveTrack.GroupLiveTrackService.newBuilder();
            builderNewBuilder2.setGetLastKnownLocationResponse(builderNewBuilder);
            Object objD = d(context, i14, str, builderNewBuilder2, cVar);
            return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
        }

        public static Object d(Context context, int i14, String str, GDIGroupLiveTrack.GroupLiveTrackService.Builder builder, v13.c cVar) {
            x53.c cVar2 = o53.s0.f129406a;
            return ge1.b.e0(x53.b.f189152a, new i1(builder, context, str, i14, null), cVar);
        }

        public static Object e(Context context, int i14, String str, GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus getLiveTrackMessagesStatus, v13.c cVar) {
            i2.a("GrouptrackManager").debug("Responding with status = " + getLiveTrackMessagesStatus.name());
            GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.Builder builderNewBuilder = GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.newBuilder();
            builderNewBuilder.setGetLiveTrackMessagesStatus(getLiveTrackMessagesStatus);
            GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse getLiveTrackMessagesResponseBuild = builderNewBuilder.build();
            GDILiveTrackMessagingProto.LiveTrackMessagingService.Builder builderNewBuilder2 = GDILiveTrackMessagingProto.LiveTrackMessagingService.newBuilder();
            builderNewBuilder2.setGetLiveTrackMessagesResponse(getLiveTrackMessagesResponseBuild);
            Object objA = a(context, i14, str, builderNewBuilder2, cVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }

        public static Object f(Context context, int i14, String str, GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus sendLiveTrackMessageStatus, v13.c cVar) {
            i2.a("GrouptrackManager").debug("Responding with status = " + sendLiveTrackMessageStatus.name());
            GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.Builder builderNewBuilder = GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.newBuilder();
            builderNewBuilder.setSendLiveTrackMessageStatus(sendLiveTrackMessageStatus);
            GDILiveTrackMessagingProto.SendLiveTrackMessageResponse sendLiveTrackMessageResponseBuild = builderNewBuilder.build();
            GDILiveTrackMessagingProto.LiveTrackMessagingService.Builder builderNewBuilder2 = GDILiveTrackMessagingProto.LiveTrackMessagingService.newBuilder();
            builderNewBuilder2.setSendLiveTrackMessageResponse(sendLiveTrackMessageResponseBuild);
            Object objA = a(context, i14, str, builderNewBuilder2, cVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }

        private a() {
        }
    }
}
