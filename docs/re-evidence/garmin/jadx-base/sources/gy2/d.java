package gy2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f80303a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f80304b = null;

    public final void a(JSONObject jSONObject) throws JSONException {
        String string;
        c.b bVar;
        g gVar;
        if (!jSONObject.isNull("serviceHost")) {
            jSONObject.getString("serviceHost");
        }
        this.f80303a = Integer.valueOf(jSONObject.optInt("numOfMessages", 0));
        if (jSONObject.isNull("messages")) {
            return;
        }
        this.f80304b = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            c cVar = new c();
            JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
            jSONObject2.getClass();
            if (!jSONObject2.isNull("messageId")) {
                cVar.f80293d = Long.valueOf(jSONObject2.getLong("messageId"));
            }
            if (!jSONObject2.isNull("messageType")) {
                String string2 = jSONObject2.getString("messageType");
                if (string2 == null || string2.length() == 0) {
                    gVar = g.UNKNOWN_TYPE;
                } else {
                    g.f80311d.getClass();
                    LinkedHashMap linkedHashMap = g.f80312e;
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = string2.toLowerCase(locale);
                    lowerCase.getClass();
                    gVar = (g) linkedHashMap.get(lowerCase);
                    if (gVar == null) {
                        gVar = g.UNKNOWN_TYPE;
                    }
                }
                cVar.f80295f = gVar;
            }
            if (!jSONObject2.isNull("messageStatus")) {
                String string3 = jSONObject2.getString("messageStatus");
                if (string3 == null || string3.length() == 0) {
                    bVar = c.b.UNKNOWN_STATUS;
                } else {
                    c.b.f80297b.getClass();
                    bVar = (c.b) c.b.f80298c.get(string3);
                    if (bVar == null) {
                        bVar = c.b.UNKNOWN_STATUS;
                    }
                }
                cVar.f80296g = bVar;
            }
            if (!jSONObject2.isNull("deviceId")) {
                cVar.f80290a = Long.valueOf(jSONObject2.getLong("deviceId"));
            }
            if (!jSONObject2.isNull("deviceName")) {
                jSONObject2.getString("deviceName");
            }
            if (!jSONObject2.isNull("applicationKey")) {
                jSONObject2.getString("applicationKey");
            }
            if (!jSONObject2.isNull("firmwareVersion")) {
                cVar.f80292c = jSONObject2.getString("firmwareVersion");
            }
            if (!jSONObject2.isNull("deviceXmlDataType")) {
                cVar.f80291b = jSONObject2.getString("deviceXmlDataType");
            }
            if (!jSONObject2.isNull("metaData")) {
                cVar.f80294e = new h();
                JSONObject jSONObject3 = jSONObject2.getJSONObject("metaData");
                h hVar = cVar.f80294e;
                hVar.getClass();
                if (jSONObject3 != null) {
                    if (!jSONObject3.isNull(NotificationConstants.KEY_DATA_MIME_TYPE)) {
                        jSONObject3.getString(NotificationConstants.KEY_DATA_MIME_TYPE);
                    }
                    if (!jSONObject3.isNull("partNumber")) {
                        hVar.f80327a = jSONObject3.getString("partNumber");
                    }
                    if (!jSONObject3.isNull("version")) {
                        hVar.f80328b = jSONObject3.getString("version");
                    }
                    if (!jSONObject3.isNull("path")) {
                        hVar.f80329c = jSONObject3.getString("path");
                    }
                    if (!jSONObject3.isNull("fileSize")) {
                        hVar.f80330d = Long.valueOf(jSONObject3.getLong("fileSize"));
                    }
                    if (!jSONObject3.isNull("serverPath")) {
                        hVar.f80331e = jSONObject3.getString("serverPath");
                    }
                    if (!jSONObject3.isNull("secureServerPath")) {
                        hVar.f80332f = jSONObject3.getString("secureServerPath");
                    }
                    if (!jSONObject3.isNull("fileName")) {
                        hVar.f80333g = jSONObject3.getString("fileName");
                    }
                    if (!jSONObject3.isNull("filenameOnDevice")) {
                        hVar.f80334h = jSONObject3.getString("filenameOnDevice");
                    }
                    if (!jSONObject3.isNull("productName")) {
                        hVar.f80335i = jSONObject3.getString("productName");
                    }
                    if (!jSONObject3.isNull("dataType")) {
                        hVar.f80336j = jSONObject3.getString("dataType");
                    }
                    if (!jSONObject3.isNull("notes")) {
                        jSONObject3.getString("notes");
                    }
                    if (!jSONObject3.isNull("instructions")) {
                        hVar.f80337k = jSONObject3.getString("instructions");
                    }
                    if (!jSONObject3.isNull("installationOrder")) {
                        jSONObject3.getInt("installationOrder");
                    }
                    if (!jSONObject3.isNull("changeLog")) {
                        hVar.f80338l = new ArrayList();
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("changeLog");
                        for (int i15 = 0; i15 < jSONArray2.length(); i15++) {
                            JSONObject jSONObject4 = jSONArray2.getJSONObject(i15);
                            b bVar2 = new b();
                            if (jSONObject4 != null) {
                                if (!jSONObject4.isNull("messageId")) {
                                    jSONObject4.getLong("messageId");
                                }
                                if (!jSONObject4.isNull("partNumber")) {
                                    jSONObject4.getString("partNumber");
                                }
                                if (!jSONObject4.isNull("fromVersion")) {
                                    jSONObject4.getString("fromVersion");
                                }
                                if (!jSONObject4.isNull("toVersion")) {
                                    jSONObject4.getString("toVersion");
                                }
                                if (!jSONObject4.isNull("changeDetail")) {
                                    jSONObject4.getString("changeDetail");
                                }
                            }
                            hVar.f80338l.add(bVar2);
                        }
                    }
                    if (!jSONObject3.isNull("deliveryRestrictions")) {
                        hVar.f80344r = new ArrayList();
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("deliveryRestrictions");
                        for (int i16 = 0; i16 < jSONArray3.length(); i16++) {
                            hVar.f80344r.add(jSONArray3.getString(i16));
                        }
                    }
                    if (!jSONObject3.isNull("fileType") && (string = jSONObject3.getString("fileType")) != null && string.length() > 0) {
                        hVar.f80339m = string.toUpperCase();
                    }
                    if (!jSONObject3.isNull("messageUrl")) {
                        hVar.f80340n = jSONObject3.getString("messageUrl");
                    }
                    if (!jSONObject3.isNull("messageName")) {
                        hVar.f80341o = jSONObject3.getString("messageName");
                    }
                    if (!jSONObject3.isNull("priority")) {
                        hVar.f80342p = Integer.valueOf(jSONObject3.getInt("priority"));
                    }
                    if (!jSONObject3.isNull("appDetails")) {
                        hVar.f80343q = new a();
                        JSONObject jSONObject5 = jSONObject3.getJSONObject("appDetails");
                        hVar.f80343q.getClass();
                        if (jSONObject5 != null) {
                            if (!jSONObject5.isNull(TtmlNode.ATTR_ID)) {
                                jSONObject5.getString(TtmlNode.ATTR_ID);
                            }
                            if (!jSONObject5.isNull(NotificationConstants.KEY_DATA_MIME_TYPE)) {
                                jSONObject5.getString(NotificationConstants.KEY_DATA_MIME_TYPE);
                            }
                            if (!jSONObject5.isNull("developerName")) {
                                jSONObject5.getString("developerName");
                            }
                            if (!jSONObject5.isNull("developerId")) {
                                jSONObject5.getString("developerId");
                            }
                            if (!jSONObject5.isNull("appSize")) {
                                jSONObject5.getLong("appSize");
                            }
                        }
                    }
                }
            }
            this.f80304b.add(cVar);
        }
    }
}
