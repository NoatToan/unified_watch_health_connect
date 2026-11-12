package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qki extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayMap<String, a> f46382c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ListView f46383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f46384b;
    private View d;

    static {
        ArrayMap<String, a> arrayMap = new ArrayMap<>();
        f46382c = arrayMap;
        a aVar = new a(R.string.IDS_permission_usage_contacts, e(R.string.IDS_permission_description_contacts, R.string.IDS_permission_description_contacts, R.string.IDS_eu_perm_des_contacts, R.string.IDS_permission_description_contacts));
        arrayMap.put("android.permission.READ_CONTACTS", aVar);
        arrayMap.put("android.permission.GET_ACCOUNTS", aVar);
        a aVar2 = new a(R.string.IDS_permission_usage_calendar, e(R.string.IDS_permission_description_calendar, R.string.IDS_asia_ru_perm_des_calendar, R.string.IDS_eu_perm_des_calendar, R.string.IDS_asia_ru_perm_des_calendar));
        arrayMap.put("android.permission.READ_CALENDAR", aVar2);
        arrayMap.put("android.permission.WRITE_CALENDAR", aVar2);
        a aVar3 = new a(R.string.IDS_permission_usage_sms, e(R.string.IDS_permission_description_sms, R.string.IDS_permission_description_sms, R.string.IDS_eu_perm_des_sms, R.string.IDS_permission_description_sms));
        arrayMap.put("android.permission.SEND_SMS", aVar3);
        arrayMap.put("android.permission.RECEIVE_SMS", aVar3);
        arrayMap.put("android.permission.READ_SMS", aVar3);
        arrayMap.put("android.permission.RECEIVE_MMS", aVar3);
        arrayMap.put("android.permission.RECEIVE_WAP_PUSH", aVar3);
        a aVar4 = new a(R.string.IDS_permission_usage_storage, e(R.string.IDS_permission_description_storage, R.string.IDS_permission_description_storage, R.string.IDS_eu_perm_des_storage, R.string.IDS_permission_description_storage));
        arrayMap.put("android.permission.READ_EXTERNAL_STORAGE", aVar4);
        arrayMap.put("android.permission.WRITE_EXTERNAL_STORAGE", aVar4);
        arrayMap.put("android.permission.ACCESS_MEDIA_LOCATION", aVar4);
        a aVar5 = new a(R.string.IDS_permission_usage_location, e(R.string.IDS_permission_description_location_cn, R.string.IDS_permission_description_location_asia, R.string.IDS_eu_perm_des_location, R.string.IDS_permission_description_location));
        arrayMap.put("android.permission.ACCESS_FINE_LOCATION", aVar5);
        arrayMap.put("android.permission.ACCESS_COARSE_LOCATION", aVar5);
        arrayMap.put("android.permission.ACCESS_BACKGROUND_LOCATION", aVar5);
        a aVar6 = new a(R.string.IDS_permission_usage_call_log, e(R.string.IDS_permission_description_call_log, R.string.IDS_permission_description_call_log, R.string.IDS_eu_perm_des_call_log, R.string.IDS_permission_description_call_log));
        arrayMap.put("android.permission.READ_CALL_LOG", aVar6);
        arrayMap.put("android.permission.WRITE_CALL_LOG", aVar6);
        arrayMap.put("android.permission.PROCESS_OUTGOING_CALLS", aVar6);
        a aVar7 = new a(R.string.IDS_permission_usage_phone, e(R.string.IDS_permission_description_phone, R.string.IDS_permission_description_phone, R.string.IDS_eu_perm_des_phone, R.string.IDS_permission_description_phone));
        arrayMap.put("android.permission.READ_PHONE_STATE", aVar7);
        arrayMap.put("android.permission.READ_PHONE_NUMBERS", aVar7);
        arrayMap.put("android.permission.CALL_PHONE", aVar7);
        arrayMap.put("com.android.voicemail.permission.ADD_VOICEMAIL", aVar7);
        arrayMap.put("android.permission.USE_SIP", aVar7);
        arrayMap.put("android.permission.ANSWER_PHONE_CALLS", aVar7);
        arrayMap.put("android.permission.ACCEPT_HANDOVER", aVar7);
        arrayMap.put("android.permission.RECORD_AUDIO", new a(R.string.IDS_permission_usage_microphone, e(R.string.IDS_permission_description_microphone, R.string.IDS_permission_description_microphone, R.string.IDS_eu_perm_des_microphone, R.string.IDS_permission_description_microphone)));
        arrayMap.put("android.permission.ACTIVITY_RECOGNITION", new a(R.string.IDS_permission_usage_activity_recognition, e(R.string.IDS_permission_des_recognition, R.string.IDS_permission_des_recognition, R.string.IDS_eu_perm_des_recognition, R.string.IDS_permission_des_recognition)));
        arrayMap.put("android.permission.CAMERA", new a(R.string.IDS_permission_usage_camera, e(R.string.IDS_permission_description_camera, R.string.IDS_asia_ru_perm_des_camera, R.string.IDS_eu_perm_des_camera, R.string.IDS_asia_ru_perm_des_camera)));
        arrayMap.put("android.permission.READ_PHONE_STATE", new a(R.string.IDS_permission_usage_read_phone_state, R.string.IDS_permission_description_phone_state));
        a aVar8 = new a(R.string.IDS_nearby_permission, e(R.string.IDS_location_permission_use, R.string.IDS_location_permission_use, R.string.IDS_eu_location_perm_use, R.string.IDS_location_permission_use));
        arrayMap.put("android.permission.BLUETOOTH_CONNECT", aVar8);
        arrayMap.put("android.permission.BLUETOOTH_SCAN", aVar8);
        arrayMap.put("android.permission.NEARBY_WIFI_DEVICES", aVar8);
        a aVar9 = new a(R.string.IDS_permission_usage_img_video, e(R.string.IDS_permission_description_storage, R.string.IDS_permission_description_storage, R.string.IDS_eu_perm_des_image_video, R.string.IDS_permission_description_storage));
        arrayMap.put("android.permission.READ_MEDIA_IMAGES", aVar9);
        arrayMap.put("android.permission.READ_MEDIA_VIDEO", aVar9);
        arrayMap.put("android.permission.READ_MEDIA_AUDIO", new a(R.string.IDS_permission_usage_media_audio, R.string.IDS_permission_description_media_audio));
    }

    private static int e(int i, int i2, int i3, int i4) {
        int iN = CommonUtil.n(BaseApplication.b(), LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1009));
        if (iN == 5) {
            return i2;
        }
        if (iN != 7) {
            return iN != 8 ? i : i4;
        }
        return i3;
    }

    public qki(Context context, List<String> list) {
        super(context, R.style.CustomDialog);
        this.f46384b = context;
        b(list);
    }

    private void b(List<String> list) {
        LogUtil.a("PermissionDescDialog", "initView");
        View viewInflate = ((LayoutInflater) this.f46384b.getSystemService("layout_inflater")).inflate(R.layout.permission_desc_dialog, (ViewGroup) null);
        this.d = viewInflate;
        this.f46383a = (ListView) viewInflate.findViewById(R.id.permission_desc_list);
        d(list);
        setContentView(this.d);
        setWindowGravityParams(48);
        setColumnType(0);
    }

    private void d(List<String> list) {
        a aVar;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (String str : list) {
            if (str != null && (aVar = f46382c.get(str)) != null && !arrayList.contains(this.f46384b.getString(aVar.e))) {
                arrayList.add(this.f46384b.getString(aVar.e));
                arrayList2.add(this.f46384b.getString(aVar.d));
            }
        }
        this.f46383a.setAdapter((ListAdapter) new e(arrayList, arrayList2));
    }

    static class e extends BaseAdapter {
        private final List<String> d;
        private final List<String> e;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        e(List<String> list, List<String> list2) {
            this.d = list;
            this.e = list2;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.d.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (njy.c(this.d, i)) {
                return null;
            }
            return this.d.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            c cVar;
            LogUtil.a("PermissionDescDialog", "getView");
            if (view == null) {
                view = ((LayoutInflater) BaseApplication.b().getSystemService("layout_inflater")).inflate(R.layout.permission_description_item, (ViewGroup) null);
                cVar = new c();
                cVar.f46385b = (HealthTextView) view.findViewById(R.id.permission_name);
                cVar.f46386c = (HealthTextView) view.findViewById(R.id.permission_description);
                view.setTag(cVar);
            } else {
                cVar = (c) view.getTag();
            }
            if (njy.c(this.d, i)) {
                cVar.f46385b.setText(this.d.get(i));
            }
            if (njy.c(this.e, i)) {
                cVar.f46386c.setText(this.e.get(i));
            }
            return view;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f46385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f46386c;

        private c() {
        }
    }

    static class a {
        int d;
        int e;

        public a(int i, int i2) {
            this.e = i;
            this.d = i2;
        }
    }
}
