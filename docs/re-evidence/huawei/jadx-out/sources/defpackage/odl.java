package defpackage;

import android.util.JsonReader;
import com.huawei.multisimsdk.odsa.response.OdsaResponseParam;
import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: loaded from: classes12.dex */
public class odl {
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    public static OdsaResponseParam d(String str) {
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        OdsaResponseParam odsaResponseParam = new OdsaResponseParam();
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "Vers":
                        j(jsonReader, odsaResponseParam);
                        break;
                    case "Token":
                        i(jsonReader, odsaResponseParam);
                        break;
                    case "AccessControl":
                        a(jsonReader, odsaResponseParam);
                        break;
                    case "ap2006":
                        d(jsonReader, odsaResponseParam);
                        break;
                    case "portal_url":
                        odsaResponseParam.setPortalUrl(jsonReader.nextString());
                        break;
                    case "post_data":
                        odsaResponseParam.setPostData(jsonReader.nextString());
                        break;
                    case "data":
                        g(new JsonReader(new StringReader(jsonReader.nextString())), odsaResponseParam);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            jsonReader.close();
            return odsaResponseParam;
        } catch (IOException | IllegalStateException unused) {
            ocq.c("OdsaResolveJsonParser", "pullParserJson error");
            return odsaResponseParam;
        }
    }

    private static void e(JsonReader jsonReader, OdsaResponseParam odsaResponseParam) throws IllegalStateException, IOException {
        jsonReader.beginArray();
        if (jsonReader.hasNext()) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                if (strNextName.equals("CompanionConfiguration")) {
                    c(jsonReader, odsaResponseParam);
                } else {
                    ocq.a("OdsaResolveJsonParser", "unexpected tag");
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    private static void c(JsonReader jsonReader, OdsaResponseParam odsaResponseParam) throws IllegalStateException, IOException {
        byte b2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ServiceStatus":
                    b2 = 0;
                    break;
                case "PollingInterval":
                    b2 = 1;
                    break;
                case "ICCID":
                    b2 = 2;
                    break;
                case "DownloadInfo":
                    b2 = 3;
                    break;
                case "CompanionDeviceService":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                odsaResponseParam.setServiceStatus(jsonReader.nextString());
            } else if (b2 == 1) {
                odsaResponseParam.setPollingInterval(jsonReader.nextInt());
                odsaResponseParam.setOperationType(oeb.f44225a[5]);
            } else if (b2 == 2) {
                odsaResponseParam.setIccid(jsonReader.nextString());
                odsaResponseParam.setOperationType(oeb.f44225a[3]);
            } else if (b2 == 3) {
                f(jsonReader, odsaResponseParam);
            } else if (b2 == 4) {
                odsaResponseParam.setCompanionDeviceServices(jsonReader.nextString());
            } else {
                ocq.a("OdsaResolveJsonParser", "unexpected tag");
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    private static void f(JsonReader jsonReader, OdsaResponseParam odsaResponseParam) throws IllegalStateException, IOException {
        byte b2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1144770036) {
                if (iHashCode != 112594789) {
                    if (iHashCode == 1367384411 && strNextName.equals("ProfileIccid")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (strNextName.equals("ProfileSmdpAddress")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (strNextName.equals("ProfileActivationCode")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                odsaResponseParam.setProfileActivationCode(jsonReader.nextString());
            } else if (b2 == 1) {
                odsaResponseParam.setProfileSmdpAddress(jsonReader.nextString());
            } else if (b2 == 2) {
                odsaResponseParam.setProfileIccid(jsonReader.nextString());
            } else {
                ocq.a("OdsaResolveJsonParser", "unexpected tag");
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void j(JsonReader jsonReader, OdsaResponseParam odsaResponseParam) throws IllegalStateException, IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("validity")) {
                odsaResponseParam.setValidity(String.valueOf(jsonReader.nextInt()));
            } else if (strNextName.equals("version")) {
                odsaResponseParam.setVersion(String.valueOf(jsonReader.nextInt()));
            } else {
                ocq.a("OdsaResolveJsonParser", "unexpected tag");
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void i(JsonReader jsonReader, OdsaResponseParam odsaResponseParam) throws IllegalStateException, IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("token")) {
                odsaResponseParam.setToken(jsonReader.nextString());
            } else {
                ocq.a("OdsaResolveJsonParser", "unexpected tag");
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void g(JsonReader jsonReader, OdsaResponseParam odsaResponseParam) throws IllegalStateException, IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("es_token")) {
                odsaResponseParam.setToken(jsonReader.nextString());
            } else {
                ocq.a("OdsaResolveJsonParser", "unexpected tag");
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void a(JsonReader jsonReader, OdsaResponseParam odsaResponseParam) throws IllegalStateException, IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("default")) {
                b(jsonReader, odsaResponseParam);
            } else {
                ocq.a("OdsaResolveJsonParser", "unexpected tag");
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void b(JsonReader jsonReader, OdsaResponseParam odsaResponseParam) throws IllegalStateException, IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("appId")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    odsaResponseParam.setAppId(jsonReader.nextString());
                }
                jsonReader.endArray();
            } else {
                ocq.a("OdsaResolveJsonParser", "unexpected tag");
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    private static void d(JsonReader jsonReader, OdsaResponseParam odsaResponseParam) throws IllegalStateException, IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "CompanionAppEligibility":
                    odsaResponseParam.setCompanionAppEligibility(String.valueOf(jsonReader.nextInt()));
                    odsaResponseParam.setOperationType(oeb.f44225a[0]);
                    break;
                case "NotEnabledContentsType":
                    odsaResponseParam.setNotEnabledContentsType(jsonReader.nextString());
                    break;
                case "NotEnabledUserData":
                    odsaResponseParam.setNotEnabledUserData(jsonReader.nextString());
                    break;
                case "SubscriptionServiceURL":
                    odsaResponseParam.setSubscriptionServiceUrl(jsonReader.nextString());
                    odsaResponseParam.setOperationType(oeb.f44225a[1]);
                    break;
                case "SubscriptionServiceContentsType":
                    odsaResponseParam.setsubscriptionServiceContentsType(jsonReader.nextString());
                    break;
                case "SubscriptionResult":
                    odsaResponseParam.setSubscriptionResult(jsonReader.nextInt());
                    break;
                case "ProfileSmdpAddress":
                    odsaResponseParam.setProfileSmdpAddress(jsonReader.nextString());
                    odsaResponseParam.setOperationType(oeb.f44225a[1]);
                    break;
                case "SubscriptionServiceUserData":
                    odsaResponseParam.setSubscriptionServiceUserData(jsonReader.nextString());
                    break;
                case "CompanionConfigurations":
                    e(jsonReader, odsaResponseParam);
                    break;
                case "OperationResult":
                    odsaResponseParam.setOperationResult(jsonReader.nextInt());
                    break;
                case "CompanionDeviceServices":
                    odsaResponseParam.setCompanionDeviceServices(jsonReader.nextString());
                    break;
                case "NotEnabledURL":
                    odsaResponseParam.setNotEnabledUrl(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
    }
}
