package iw2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import java.util.LinkedHashMap;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Liw2/a;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1825a f95338a = new C1825a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cx2.h f95339b = new cx2.h("GFDIResponder", null, 2, null);

    /* JADX INFO: renamed from: iw2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Liw2/a$a;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1825a {

        /* JADX INFO: renamed from: iw2.a$a$b */
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f95345a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f95346b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f95347c;

            static {
                int[] iArr = new int[GDIRealtimeSettingsProto.CompositionResponse.ResponseStatus.values().length];
                try {
                    iArr[GDIRealtimeSettingsProto.CompositionResponse.ResponseStatus.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GDIRealtimeSettingsProto.CompositionResponse.ResponseStatus.PARTIAL_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f95345a = iArr;
                int[] iArr2 = new int[GDIRealtimeSettingsProto.SettingsResponse.ResponseStatus.values().length];
                try {
                    iArr2[GDIRealtimeSettingsProto.SettingsResponse.ResponseStatus.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                f95346b = iArr2;
                int[] iArr3 = new int[GDIRealtimeSettingsProto.ResponseStatus.values().length];
                try {
                    iArr3[GDIRealtimeSettingsProto.ResponseStatus.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr3[GDIRealtimeSettingsProto.ResponseStatus.FAIL.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr3[GDIRealtimeSettingsProto.ResponseStatus.CURRENTLY_UNAVAILABLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                f95347c = iArr3;
            }
        }

        public /* synthetic */ C1825a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String b(GeneratedMessageV3 generatedMessageV3) {
            try {
                return JsonFormat.printer().print(generatedMessageV3);
            } catch (InvalidProtocolBufferException e4) {
                a.f95339b.d(e4, "Buffer expression in parsing Protobuf and to convert to JSON ");
                return null;
            } catch (IllegalStateException e14) {
                a.f95339b.d(e14, "Unknown state to parse Protobuf");
                return null;
            } catch (Exception e15) {
                a.f95339b.d(e15, "Generic exception Protobuf");
                return null;
            }
        }

        public static JsonObject c(String str, String str2, String str3) {
            jw2.d.a.b bVar = new jw2.d.a.b(new jw2.d.a.C1949a(null, str, null), new jw2.d.a.C1949a(null, str2, null), new jw2.d.a.C1949a(null, str3, null));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(gw2.i.INFORMATION_MESSAGE.f79975a, bVar);
            com.garmin.realtimesettings.app.util.a.f52669a.getClass();
            String json = new GsonBuilder().setPrettyPrinting().create().toJson(linkedHashMap);
            json.getClass();
            Object objFromJson = new Gson().fromJson(json, (Class<Object>) JsonObject.class);
            objFromJson.getClass();
            return (JsonObject) objFromJson;
        }

        public static String d(Context context, String str, C1826a c1826a) {
            JsonObject jsonObject;
            if (str == null || (jsonObject = (JsonObject) new Gson().fromJson(str, JsonObject.class)) == null) {
                jsonObject = new JsonObject();
            }
            if (c1826a.f95343d) {
                a.f95339b.getClass();
                jsonObject.addProperty(gw2.i.EXIT_INSTANTIATION.f79975a, Boolean.TRUE);
            }
            if (c1826a.f95344e) {
                a.f95339b.getClass();
                jsonObject.addProperty(gw2.i.INVALIDATE.f79975a, Boolean.TRUE);
            }
            String str2 = c1826a.f95340a;
            if (str2 != null) {
                String str3 = gw2.i.INFORMATION_MESSAGE.f79975a;
                com.garmin.realtimesettings.app.util.a.f52669a.getClass();
                Object objFromJson = new Gson().fromJson(str2, (Class<Object>) JsonObject.class);
                objFromJson.getClass();
                jsonObject.add(str3, (JsonObject) objFromJson);
            } else if (c1826a.f95342c) {
                String string = context.getString(R.string.unable_to_update_settings);
                String strD = p6.b.d(context, R.string.unable_to_update_settings_description, string);
                String string2 = context.getString(R.string.lbl_ok);
                string2.getClass();
                JsonObject jsonObjectC = c(string, strD, string2);
                String str4 = gw2.i.INFORMATION_MESSAGE.f79975a;
                jsonObject.add(str4, jsonObjectC.get(str4));
            } else if (c1826a.f95341b) {
                a.f95339b.getClass();
                String string3 = context.getString(R.string.settings_failed_to_update);
                string3.getClass();
                String string4 = context.getString(R.string.txt_something_went_wrong_try_again);
                string4.getClass();
                String string5 = context.getString(R.string.lbl_ok);
                string5.getClass();
                JsonObject jsonObjectC2 = c(string3, string4, string5);
                String str5 = gw2.i.INFORMATION_MESSAGE.f79975a;
                jsonObject.add(str5, jsonObjectC2.get(str5));
            }
            String string6 = jsonObject.toString();
            string6.getClass();
            return string6;
        }

        public static String e(Context context, GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService) {
            String strB;
            context.getClass();
            cx2.h hVar = a.f95339b;
            hVar.getClass();
            if (!realtimeSettingsService.hasMenuChangeResponse()) {
                hVar.d(null, "menuChangeResponse: Did not get a menu change response");
                return null;
            }
            try {
                C1826a c1826a = new C1826a(null, false, false, false, false, 31, null);
                GDIRealtimeSettingsProto.ResponseStatus status = realtimeSettingsService.getMenuChangeResponse().getStatus();
                a.f95338a.getClass();
                Objects.toString(status);
                int i14 = status == null ? -1 : b.f95347c[status.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        c1826a.f95341b = true;
                    } else if (i14 != 3) {
                        c1826a.f95344e = true;
                    } else {
                        c1826a.f95342c = true;
                    }
                    strB = null;
                } else {
                    GDIRealtimeSettingsProto.MenuChangeResponse menuChangeResponse = realtimeSettingsService.getMenuChangeResponse();
                    menuChangeResponse.getClass();
                    strB = b(menuChangeResponse);
                }
                if (realtimeSettingsService.getMenuChangeResponse().getIsExitInstance()) {
                    c1826a.f95343d = true;
                }
                if (realtimeSettingsService.getMenuChangeResponse().getIsInvalidate()) {
                    c1826a.f95344e = true;
                }
                if (realtimeSettingsService.getMenuChangeResponse().hasInformationMessage()) {
                    GDIRealtimeSettingsProto.InformationMessage informationMessage = realtimeSettingsService.getMenuChangeResponse().getInformationMessage();
                    informationMessage.getClass();
                    c1826a.f95340a = b(informationMessage);
                }
                return d(context, strB, c1826a);
            } catch (NoSuchMethodError e4) {
                a.f95339b.d(null, "menuChangeResponse: Something new added in protos. Not able to proceed. " + e4);
                return d(context, null, new C1826a(null, false, false, false, true, 15, null));
            }
        }

        public static String f(Context context, GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService) {
            String strB;
            context.getClass();
            cx2.h hVar = a.f95339b;
            hVar.getClass();
            if (!realtimeSettingsService.hasSettingsChangeResponse()) {
                hVar.d(null, "settingsChangeResponse: Did not get a settings change response");
                return null;
            }
            try {
                C1826a c1826a = new C1826a(null, false, false, false, false, 31, null);
                GDIRealtimeSettingsProto.ResponseStatus status = realtimeSettingsService.getSettingsChangeResponse().getStatus();
                a.f95338a.getClass();
                Objects.toString(status);
                int i14 = status == null ? -1 : b.f95347c[status.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        c1826a.f95341b = true;
                    } else if (i14 != 3) {
                        c1826a.f95344e = true;
                    } else {
                        c1826a.f95342c = true;
                    }
                    strB = null;
                } else {
                    GDIRealtimeSettingsProto.SettingsChangeResponse settingsChangeResponse = realtimeSettingsService.getSettingsChangeResponse();
                    settingsChangeResponse.getClass();
                    strB = b(settingsChangeResponse);
                }
                if (realtimeSettingsService.getSettingsChangeResponse().getIsExitInstance()) {
                    c1826a.f95343d = true;
                }
                if (realtimeSettingsService.getSettingsChangeResponse().getIsInvalidate()) {
                    c1826a.f95344e = true;
                }
                if (realtimeSettingsService.getSettingsChangeResponse().hasInformationMessage()) {
                    GDIRealtimeSettingsProto.InformationMessage informationMessage = realtimeSettingsService.getSettingsChangeResponse().getInformationMessage();
                    informationMessage.getClass();
                    c1826a.f95340a = b(informationMessage);
                }
                return d(context, strB, c1826a);
            } catch (NoSuchMethodError e4) {
                a.f95339b.d(null, "settingsChangeResponse: Something new added in protos. Not able to proceed. " + e4);
                return d(context, null, new C1826a(null, false, false, false, true, 15, null));
            }
        }

        public static String g(GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService) {
            cx2.h hVar = a.f95339b;
            hVar.getClass();
            if (!realtimeSettingsService.hasSettingsResponse()) {
                hVar.d(null, "settingsDataResponse: Did not get the settings data values");
                return null;
            }
            GDIRealtimeSettingsProto.SettingsResponse.ResponseStatus status = realtimeSettingsService.getSettingsResponse().getStatus();
            if ((status == null ? -1 : b.f95346b[status.ordinal()]) != 1) {
                hVar.d(null, "settingsDataResponse: Did not get the settings data values ");
                return null;
            }
            GDIRealtimeSettingsProto.Settings settings = realtimeSettingsService.getSettingsResponse().getSettings();
            settings.getClass();
            return b(settings);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0096  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x00d7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d1 -> B:32:0x00d4). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:31:0x00d3
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public final java.lang.Object a(android.content.Context r14, long r15, int r17, com.garmin.proto.generated.GDIRealtimeSettingsProto.RealtimeSettingsService r18, v13.c r19) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: iw2.a.C1825a.a(android.content.Context, long, int, com.garmin.proto.generated.GDIRealtimeSettingsProto$RealtimeSettingsService, v13.c):java.lang.Object");
        }

        private C1825a() {
        }

        /* JADX INFO: renamed from: iw2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Liw2/a$a$a;", "", "", "informationMessage", "", "isFailed", "isCurrentlyUnavailable", "isExitInstantiate", "isInvalidate", "<init>", "(Ljava/lang/String;ZZZZ)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1826a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f95340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f95341b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f95342c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f95343d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f95344e;

            public /* synthetic */ C1826a(String str, boolean z14, boolean z15, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
                this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? false : z17);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1826a)) {
                    return false;
                }
                C1826a c1826a = (C1826a) obj;
                return p005kotlin.jvm.internal.s.g(this.f95340a, c1826a.f95340a) && this.f95341b == c1826a.f95341b && this.f95342c == c1826a.f95342c && this.f95343d == c1826a.f95343d && this.f95344e == c1826a.f95344e;
            }

            public final int hashCode() {
                String str = this.f95340a;
                return Boolean.hashCode(this.f95344e) + q6.f.g(q6.f.g(q6.f.g((str == null ? 0 : str.hashCode()) * 31, 31, this.f95341b), 31, this.f95342c), 31, this.f95343d);
            }

            public final String toString() {
                String str = this.f95340a;
                boolean z14 = this.f95341b;
                boolean z15 = this.f95342c;
                boolean z16 = this.f95343d;
                boolean z17 = this.f95344e;
                StringBuilder sbD = zl.a.d("DeviceResponseStates(informationMessage=", str, ", isFailed=", z14, ", isCurrentlyUnavailable=");
                kg.f.q(", isExitInstantiate=", ", isInvalidate=", sbD, z15, z16);
                return hb.a.k(sbD, z17, ")");
            }

            public C1826a(String str, boolean z14, boolean z15, boolean z16, boolean z17) {
                this.f95340a = str;
                this.f95341b = z14;
                this.f95342c = z15;
                this.f95343d = z16;
                this.f95344e = z17;
            }

            public C1826a() {
                this(null, false, false, false, false, 31, null);
            }
        }
    }
}
