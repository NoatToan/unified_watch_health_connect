package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.ICommonListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class leu {
    public static void d(final List<String> list, final ICommonCallback iCommonCallback, final len lenVar, final ler lerVar, final Context context) throws RemoteException {
        if (njy.e(list)) {
            ReleaseLogUtil.e("HiH_HiHealthUserInfoUtil", "getUserInfo param is invalid");
            if (iCommonCallback != null) {
                iCommonCallback.onResult(2, lcr.b(2));
                return;
            } else {
                ReleaseLogUtil.e("HiH_HiHealthUserInfoUtil", "callback is null, unable to notify");
                return;
            }
        }
        ktr.b().c((ICommonListener) new ICommonListener.Stub() { // from class: leu.3
            @Override // com.huawei.hihealth.ICommonListener
            public void onSuccess(int i, List list2) throws RemoteException {
                ReleaseLogUtil.d("HiH_HiHealthUserInfoUtil", "getUserInfo onSuccess Code = ", Integer.valueOf(i));
                if (njy.e(list2) || !(list2.get(0) instanceof HiUserInfo)) {
                    ReleaseLogUtil.e("HiH_HiHealthUserInfoUtil", "userInfo is null");
                    iCommonCallback.onResult(4, lcr.b(4));
                    lenVar.d(context, lerVar.e(4));
                    return;
                }
                HiUserInfo hiUserInfo = (HiUserInfo) list2.get(0);
                JSONObject jSONObject = new JSONObject();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    leu.d(jSONObject, (String) it.next(), hiUserInfo);
                }
                iCommonCallback.onResult(0, jSONObject.toString());
                lenVar.d(context, lerVar.e(0));
            }

            @Override // com.huawei.hihealth.ICommonListener
            public void onFailure(int i, List list2) throws RemoteException {
                ReleaseLogUtil.e("HiH_HiHealthUserInfoUtil", "getUserInfo onFailure errorCode = ", Integer.valueOf(i));
                int iC = lck.c(i);
                iCommonCallback.onResult(iC, lcr.b(iC));
                lenVar.d(context, lerVar.e(iC));
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void d(JSONObject jSONObject, String str, HiUserInfo hiUserInfo) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            int gender = -1;
            int birthday = 0;
            switch (str.hashCode()) {
                case -2137162425:
                    if (!str.equals("Height")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case -1707725160:
                    if (!str.equals("Weight")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 1134020253:
                    if (!str.equals("Birthday")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 2129321697:
                    if (!str.equals("Gender")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                if (hiUserInfo.getGender() != -100) {
                    gender = hiUserInfo.getGender();
                }
                jSONObject.put(str, gender);
            } else if (b2 == 1) {
                if (hiUserInfo.getBirthday() != -100) {
                    birthday = hiUserInfo.getBirthday();
                }
                jSONObject.put(str, birthday);
            } else if (b2 == 2) {
                jSONObject.put(str, hiUserInfo.getHeight());
            } else {
                if (b2 != 3) {
                    return;
                }
                jSONObject.put(str, Float.toString(hiUserInfo.getWeight()));
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a("HiH_HiHealthUserInfoUtil", "putUserInfoJson JSONException: ", e.getMessage());
        }
    }
}
