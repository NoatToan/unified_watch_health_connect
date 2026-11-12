package defpackage;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.InputBoxTemplate;
import com.huawei.health.marketing.datatype.RcmItem;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ezi {
    private static ConcurrentHashMap<Integer, InputBoxTemplate> e = new ConcurrentHashMap<>(16);

    public static boolean b(int i, int i2, int i3) {
        return i + i2 < i3;
    }

    public static void a(View view, View.OnClickListener onClickListener) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof LinearLayout) || (childAt instanceof RelativeLayout)) {
                    a(childAt, onClickListener);
                }
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setFocusable(false);
                }
                childAt.setOnClickListener(onClickListener);
            }
        }
    }

    public static void d(View view, TextView.OnEditorActionListener onEditorActionListener) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof LinearLayout) || (childAt instanceof RelativeLayout)) {
                    d(childAt, onEditorActionListener);
                }
                if (childAt instanceof EditText) {
                    ((EditText) childAt).setOnEditorActionListener(onEditorActionListener);
                }
            }
        }
    }

    public static InputBoxTemplate b(int i) {
        int iE = e(i);
        if (iE == 0) {
            LogUtil.j("SearchViewUtil", "setQueryHint page has no default search content, positionId:", Integer.valueOf(i));
            return null;
        }
        return e.get(Integer.valueOf(iE));
    }

    public static boolean a() {
        return !e.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputBoxTemplate c(ResourceResultInfo resourceResultInfo, int i) {
        e.clear();
        if (resourceResultInfo == null) {
            return null;
        }
        List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
        if (njy.e(resources)) {
            return null;
        }
        for (ResourceBriefInfo resourceBriefInfo : resources) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (resourceBriefInfo.getContentType() == 42 && jCurrentTimeMillis >= resourceBriefInfo.getEffectiveTime() && jCurrentTimeMillis <= resourceBriefInfo.getExpirationTime()) {
                String content = resourceBriefInfo.getContent().getContent();
                if (!TextUtils.isEmpty(content)) {
                    InputBoxTemplate inputBoxTemplate = (InputBoxTemplate) peh.b(content, InputBoxTemplate.class);
                    d(inputBoxTemplate, resourceBriefInfo);
                    inputBoxTemplate.setResourceId(resourceBriefInfo.getResourceId());
                    inputBoxTemplate.setResourceName(resourceBriefInfo.getResourceName());
                    a(inputBoxTemplate);
                }
            }
        }
        return b(i);
    }

    private static void a(InputBoxTemplate inputBoxTemplate) {
        if (inputBoxTemplate == null) {
            return;
        }
        List<Integer> appPageNo = inputBoxTemplate.getAppPageNo();
        if (njy.e(appPageNo)) {
            return;
        }
        for (Integer num : appPageNo) {
            if (!e.containsKey(num)) {
                e.put(num, inputBoxTemplate);
            }
        }
    }

    private static int e(int i) {
        if (gvk.e.containsKey(Integer.valueOf(i))) {
            return gvk.e.get(Integer.valueOf(i)).intValue();
        }
        return 0;
    }

    public static void d(InputBoxTemplate inputBoxTemplate, ResourceBriefInfo resourceBriefInfo) {
        if (inputBoxTemplate == null || resourceBriefInfo == null) {
            return;
        }
        List<RcmItem> recommendList = resourceBriefInfo.getRecommendList();
        String itemId = inputBoxTemplate.getItemId();
        if (TextUtils.isEmpty(itemId) || njy.e(recommendList)) {
            recommendList = resourceBriefInfo.getRcmWritingList();
            itemId = inputBoxTemplate.getWritingId();
        }
        String strE = fxl.e(recommendList, itemId);
        if (!TextUtils.isEmpty(strE)) {
            inputBoxTemplate.setAlgId(strE);
            inputBoxTemplate.setSmartRecommend(true);
        }
        inputBoxTemplate.setAbInfo(MarketingBiUtils.c(resourceBriefInfo));
        inputBoxTemplate.setRecommendInfoGenerated(true);
    }

    public static void c(final Handler handler, final int i) {
        LogUtil.a("SearchViewUtil", "requestInputBoxTemplate pagePositionId:", Integer.valueOf(i));
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(4201);
        resourceResultInfo.addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: ezi.4
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                Handler handler2;
                LogUtil.a("SearchViewUtil", "requestMarketResource onSuccess");
                if (map == null || map.isEmpty()) {
                    LogUtil.e("SearchViewUtil", "marketingResponse is invalid");
                    return;
                }
                Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
                if (mapFilterMarketingRules != null && mapFilterMarketingRules.get(4201) != null) {
                    InputBoxTemplate inputBoxTemplateC = ezi.c(mapFilterMarketingRules.get(4201), i);
                    if (inputBoxTemplateC == null || (handler2 = handler) == null) {
                        return;
                    }
                    Message messageObtainMessage = handler2.obtainMessage();
                    messageObtainMessage.what = 42;
                    messageObtainMessage.obj = inputBoxTemplateC;
                    handler.sendMessage(messageObtainMessage);
                    return;
                }
                ezi.a("");
                ezi.e.clear();
                LogUtil.e("SearchViewUtil", "filterResultInfoMap is invalid");
            }
        });
        e(resourceResultInfo);
    }

    public static void d(Context context, InputBoxTemplate inputBoxTemplate, int i) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.ui.homehealth.search.GlobalSearchActivity");
        intent.setFlags(131072);
        intent.putExtra("BUNDLE_KEY_INPUT_BOX", inputBoxTemplate);
        intent.putExtra("BUNDLE_INPUT_BOX_POSITION_ID", i);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("SearchViewUtil", "ActivityNotFoundException", e2.getMessage());
        }
    }

    public static SpannableString e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(str);
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("SearchViewUtil", "plainText or keyword is empty");
            return spannableString;
        }
        HashSet hashSet = new HashSet();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str2.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            hashSet.add(Character.valueOf(cCharAt));
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(BaseApplication.getContext().getResources().getColor(R.color.colorAccent));
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt2 = str.charAt(i2);
            if (Character.isUpperCase(cCharAt2)) {
                cCharAt2 = Character.toLowerCase(cCharAt2);
            }
            if (hashSet.contains(Character.valueOf(cCharAt2))) {
                spannableString.setSpan(CharacterStyle.wrap(foregroundColorSpan), i2, i2 + 1, 33);
            }
        }
        return spannableString;
    }

    public static boolean c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("SearchViewUtil", "isIncludeHighLightedString plainText or keyword is empty");
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str2.contains(String.valueOf(str.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    public static void c(final CustomTitleBar customTitleBar, final boolean z) {
        if (customTitleBar == null) {
            return;
        }
        LogUtil.a("SearchViewUtil", "hideSearchIcon");
        View rightSoftKey = z ? customTitleBar.getRightSoftKey() : customTitleBar.getRightThirdKey();
        rightSoftKey.animate().cancel();
        rightSoftKey.animate().translationX(rightSoftKey.getWidth()).alpha(0.0f).setListener(new Animator.AnimatorListener() { // from class: ezi.5
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (z) {
                    customTitleBar.setRightSoftkeyVisibility(8);
                } else {
                    customTitleBar.setRightThirdKeyVisibility(8);
                }
            }
        });
    }

    public static void a(CustomTitleBar customTitleBar, boolean z) {
        if (customTitleBar == null) {
            return;
        }
        LogUtil.a("SearchViewUtil", "showSearchIcon");
        View rightSoftKey = z ? customTitleBar.getRightSoftKey() : customTitleBar.getRightThirdKey();
        rightSoftKey.animate().cancel();
        if (z) {
            customTitleBar.setRightSoftkeyVisibility(0);
        } else {
            customTitleBar.setRightThirdKeyVisibility(0);
        }
        rightSoftKey.animate().translationX(0.0f).alpha(1.0f).setListener(null);
    }

    public static void a(ImageView imageView, int i) {
        LogUtil.a("SearchViewUtil", "setSearchIconVisibility, isVisible: ", Integer.valueOf(i));
        if (imageView == null) {
            return;
        }
        imageView.animate().cancel();
        if (i == 0) {
            imageView.setVisibility(0);
            imageView.animate().translationX(0.0f).alpha(1.0f).setListener(null);
        } else {
            imageView.setVisibility(8);
            imageView.animate().translationX(imageView.getWidth()).alpha(0.0f);
        }
    }

    public static void e(HealthSearchView healthSearchView) {
        if (healthSearchView == null || healthSearchView.getVisibility() == 8) {
            return;
        }
        LogUtil.a("SearchViewUtil", "hideSearchView");
        healthSearchView.setVisibility(8);
    }

    public static void d(HealthSearchView healthSearchView) {
        if (healthSearchView == null || healthSearchView.getVisibility() == 0) {
            return;
        }
        LogUtil.a("SearchViewUtil", "showSearchView");
        healthSearchView.setVisibility(0);
    }

    private static void e(Task<Map<Integer, ResourceResultInfo>> task) {
        task.addOnFailureListener(new OnFailureListener() { // from class: ezi.1
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                LogUtil.a("SearchViewUtil", "requestMarketResource onFailure");
            }
        });
    }

    public static void c(Map<String, Object> map, HealthSubHeader healthSubHeader) {
        String strD = qqw.d((Map) map, "SHOWMORE", (String) null);
        final OnClickSectionListener onClickSectionListenerC = qqw.c(map, "SHOW_MORE_CLICK_EVENT", (OnClickSectionListener) null);
        if (strD != null && onClickSectionListenerC != null) {
            healthSubHeader.setMoreText(strD);
            healthSubHeader.setMoreTextVisibility(0);
            healthSubHeader.setMoreLayoutVisibility(0);
            healthSubHeader.setMoreViewClickListener(new View.OnClickListener() { // from class: ezi.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onClickSectionListenerC.onClick("SHOW_MORE_CLICK_EVENT");
                }
            });
            return;
        }
        healthSubHeader.setMoreText("");
        healthSubHeader.setMoreTextVisibility(4);
        healthSubHeader.setMoreLayoutVisibility(4);
    }

    public static void a(String str) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(12000), "DEFAULT_SEARCH_HINT", str, new StorageParams());
    }

    public static void c(HealthSearchView healthSearchView) {
        String strB = b();
        if (healthSearchView == null || TextUtils.isEmpty(strB)) {
            return;
        }
        healthSearchView.setQueryHint(strB);
    }

    private static String b() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(12000), "DEFAULT_SEARCH_HINT");
    }

    public static void c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getLayoutTransition() != null) {
                return;
            }
            LogUtil.a("SearchViewUtil", "setRootLayoutTransition");
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setAnimateParentHierarchy(false);
            viewGroup.setLayoutTransition(layoutTransition);
        }
    }

    public static LayoutTransition d(ViewGroup viewGroup) {
        if (viewGroup == null) {
            LogUtil.a("SearchViewUtil", "setContainerLayoutTransition container is null");
            return null;
        }
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition != null) {
            LogUtil.a("SearchViewUtil", "containerView already has a layoutTransition");
            return layoutTransition;
        }
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.enableTransitionType(4);
        layoutTransition2.disableTransitionType(2);
        layoutTransition2.disableTransitionType(3);
        layoutTransition2.disableTransitionType(0);
        layoutTransition2.disableTransitionType(1);
        LogUtil.a("SearchViewUtil", "setContainerLayoutTransition");
        viewGroup.setLayoutTransition(layoutTransition2);
        return layoutTransition;
    }

    public static LayoutTransition[] b(ViewGroup[] viewGroupArr) {
        if (viewGroupArr == null || viewGroupArr.length == 0) {
            return new LayoutTransition[0];
        }
        LayoutTransition[] layoutTransitionArr = new LayoutTransition[viewGroupArr.length];
        for (int i = 0; i < viewGroupArr.length; i++) {
            layoutTransitionArr[i] = d(viewGroupArr[i]);
        }
        return layoutTransitionArr;
    }

    public static void e(Handler handler, final ViewGroup viewGroup, final LayoutTransition layoutTransition) {
        if (handler == null || viewGroup == null) {
            LogUtil.a("SearchViewUtil", "handler or container is null, handler: ", handler, " container: ", viewGroup);
        } else {
            handler.postDelayed(new Runnable() { // from class: ezi.3
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("SearchViewUtil", "restore old layoutTransition: ", layoutTransition);
                    viewGroup.setLayoutTransition(layoutTransition);
                }
            }, 100L);
        }
    }

    public static void c(Handler handler, ViewGroup[] viewGroupArr, LayoutTransition[] layoutTransitionArr) {
        if (viewGroupArr == null || layoutTransitionArr == null || viewGroupArr.length != layoutTransitionArr.length) {
            LogUtil.e("SearchViewUtil", "restoreOldTransitions invalid params");
            return;
        }
        for (int i = 0; i < viewGroupArr.length; i++) {
            e(handler, viewGroupArr[i], layoutTransitionArr[i]);
        }
    }

    public static int b(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0;
        }
        int childCount = recyclerView.getChildCount();
        int height = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                height += childAt.getHeight();
            }
        }
        return height;
    }

    public static boolean d() {
        return !Utils.o() && LanguageUtil.l(BaseApplication.getContext()) && VersionControlUtil.isSupportOperationAccount();
    }
}
