package gw;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDISmsNotificationExtension;
import com.garmin.proto.generated.GDISmsNotificationProto;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0011BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lgw/j0;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Ljava/lang/Void;", "", "deviceUnitId", "", "Lsd2/c;", "smsReplies", "callReplies", "groupTrackReplies", "", "notifyDevice", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLjava/util/Set;Ljava/util/Set;Ljava/util/Set;ZLcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "b", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 extends com.garmin.android.library.backgroundtaskmanagement.b<Void> {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgw/j0$b;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "", "mDeviceUnitId", "", "Lsd2/c;", "mSmsCannedTextReplies", "mCallCannedTextReplies", "mGroupTrackTextReplies", "", "mNotifyDevice", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "<init>", "(Lgw/j0;JLjava/util/Set;Ljava/util/Set;Ljava/util/Set;ZLcom/garmin/android/library/backgroundtaskmanagement/b;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends com.garmin.android.library.backgroundtaskmanagement.d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f79513i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Set<sd2.c> f79514j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Set<sd2.c> f79515k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Set<sd2.c> f79516l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f79517m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(j0 j0Var, long j8, Set<? extends sd2.c> set, Set<? extends sd2.c> set2, Set<? extends sd2.c> set3, boolean z14, com.garmin.android.library.backgroundtaskmanagement.b<?> bVar) {
            super(bVar);
            bVar.getClass();
            this.f79513i = j8;
            this.f79514j = set;
            this.f79515k = set2;
            this.f79516l = set3;
            this.f79517m = z14;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            rd2.b bVarE = ConnectDatabase.g().e();
            long j8 = this.f79513i;
            Set<sd2.c> set = this.f79514j;
            if (set != null) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "SaveCannedTextOperation", "SaveCannedTextRepliesTask.executeTask: Saving sms text replies to Room DB.");
                rd2.c cVar = (rd2.c) bVarE;
                cVar.b(0, j8);
                cVar.c(new ArrayList(set));
            }
            Set<sd2.c> set2 = this.f79515k;
            if (set2 != null) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var2, "SaveCannedTextOperation", "SaveCannedTextRepliesTask.executeTask: Saving call text replies to Room DB.");
                rd2.c cVar2 = (rd2.c) bVarE;
                cVar2.b(1, j8);
                cVar2.c(new ArrayList(set2));
            }
            Set<sd2.c> set3 = this.f79516l;
            if (set3 != null) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var3, "SaveCannedTextOperation", "SaveCannedTextRepliesTask.executeTask: Saving Group Track text replies to Room DB.");
                rd2.c cVar3 = (rd2.c) bVarE;
                cVar3.b(3, j8);
                cVar3.c(new ArrayList(set3));
            }
            if (this.f79517m) {
                GDISmsNotificationProto.SmsCannedListChangedNotification.Builder builderNewBuilder = GDISmsNotificationProto.SmsCannedListChangedNotification.newBuilder();
                if (set != null) {
                    builderNewBuilder.addChangedTypes(GDISmsNotificationProto.CannedListType.SMS_MESSAGE_RESPONSE);
                }
                if (set2 != null) {
                    builderNewBuilder.addChangedTypes(GDISmsNotificationProto.CannedListType.PHONE_CALL_RESPONSE);
                }
                if (set3 != null) {
                    builderNewBuilder.addChangedTypes(GDISmsNotificationProto.CannedListType.GROUP_TRACK_RESPONSE);
                }
                if (builderNewBuilder.getChangedTypesCount() > 0) {
                    GDISmsNotificationProto.SmsNotificationService.Builder builderNewBuilder2 = GDISmsNotificationProto.SmsNotificationService.newBuilder();
                    builderNewBuilder2.setSmsCannedListChangedNotification(builderNewBuilder);
                    GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder3.setExtension(GDISmsNotificationExtension.smsNotificationService, builderNewBuilder2.build());
                    ((zb0.d0) KoinJavaComponent.get$default(zb0.d0.class, null, null, 6, null)).c(builderNewBuilder3.build(), j8);
                }
            }
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    static {
        new a(null);
    }

    public j0(long j8, Set<? extends sd2.c> set, Set<? extends sd2.c> set2, Set<? extends sd2.c> set3, boolean z14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        b(new b(this, j8, set, set2, set3, z14, this));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgw/j0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
