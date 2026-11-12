package iu1;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class f<T extends s1> implements e<T> {
    public static Object c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e4) {
            i2.i("GCMParser", cls.getSimpleName().concat(" must implement the default constructor"));
            i2.i("GCMParser", "IllegalAccessException: " + e4.getMessage());
            com.google.protobuf.a.m();
            return null;
        } catch (InstantiationException e14) {
            i2.i("GCMParser", "Could not instantiate ".concat(cls.getSimpleName()));
            i2.i("GCMParser", "InstantiationException: " + e14.getMessage());
            com.google.protobuf.a.m();
            return null;
        }
    }

    public static s1 d(Class cls, String str) {
        if (str == null || cls == null) {
            i2.i("GCMParser", "Missing parameter  [" + str + "] - [" + cls + "]");
            return null;
        }
        s1 s1Var = (s1) c(cls);
        String simpleName = s1Var.getClass().getSimpleName();
        try {
            s1Var.m(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(str) ? "{}" : str);
            return s1Var;
        } catch (JSONException e4) {
            StringBuilder sbL = hb.a.l("Error parsing JSON object -- ", simpleName, " -- ");
            sbL.append(e4.getMessage());
            sbL.append("\n");
            sbL.append(str);
            i2.i("GCMParser", sbL.toString());
            return null;
        }
    }

    @Override // iu1.e
    public final List a(Class cls, String str) {
        if (str == null || cls == null) {
            i2.i("GCMParser", "Missing parameter  [" + str + "] - [" + cls + "]");
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                s1 s1Var = (s1) c(cls);
                s1Var.k(jSONArray.getJSONObject(i14));
                arrayList.add(s1Var);
            }
            return arrayList;
        } catch (JSONException e4) {
            i2.i("GCMParser", "Error parsing JSON object: : " + e4.getMessage());
            return null;
        }
    }

    @Override // iu1.e
    public final /* bridge */ /* synthetic */ Object b(Class cls, String str) {
        return d(cls, str);
    }
}
