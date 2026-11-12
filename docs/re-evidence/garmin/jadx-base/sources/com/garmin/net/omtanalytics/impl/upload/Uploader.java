package com.garmin.net.omtanalytics.impl.upload;

import android.content.Context;
import android.util.Base64;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.ByteString;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import ds.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p13.k0;
import p13.y;
import yt2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/net/omtanalytics/impl/upload/Uploader;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "b", "Lcom/garmin/net/omtanalytics/impl/upload/c;", "remoteService", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Uploader extends Worker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f52481e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f52482f = m.b(a.f52483a);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f52483a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            return LoggerFactory.getLogger("OMT#Uploader");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/garmin/net/omtanalytics/impl/upload/c;", "invoke", "()Lcom/garmin/net/omtanalytics/impl/upload/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends w implements e23.a<com.garmin.net.omtanalytics.impl.upload.c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f52485b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8) {
            super(0);
            this.f52485b = j8;
        }

        @Override // e23.a
        public final com.garmin.net.omtanalytics.impl.upload.c invoke() {
            Uploader uploader = Uploader.this;
            String strE = uploader.f11470b.f11427b.e("key_base_url");
            strE.getClass();
            WorkerParameters workerParameters = uploader.f11470b;
            String strE2 = workerParameters.f11427b.e("key_client_name");
            strE2.getClass();
            String strE3 = workerParameters.f11427b.e("key_client_version");
            strE3.getClass();
            String strE4 = workerParameters.f11427b.e("key_client_guid");
            strE4.getClass();
            return new com.garmin.net.omtanalytics.impl.upload.c(strE, strE2, strE3, strE4, this.f52485b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uploader(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final androidx.work.d.a c() {
        com.garmin.net.omtanalytics.impl.upload.c cVar;
        AtomicInteger atomicInteger = this.f11471c;
        b bVar = f52481e;
        WorkerParameters workerParameters = this.f11470b;
        int iC = workerParameters.f11427b.c("key_max_events_per_batch", 200);
        t tVarB = m.b(new c(workerParameters.f11427b.d("key_call_timeout_millis", 60000L)));
        List listB = j0.f134944a;
        do {
            try {
                if (atomicInteger.get() != -256) {
                    bVar.getClass();
                    b.a().debug("work cancelled...");
                    au2.a.f13046e.getClass();
                    au2.a.c.d(listB);
                    return new androidx.work.d.a.c();
                }
                au2.a.c cVar2 = au2.a.f13046e;
                Context context = this.f11469a;
                context.getClass();
                cVar2.getClass();
                listB = au2.a.c.b(iC, context);
                if (listB.isEmpty()) {
                    f.f199669a.getClass();
                    return new androidx.work.d.a.c();
                }
                if (atomicInteger.get() != -256) {
                    bVar.getClass();
                    b.a().debug("work cancelled...");
                    au2.a.c.d(listB);
                    return new androidx.work.d.a.c();
                }
                cVar = (com.garmin.net.omtanalytics.impl.upload.c) tVarB.getValue();
                bVar.getClass();
            } catch (Exception e4) {
                bVar.getClass();
                b.a().error("doWork", (Throwable) e4);
                au2.a.f13046e.getClass();
                au2.a.c.d(listB);
                return new androidx.work.d.a.C0165a();
            }
        } while (b.b(cVar, listB));
        return new androidx.work.d.a.C0165a();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/garmin/net/omtanalytics/impl/upload/Uploader$b;", "", "<init>", "()V", "", "KEY_BASE_URL", "Ljava/lang/String;", "KEY_CALL_TIMEOUT_MILLIS", "KEY_CLIENT_GUID", "KEY_CLIENT_NAME", "KEY_CLIENT_VERSION", "KEY_MAX_EVENTS_PER_BATCH", "", "MAX_UPLOAD_SIZE_IN_BYTES", "I", "WORK_NAME", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        public static Logger a() {
            return (Logger) Uploader.f52482f.getValue();
        }

        public static boolean b(com.garmin.net.omtanalytics.impl.upload.c cVar, List list) {
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((au2.a.C0184a) it.next()).f13054b);
            }
            zt2.b bVar = new zt2.b(arrayList);
            cVar.getClass();
            com.garmin.net.omtanalytics.impl.upload.b.C1123b.C1124b builder = com.garmin.net.omtanalytics.impl.upload.b.C1123b.f52523c.toBuilder();
            for (zt2.a aVar : bVar.a()) {
                com.garmin.net.omtanalytics.impl.upload.b.a.C1122b builder2 = com.garmin.net.omtanalytics.impl.upload.b.a.f52510g.toBuilder();
                String eventType = aVar.getEventType();
                eventType.getClass();
                builder2.f52518b = eventType;
                builder2.f52517a |= 1;
                builder2.onChanged();
                com.garmin.net.omtanalytics.impl.upload.a.C1118a.b builder3 = com.garmin.net.omtanalytics.impl.upload.a.C1118a.f52489e.toBuilder();
                com.garmin.net.omtanalytics.impl.upload.a.b bVar2 = com.garmin.net.omtanalytics.impl.upload.a.b.MILLISECONDS;
                bVar2.getClass();
                builder3.f52494a |= 2;
                builder3.f52496c = bVar2.f52505a;
                builder3.onChanged();
                builder3.f52495b = aVar.getTimestamp();
                builder3.f52494a = 1 | builder3.f52494a;
                builder3.onChanged();
                com.garmin.net.omtanalytics.impl.upload.a.C1118a c1118aBuildPartial = builder3.buildPartial();
                if (!c1118aBuildPartial.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) c1118aBuildPartial);
                }
                SingleFieldBuilderV3<com.garmin.net.omtanalytics.impl.upload.a.C1118a, com.garmin.net.omtanalytics.impl.upload.a.C1118a.b, Object> singleFieldBuilderV3 = builder2.f52520d;
                if (singleFieldBuilderV3 == null) {
                    builder2.f52519c = c1118aBuildPartial;
                } else {
                    singleFieldBuilderV3.setMessage(c1118aBuildPartial);
                }
                builder2.f52517a |= 2;
                builder2.onChanged();
                ByteString byteStringCopyFrom = ByteString.copyFrom(Base64.decode(aVar.getPayload(), 0));
                byteStringCopyFrom.getClass();
                builder2.f52521e = byteStringCopyFrom;
                builder2.f52517a |= 4;
                builder2.onChanged();
                com.garmin.net.omtanalytics.impl.upload.b.a aVarBuildPartial = builder2.buildPartial();
                if (!aVarBuildPartial.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) aVarBuildPartial);
                }
                RepeatedFieldBuilderV3<com.garmin.net.omtanalytics.impl.upload.b.a, com.garmin.net.omtanalytics.impl.upload.b.a.C1122b, Object> repeatedFieldBuilderV3 = builder.f52528c;
                if (repeatedFieldBuilderV3 == null) {
                    builder.c();
                    builder.f52527b.add(aVarBuildPartial);
                    builder.onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(aVarBuildPartial);
                }
            }
            d dVar = cVar.f52529a;
            com.garmin.net.omtanalytics.impl.upload.b.C1123b c1123bBuildPartial = builder.buildPartial();
            if (!c1123bBuildPartial.isInitialized()) {
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) c1123bBuildPartial);
            }
            int iCode = dVar.a(c1123bBuildPartial).execute().f25745a.code();
            if (iCode >= 0 && iCode < 400) {
                au2.a.f13046e.getClass();
                au2.a.c.a(list);
                f.f199669a.getClass();
                return true;
            }
            if (iCode != 400) {
                a().warn(o2.c.e(iCode, "response code ", " due to server side error [", c(list), "]"));
                au2.a.f13046e.getClass();
                au2.a.c.d(list);
                return false;
            }
            e0.u("response code 400 due to client side error [", c(list), "]", a());
            au2.a.f13046e.getClass();
            au2.a.c.a(list);
            return true;
        }

        public static final String c(List<au2.a.C0184a> list) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(k0Var);
            ArrayList<zt2.a> arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((au2.a.C0184a) it.next()).f13054b);
            }
            for (zt2.a aVar : arrayList) {
                String eventType = aVar.getEventType();
                int iIntValue = 1;
                if (linkedHashMap.containsKey(aVar.getEventType())) {
                    Object obj = linkedHashMap.get(aVar.getEventType());
                    obj.getClass();
                    iIntValue = 1 + ((Number) obj).intValue();
                }
                linkedHashMap.put(eventType, Integer.valueOf(iIntValue));
            }
            return linkedHashMap.toString();
        }

        private b() {
        }
    }
}
