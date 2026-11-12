package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.main.R;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wug {
    public static void d(final ResponseCallback<Object> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("Step_DetailStepKakaUtil", "getKakalist callback is null");
            return;
        }
        Task<List<osg>> taskInfoListByRule = ddq.d().getTaskInfoListByRule(BaseApplication.getContext(), 20001);
        if (taskInfoListByRule == null) {
            LogUtil.j("Step_DetailStepKakaUtil", "getTaskInfoListByRule taskList is null");
            responseCallback.onResult(404, null);
        } else {
            taskInfoListByRule.addOnSuccessListener(new OnSuccessListener<List<osg>>() { // from class: wug.3
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<osg> list) {
                    responseCallback.onResult(100, list);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: wug.2
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    LogUtil.j("Step_DetailStepKakaUtil", "exception ", LogAnonymous.b(exc));
                    responseCallback.onResult(404, null);
                }
            });
        }
    }

    private static int e(int i) {
        if (i == 0) {
            return R.mipmap.dark_kaka_continue_walk;
        }
        if (i == 1) {
            return R.drawable.kaka_breathe_anim_frame;
        }
        if (i == 2) {
            return R.mipmap.light_kaka_finish_target;
        }
        return R.mipmap.dark_kaka_continue_walk;
    }

    public static View d(int i, int i2) {
        LinearLayout.LayoutParams layoutParams;
        LogUtil.a("Step_DetailStepKakaUtil", "addKakaView marginLeft ", Integer.valueOf(i));
        Context context = BaseApplication.getContext();
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(e(i2));
        imageView.setBackgroundColor(context.getResources().getColor(R.color.transparent));
        if (i2 == 1) {
            layoutParams = new LinearLayout.LayoutParams(qrs.d(context, 20.0f), qrs.d(context, 20.0f));
        } else {
            layoutParams = new LinearLayout.LayoutParams(qrs.d(context, 16.0f), qrs.d(context, 16.0f));
        }
        layoutParams.gravity = 16;
        if (LanguageUtil.ba(context)) {
            layoutParams.rightMargin = i;
        } else {
            layoutParams.leftMargin = i;
        }
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public static void d(Drawable drawable) {
        AnimationDrawable animationDrawable = drawable instanceof AnimationDrawable ? (AnimationDrawable) drawable : null;
        if (animationDrawable != null) {
            if (animationDrawable.isRunning()) {
                animationDrawable.stop();
            }
            animationDrawable.start();
        }
    }
}
