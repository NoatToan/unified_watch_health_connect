package com.garmin.android.apps.connectmobile.incidentdetection.service;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.nimbusds.jose.HeaderParameterNames;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0010\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0010\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "", "", "messageWhat", "", HeaderParameterNames.AUTHENTICATION_TAG, "<init>", "(ILjava/lang/String;)V", "f", JWKParameterNames.RSA_MODULUS, "d", JWKParameterNames.OCT_KEY_VALUE, "g", "p", "j", IntegerTokenConverter.CONVERTER_KEY, "l", "o", "a", "b", "c", "h", JWKParameterNames.RSA_EXPONENT, "m", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$a;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$b;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$c;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$d;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$e;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$f;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$g;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$h;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$i;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$j;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$k;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$l;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$m;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$n;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$o;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$p;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36880b;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.incidentdetection.service.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$a;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0659a extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0659a f36881c = new C0659a();

        private C0659a() {
            super(2, "CancelIncidentFromDevice", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$b;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f36882c = new b();

        private b() {
            super(2, "CancelIncidentFromGcm", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$c;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f36883c = new c();

        private c() {
            super(2, "CancelLiveTrackFromGcm", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$d;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "", "Ll20/a;", "contactList", "<init>", "(Ljava/util/List;)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<l20.a> f36884c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<l20.a> list) {
            super(1, "ContactListAvailable", null);
            list.getClass();
            this.f36884c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && s.g(this.f36884c, ((d) obj).f36884c);
        }

        public final int hashCode() {
            return this.f36884c.hashCode();
        }

        public final String toString() {
            return tn.k.h("ContactListAvailable(contactList=", ")", this.f36884c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$e;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "Lcq0/f;", "finishHow", "<init>", "(Lcq0/f;)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cq0.f f36885c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(cq0.f fVar) {
            super(6, "FinishIncident", null);
            fVar.getClass();
            this.f36885c = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f36885c == ((e) obj).f36885c;
        }

        public final int hashCode() {
            return this.f36885c.hashCode();
        }

        public final String toString() {
            return "FinishIncident(finishHow=" + this.f36885c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$g;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f36889c = new g();

        private g() {
            super(8, "LocalCountdownFinished", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$h;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f36890c = new h();

        private h() {
            super(2, "NotifyDeviceLiveTrackCanceled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$i;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f36891c = new i();

        private i() {
            super(6, "OnIAmOkExpired", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$j;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "", "secondsRemaining", "<init>", "(I)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36892c;

        public j(int i14) {
            super(5, "OnIAmOkTick", null);
            this.f36892c = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f36892c == ((j) obj).f36892c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f36892c);
        }

        public final String toString() {
            return e0.f(this.f36892c, "OnIAmOkTick(secondsRemaining=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$k;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "", "secondsRemaining", "<init>", "(I)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36893c;

        public k(int i14) {
            super(5, "OnIncidentTick", null);
            this.f36893c = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f36893c == ((k) obj).f36893c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f36893c);
        }

        public final String toString() {
            return e0.f(this.f36893c, "OnIncidentTick(secondsRemaining=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$l;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "", "secondsRemaining", "<init>", "(I)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36894c;

        public l(int i14) {
            super(7, "PauseIncident", null);
            this.f36894c = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f36894c == ((l) obj).f36894c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f36894c);
        }

        public final String toString() {
            return e0.f(this.f36894c, "PauseIncident(secondsRemaining=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$m;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "Lcom/garmin/proto/generated/GDILiveTrackProto$StartRequest;", "liveTrackProto", "<init>", "(Lcom/garmin/proto/generated/GDILiveTrackProto$StartRequest;)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class m extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GDILiveTrackProto.StartRequest f36895c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(GDILiveTrackProto.StartRequest startRequest) {
            super(4, "ReceivedLiveTrackSession", null);
            startRequest.getClass();
            this.f36895c = startRequest;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$p;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class p extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f36900c = new p();

        private p() {
            super(3, "TriggerIncident", null);
        }
    }

    private a(int i14, String str) {
        this.f36879a = i14;
        this.f36880b = str;
    }

    public /* synthetic */ a(int i14, String str, p005kotlin.jvm.internal.j jVar) {
        this(i14, str);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$o;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "", "optional", "<init>", "(I)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36899c;

        public o(int i14) {
            super(5, "TriggerIamOk", null);
            this.f36899c = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f36899c == ((o) obj).f36899c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f36899c);
        }

        public final String toString() {
            return e0.f(this.f36899c, "TriggerIamOk(optional=", ")");
        }

        public o() {
            this(0, 1, null);
        }

        public /* synthetic */ o(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? 0 : i14);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$f;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "", "deviceId", "Lcom/garmin/proto/generated/GDILiveTrackProto$EmergencyCountdownNotification;", "protobuf", "", "isFallDetection", "<init>", "(JLcom/garmin/proto/generated/GDILiveTrackProto$EmergencyCountdownNotification;Z)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f36886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final GDILiveTrackProto.EmergencyCountdownNotification f36887d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f36888e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j8, GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification, boolean z14) {
            super(1, "IncidentDetected", null);
            emergencyCountdownNotification.getClass();
            this.f36886c = j8;
            this.f36887d = emergencyCountdownNotification;
            this.f36888e = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f36886c == fVar.f36886c && s.g(this.f36887d, fVar.f36887d) && this.f36888e == fVar.f36888e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f36888e) + ((this.f36887d.hashCode() + (Long.hashCode(this.f36886c) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("IncidentDetected(deviceId=");
            sb3.append(this.f36886c);
            sb3.append(", protobuf=");
            sb3.append(this.f36887d);
            return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", isFallDetection=", this.f36888e, ")");
        }

        public /* synthetic */ f(long j8, GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(j8, emergencyCountdownNotification, (i14 & 4) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a$n;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/service/a;", "", "deviceId", "Lcom/garmin/proto/generated/GDILiveTrackProto$EmergencyCountdownNotification;", "protobuf", "", "isFallDetection", "<init>", "(JLcom/garmin/proto/generated/GDILiveTrackProto$EmergencyCountdownNotification;Z)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f36896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final GDILiveTrackProto.EmergencyCountdownNotification f36897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f36898e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(long j8, GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification, boolean z14) {
            super(1, "ResumedDetected", null);
            emergencyCountdownNotification.getClass();
            this.f36896c = j8;
            this.f36897d = emergencyCountdownNotification;
            this.f36898e = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f36896c == nVar.f36896c && s.g(this.f36897d, nVar.f36897d) && this.f36898e == nVar.f36898e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f36898e) + ((this.f36897d.hashCode() + (Long.hashCode(this.f36896c) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ResumedDetected(deviceId=");
            sb3.append(this.f36896c);
            sb3.append(", protobuf=");
            sb3.append(this.f36897d);
            return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", isFallDetection=", this.f36898e, ")");
        }

        public /* synthetic */ n(long j8, GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(j8, emergencyCountdownNotification, (i14 & 4) != 0 ? false : z14);
        }
    }
}
