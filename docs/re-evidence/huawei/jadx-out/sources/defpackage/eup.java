package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.views.AppTurnPageLayout;
import com.huawei.health.marketing.views.CarouselsLayout;
import com.huawei.health.marketing.views.CoursePreviewLayout;
import com.huawei.health.marketing.views.CourseSeriesSidingLayout;
import com.huawei.health.marketing.views.DietAnalysisSeriesSidingLayout;
import com.huawei.health.marketing.views.FamousTeacherLayout;
import com.huawei.health.marketing.views.MemberBannerCardLayout;
import com.huawei.health.marketing.views.MultiTabHorizontalLayout;
import com.huawei.health.marketing.views.OverlayLayout;
import com.huawei.health.marketing.views.QuestionAndAnswerLayout;
import com.huawei.health.marketing.views.SportBannerLayout;
import com.huawei.health.marketing.views.TextLinkLayout;
import com.huawei.health.marketing.views.TextLinkNestingLayout;
import com.huawei.health.marketing.views.ThreeGridSeriesSidingLayout;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseInfo;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.CreativeType;
import health.compact.a.ReflectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes28.dex */
public class eup {
    /* JADX WARN: Code duplicated, block: B:56:0x0239  */
    public static List<View> a(Context context, int i, ResourceBriefInfo resourceBriefInfo, FragmentManager fragmentManager) {
        View viewGenerate;
        int contentType = resourceBriefInfo.getContentType();
        LogUtil.a("LayoutProvider", "contentType: ", Integer.valueOf(contentType), ", resourceName: ", resourceBriefInfo.getResourceName(), ", contentType: ", Integer.valueOf(contentType));
        ArrayList arrayList = new ArrayList();
        switch (contentType) {
            case 3:
                viewGenerate = (TextLinkLayout) new euu().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                }
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 35:
            case 39:
            case 40:
            case 47:
            case 48:
            case 49:
            case 53:
            case 59:
            case 76:
            case ExerciseSessionRecord.EXERCISE_TYPE_WALKING /* 79 */:
            case 80:
            case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
            case ExerciseSessionRecord.EXERCISE_TYPE_YOGA /* 83 */:
            case 84:
            case Constants.MAX_PRO_BOTTOM_MARGIN /* 85 */:
            case GolfCourseInfo.DATA_LENGTH /* 92 */:
            case 94:
            case 96:
            case 107:
            case CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON /* 113 */:
                viewGenerate = new eui().generate(context, i, resourceBriefInfo);
                break;
            case 36:
                viewGenerate = (AppTurnPageLayout) new eue().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                } else {
                    ViewTreeVisibilityListener.c(viewGenerate, new ViewTreeVisibilityListener(viewGenerate, new c(viewGenerate, i, resourceBriefInfo)));
                }
                break;
            case 51:
            case 52:
            case 63:
                viewGenerate = (SportBannerLayout) new euv().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                } else {
                    LogUtil.a("LayoutProvider", "sportBannerLayout getView viewTreeListenee");
                    ViewTreeVisibilityListener.c(viewGenerate, new ViewTreeVisibilityListener(viewGenerate, new c(viewGenerate, i, resourceBriefInfo)));
                }
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_VOLLEYBALL /* 78 */:
                LogUtil.a("LayoutProvider", "TEMPLATE_RECOMMENDED_CAROUSEL");
                viewGenerate = (CarouselsLayout) new eug().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                } else {
                    LogUtil.a("LayoutProvider", "carouselsLayout is not null");
                    ViewTreeVisibilityListener.c(viewGenerate, new ViewTreeVisibilityListener(viewGenerate, new c(viewGenerate, i, resourceBriefInfo)));
                }
                break;
            case 95:
                LogUtil.a("LayoutProvider", "TEMPLATE_MULTI_TAB_HORIZONTAL");
                viewGenerate = (MultiTabHorizontalLayout) new euo().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                } else {
                    ViewTreeVisibilityListener.c(viewGenerate, new ViewTreeVisibilityListener(viewGenerate, new c(viewGenerate, i, resourceBriefInfo)));
                }
                break;
            case Constants.DEFAULT_PRO_BOT_MARGIN_PAD /* 98 */:
                viewGenerate = (MemberBannerCardLayout) new eun().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                } else {
                    ViewTreeVisibilityListener.c(viewGenerate, new ViewTreeVisibilityListener(viewGenerate, new c(viewGenerate, i, resourceBriefInfo)));
                }
                break;
            case 102:
            case 103:
                try {
                    viewGenerate = (View) ReflectionUtils.b(ReflectionUtils.e(ReflectionUtils.e("com.huawei.ui.main.stories.health.model.weight.SectionWeightView"), (Class<?>[]) new Class[]{Context.class, ResourceBriefInfo.class, Integer.TYPE}), context, resourceBriefInfo, Integer.valueOf(i));
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    LogUtil.e("LayoutProvider", "SectionWeightView ClassNotFoundException or NoSuchMethodException");
                    viewGenerate = null;
                }
                break;
            case 106:
                LogUtil.a("LayoutProvider", "TEMPLATE_TEXT_LINK_NESTING");
                viewGenerate = (TextLinkNestingLayout) new eut(fragmentManager).generate(context, -1, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                } else {
                    LogUtil.a("LayoutProvider", "TextLinkNestingLayout viewList.add");
                    ViewTreeVisibilityListener.c(viewGenerate, new ViewTreeVisibilityListener(viewGenerate, new c(viewGenerate, i, resourceBriefInfo)));
                }
                break;
            case 111:
                viewGenerate = (QuestionAndAnswerLayout) new euw().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                } else {
                    ViewTreeVisibilityListener.c(viewGenerate, new ViewTreeVisibilityListener(viewGenerate, new c(viewGenerate, i, resourceBriefInfo)));
                }
                break;
            case 112:
                viewGenerate = (FamousTeacherLayout) new euk().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                } else {
                    ViewTreeVisibilityListener.c(viewGenerate, new ViewTreeVisibilityListener(viewGenerate, new c(viewGenerate, i, resourceBriefInfo)));
                }
                break;
            case 114:
            case 134:
                viewGenerate = (CourseSeriesSidingLayout) new euf().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                } else {
                    ViewTreeVisibilityListener.c(viewGenerate, new ViewTreeVisibilityListener(viewGenerate, new c(viewGenerate, i, resourceBriefInfo)));
                }
                break;
            case 115:
                viewGenerate = (ThreeGridSeriesSidingLayout) new euy().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                } else {
                    ViewTreeVisibilityListener.c(viewGenerate, new ViewTreeVisibilityListener(viewGenerate, new c(viewGenerate, i, resourceBriefInfo)));
                }
                break;
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                viewGenerate = new eur().generate(context, i, resourceBriefInfo);
                break;
            case 117:
                viewGenerate = (DietAnalysisSeriesSidingLayout) new eum().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                } else {
                    ViewTreeVisibilityListener.c(viewGenerate, new ViewTreeVisibilityListener(viewGenerate, new c(viewGenerate, i, resourceBriefInfo)));
                }
                break;
            case 122:
                List<View> listA = new eul().a(context, i, resourceBriefInfo);
                if (njy.b(listA)) {
                    arrayList.addAll(listA);
                }
                viewGenerate = null;
                break;
            case 123:
                viewGenerate = new eus().generate(context, i, resourceBriefInfo);
                break;
            case 126:
                viewGenerate = (CoursePreviewLayout) new euh().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                }
                break;
            case 138:
                viewGenerate = (OverlayLayout) new euq().generate(context, i, resourceBriefInfo);
                if (viewGenerate == null) {
                    viewGenerate = null;
                }
                break;
            default:
                LogUtil.j("LayoutProvider", "generateLayout other contentType = ", Integer.valueOf(contentType));
                viewGenerate = null;
                break;
        }
        if (viewGenerate != null) {
            arrayList.add(viewGenerate);
        }
        return arrayList;
    }

    static class c implements ViewTreeVisibilityListener.ViewTreeListenee {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Set<String> f33495b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ResourceBriefInfo f33496c;
        private int d;
        private View e;

        public c(View view, int i, ResourceBriefInfo resourceBriefInfo) {
            this.d = i;
            this.f33496c = resourceBriefInfo;
            this.e = view;
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public void checkVisibilityAndSetBiEvent() {
            ResourceBriefInfo resourceBriefInfo;
            if (!ViewTreeVisibilityListener.c(this.e) || hasSetBiEvent() || (resourceBriefInfo = this.f33496c) == null) {
                return;
            }
            LogUtil.a("LayoutProvider", "visible to user, mResourceBriefInfo", resourceBriefInfo);
            biEvent();
            this.f33495b.add(this.f33496c.getResourceId());
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public boolean hasSetBiEvent() {
            ResourceBriefInfo resourceBriefInfo = this.f33496c;
            return resourceBriefInfo != null && this.f33495b.contains(resourceBriefInfo.getResourceId());
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public void biEvent() {
            ResourceBriefInfo resourceBriefInfo = this.f33496c;
            if (resourceBriefInfo == null) {
                return;
            }
            eup.e(this.d, resourceBriefInfo);
        }
    }

    public static void e(int i, ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("event", 1);
        map.put("resourceId", resourceBriefInfo.getResourceId());
        map.put("resourcePositionId", Integer.valueOf(i));
        map.put("resourceName", resourceBriefInfo.getResourceName());
        map.put("pullOrder", 1);
        map.put("algId", "");
        map.put("smartRecommend", Boolean.valueOf(resourceBriefInfo.getSmartRecommend()));
        lmf.d().c(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }
}
