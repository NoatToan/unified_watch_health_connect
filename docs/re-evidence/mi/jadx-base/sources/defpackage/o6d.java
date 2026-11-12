package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mipay.sdk.app.MenuData;
import com.mipay.sdk.app.MipayWebActivity;
import java.util.ArrayList;
import java.util.List;
import miuipub.hybrid.HybridFeature;
import miuipub.hybrid.Request;
import miuipub.hybrid.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class o6d implements HybridFeature {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MipayWebActivity f28785a;

        public a(MipayWebActivity mipayWebActivity) {
            this.f28785a = mipayWebActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28785a.removeMenu();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MipayWebActivity f28787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28788b;
        public final /* synthetic */ List c;
        public final /* synthetic */ Request d;

        public class a implements MipayWebActivity.OptionsItemClickListener {
            public a() {
            }

            @Override // com.mipay.sdk.app.MipayWebActivity.OptionsItemClickListener
            public void onClick(int i) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("itemId", i);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                b.this.d.getCallback().callback(new Response(0, jSONObject));
            }
        }

        public b(MipayWebActivity mipayWebActivity, String str, List list, Request request) {
            this.f28787a = mipayWebActivity;
            this.f28788b = str;
            this.c = list;
            this.d = request;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28787a.setupMenu(TextUtils.equals(this.f28788b, "2"), this.c, new a());
        }
    }

    public final boolean a(String str) {
        return TextUtils.equals(str, "1") || TextUtils.equals(str, "2");
    }

    public final MenuData b(JSONObject jSONObject) {
        MenuData menuData = new MenuData();
        try {
            menuData.mItemId = jSONObject.getInt("itemId");
            menuData.mTitle = jSONObject.getString("title");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return menuData;
    }

    public final List<MenuData> c(String str) {
        ArrayList arrayList = null;
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("menuList");
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList2.add(b(jSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    e = e;
                    arrayList = arrayList2;
                }
            }
            return arrayList2;
        } catch (JSONException e2) {
            e = e2;
        }
        e.printStackTrace();
        return arrayList;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString("type");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final Response e(Request request) {
        Activity activity = request.getNativeInterface().getActivity();
        if (!(activity instanceof MipayWebActivity)) {
            return new Response(204, "activity type is not correct");
        }
        MipayWebActivity mipayWebActivity = (MipayWebActivity) activity;
        mipayWebActivity.runOnUiThread(new a(mipayWebActivity));
        return new Response(0);
    }

    public final Response f(Request request) {
        if (!(request.getNativeInterface().getActivity() instanceof MipayWebActivity)) {
            return new Response(204, "activity type is not correct");
        }
        String strD = d(request.getRawParams());
        List<MenuData> listC = c(request.getRawParams());
        if (!a(strD) || listC == null) {
            return new Response(204, "Menu data is not valid");
        }
        MipayWebActivity mipayWebActivity = (MipayWebActivity) request.getNativeInterface().getActivity();
        mipayWebActivity.runOnUiThread(new b(mipayWebActivity, strD, listC, request));
        return null;
    }

    @Override // miuipub.hybrid.HybridFeature
    public HybridFeature.Mode getInvocationMode(Request request) {
        if (TextUtils.equals(request.getAction(), CourseConfigModel.DevCmd.CMD_ACTION_SET)) {
            return HybridFeature.Mode.CALLBACK;
        }
        if (TextUtils.equals(request.getAction(), "remove")) {
            return HybridFeature.Mode.SYNC;
        }
        return null;
    }

    @Override // miuipub.hybrid.HybridFeature
    public Response invoke(Request request) {
        String action = request.getAction();
        if (TextUtils.equals(action, CourseConfigModel.DevCmd.CMD_ACTION_SET)) {
            return f(request);
        }
        return TextUtils.equals(action, "remove") ? e(request) : new Response(204, "no such action");
    }
}
