package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.views.audition.AuditionActivity;
import com.huawei.health.servicesui.R;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class gat {
    public static void b(final View view, final ImageView imageView, final SingleGridContent singleGridContent, final Map<String, String> map) {
        if (imageView == null || singleGridContent == null) {
            LogUtil.j("AuditionUtils", "setAuditionPlayBtnClick auditionBtn or content is null.");
            return;
        }
        if (TextUtils.equals(singleGridContent.getDynamicDataId(), gay.a().c())) {
            imageView.setImageResource(R.drawable.hiad_linked_video_pause);
            d(imageView, singleGridContent);
        } else {
            imageView.setImageResource(R.drawable.ic_player_playback);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: gav
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                gat.b(imageView, view, singleGridContent, map, view2);
            }
        });
    }

    static /* synthetic */ void b(ImageView imageView, View view, SingleGridContent singleGridContent, Map map, View view2) {
        if (qrs.e(500, imageView)) {
            LogUtil.j("AuditionUtils", "onClick() view click too fast.");
        } else if (!LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            d(view, imageView, singleGridContent, map);
        } else {
            LoginInit.getInstance(BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: gar
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LogUtil.j("AuditionUtils", "AuditionPlayBtnClick login errorCode = ", Integer.valueOf(i));
                }
            }, "");
        }
    }

    private static void d(View view, ImageView imageView, SingleGridContent singleGridContent, Map<String, String> map) {
        int vip = singleGridContent.getVip();
        UserMemberInfo userMemberInfoA = irz.a();
        boolean z = (userMemberInfoA == null || userMemberInfoA.getMemberFlag() != 1 || irz.d(userMemberInfoA)) ? false : true;
        if (vip == 0 || ((vip == 1 && z) || (vip == 2 && singleGridContent.getIsPay() == 1))) {
            LogUtil.a("AuditionUtils", "setAuditionPlayBtnClick, isVip==", Integer.valueOf(vip), " isVipUser=", Boolean.valueOf(z), " isPayed=", Integer.valueOf(singleGridContent.getIsPay()));
            view.performClick();
            return;
        }
        if (TextUtils.equals(singleGridContent.getDynamicDataId(), gay.a().c())) {
            LogUtil.a("AuditionUtils", "stopAudio()");
            gay.a().h();
            imageView.setImageResource(R.drawable.ic_player_playback);
            return;
        }
        if (!TextUtils.isEmpty(gay.a().c())) {
            ObserverManagerUtil.e("MARKETING_AUDITION_BTN_REFRESH", Integer.valueOf(R.drawable.ic_player_playback));
            ObserverManagerUtil.a("MARKETING_AUDITION_BTN_REFRESH");
        }
        Context contextB = BaseApplication.b();
        Intent intent = new Intent(contextB, (Class<?>) AuditionActivity.class);
        intent.setFlags(268435456);
        if (map != null) {
            intent.putExtra("resource_bi_map", (Serializable) map);
        }
        intent.putExtra("audition_content", singleGridContent);
        intent.putExtra("is_vip_expired", irz.d(userMemberInfoA));
        contextB.startActivity(intent);
        imageView.setImageResource(R.drawable.hiad_linked_video_pause);
        d(imageView, singleGridContent);
    }

    private static void d(final ImageView imageView, final SingleGridContent singleGridContent) {
        ObserverManagerUtil.d(new Observer() { // from class: gau
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str, Object[] objArr) {
                gat.a(imageView, singleGridContent, str, objArr);
            }
        }, "MARKETING_AUDITION_BTN_REFRESH");
    }

    static /* synthetic */ void a(ImageView imageView, SingleGridContent singleGridContent, String str, Object[] objArr) {
        if (njy.c(objArr, 0) && (objArr[0] instanceof Integer)) {
            LogUtil.a("AuditionUtils", "receiver play button statu change message");
            int iIntValue = ((Integer) objArr[0]).intValue();
            if (iIntValue == 0) {
                iIntValue = R.drawable.hiad_linked_video_pause;
            }
            imageView.setImageResource(iIntValue);
        }
        if (njy.c(objArr, 1)) {
            Object obj = objArr[1];
            if (obj instanceof Integer) {
                singleGridContent.setIsPay(((Integer) obj).intValue());
                LogUtil.a("AuditionUtils", "receiver course IsPay = ", Integer.valueOf(singleGridContent.getIsPay()));
            }
        }
    }
}
