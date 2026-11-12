package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.h5pro.core.H5ProCommand;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.health.utils.functionsetcard.ICardChangedCallback;
import com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.H5proWebViewContainerActivity;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.R;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes17.dex */
public class tfc {
    public static String b(long j) {
        if (lsl.i(j, System.currentTimeMillis())) {
            return DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_MD);
        }
        return DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD);
    }

    public static CharSequence d(long j) {
        return UnitUtil.a(new Date(j), lsl.i(j, System.currentTimeMillis()) ? 24 : 20);
    }

    public static CharSequence d(String str, String str2) {
        int i;
        int i2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("FunctionSetCardUtil", "sourceStr is empty");
            return str2;
        }
        Context contextB = BaseApplication.b();
        if (qrs.u()) {
            i = R.style.function_card_unit_large_font_Style;
            i2 = R.style.function_card_data_large_font_Style;
        } else {
            i = R.style.function_card_unit_normal_Style;
            i2 = R.style.function_card_data_normal_Style;
        }
        SpannableString spannableString = new SpannableString(str);
        qri.a(spannableString, str, new TextAppearanceSpan(contextB, i));
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("FunctionSetCardUtil", "dataStr is empty");
            return spannableString;
        }
        qri.a(spannableString, str2, new TextAppearanceSpan(contextB, i2));
        qri.a(spannableString, str2);
        return spannableString;
    }

    public static CharSequence b(String str, String str2) {
        int i;
        int i2;
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("FunctionSetCardUtil", "origin is empty");
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("FunctionSetCardUtil", "patternKeys is empty");
            return str2;
        }
        if (qrs.u()) {
            i = R.style.function_card_unit_large_font_Style;
            i2 = R.style.function_card_data_large_font_Style;
        } else {
            i = R.style.function_card_unit_normal_Style;
            i2 = R.style.function_card_data_normal_Style;
        }
        Context contextB = BaseApplication.b();
        SpannableString spannableString = new SpannableString(str2);
        qri.a(spannableString, str2, new TextAppearanceSpan(contextB, i));
        Matcher matcher = Pattern.compile(str, 2).matcher(spannableString);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            qri.d(spannableString, iStart, iEnd, new TextAppearanceSpan(contextB, i2));
            qri.b(spannableString, iStart, iEnd);
        }
        return spannableString;
    }

    public static List<FunctionSetSubCardData> a(Context context, List<CardConstructor> list, ICardChangedCallback iCardChangedCallback) {
        if (context == null) {
            LogUtil.j("FunctionSetCardUtil", "context is null");
            return new ArrayList();
        }
        if (CollectionUtils.a(list)) {
            LogUtil.j("FunctionSetCardUtil", "cardConstructors is empty");
            return new ArrayList();
        }
        LogUtil.j("FunctionSetCardUtil", "initCardReaders cardConstructors size = ", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(list.size());
        for (CardConstructor cardConstructor : list) {
            if (cardConstructor != null) {
                FunctionSetSubCardData functionSetSubCardDataCreateCardReader = cardConstructor.createCardReader(context);
                functionSetSubCardDataCreateCardReader.setNotifyCardChangedCallback(iCardChangedCallback);
                functionSetSubCardDataCreateCardReader.setCardConstructor(cardConstructor);
                arrayList.add(functionSetSubCardDataCreateCardReader);
            }
        }
        LogUtil.a("FunctionSetCardUtil", "initCardReader end");
        return arrayList;
    }

    public static List<FunctionSetSubCardData> d(Context context, List<FunctionSetSubCardData> list, List<CardConstructor> list2, ICardChangedCallback iCardChangedCallback) {
        if (context == null) {
            LogUtil.j("FunctionSetCardUtil", "context is null");
            return new ArrayList();
        }
        if (CollectionUtils.a(list2)) {
            LogUtil.j("FunctionSetCardUtil", "cardConstructors is empty");
            return new ArrayList();
        }
        LogUtil.j("FunctionSetCardUtil", "updateCardReaders cardConstructors size = ", Integer.valueOf(list2.size()));
        if (CollectionUtils.a(list)) {
            return a(context, list2, iCardChangedCallback);
        }
        HashMap map = new HashMap(list.size());
        for (FunctionSetSubCardData functionSetSubCardData : list) {
            if (functionSetSubCardData != null) {
                map.put(functionSetSubCardData.getCardId(), functionSetSubCardData);
            }
        }
        ArrayList arrayList = new ArrayList(list2.size());
        ArrayList arrayList2 = new ArrayList(10);
        for (CardConstructor cardConstructor : list2) {
            if (cardConstructor != null) {
                FunctionSetSubCardData functionSetSubCardDataCreateCardReader = (FunctionSetSubCardData) map.get(cardConstructor.getCardId());
                if (functionSetSubCardDataCreateCardReader == null) {
                    functionSetSubCardDataCreateCardReader = cardConstructor.createCardReader(context);
                    functionSetSubCardDataCreateCardReader.setNotifyCardChangedCallback(iCardChangedCallback);
                    functionSetSubCardDataCreateCardReader.setCardConstructor(cardConstructor);
                    tfb.b(functionSetSubCardDataCreateCardReader, 2, sio.c().i());
                } else {
                    arrayList2.add(functionSetSubCardDataCreateCardReader);
                }
                arrayList.add(functionSetSubCardDataCreateCardReader);
            }
        }
        list.removeAll(arrayList2);
        for (FunctionSetSubCardData functionSetSubCardData2 : list) {
            if (functionSetSubCardData2 != null) {
                tfb.b(functionSetSubCardData2, 3, sio.c().i());
                functionSetSubCardData2.onDestroy();
            }
        }
        LogUtil.a("FunctionSetCardUtil", "updateCardReaders end");
        return arrayList;
    }

    public static void a(Context context, Intent intent, View view, boolean z) {
        if (intent == null) {
            LogUtil.j("FunctionSetCardUtil", "startActivityWithAnimation intent is null");
            return;
        }
        if (!z && view != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (VersionControlUtil.isSupportActivityTransitionAnimation(activity)) {
                e(context, view);
                a(context, intent, z, true);
                activity.overridePendingTransition(0, 0);
                return;
            }
        }
        a(context, intent, z, false);
    }

    private static void e(Context context, View view) {
        ActivityTransitionAnimator.c().b(view).a(context).a(qrs.ad(context)).c(qrs.q(context)).d(qrs.s(context));
    }

    private static void a(Context context, Intent intent, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                intent.putExtra("IS_SUPPORT_TRANSITION_ANIMATOR", true);
            }
            iov.c(context, intent);
            return;
        }
        iov.d(context, intent);
    }

    public static void d(Context context, H5ProCommand h5ProCommand, View view) {
        LogUtil.a("FunctionSetCardUtil", "startActivity");
        H5proUtil.initH5pro();
        Intent intent = new Intent(context, (Class<?>) H5proWebViewContainerActivity.class);
        intent.setExtrasClassLoader(H5ProCommand.class.getClassLoader());
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.huawei.health.h5pro.MESSAGE", h5ProCommand);
        intent.putExtra("com.huawei.health.h5pro.MESSAGE", bundle);
        String packageName = h5ProCommand.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            packageName = h5ProCommand.getUrl();
        }
        intent.putExtra("h5Flag", packageName);
        boolean z = context instanceof Activity;
        if (z) {
            int activityStartFlag = CommonUtil.getActivityStartFlag(h5ProCommand.getLaunchOption(), packageName);
            if (activityStartFlag != 0) {
                intent.setFlags(activityStartFlag);
            }
        } else {
            intent.setFlags(268435456);
        }
        LogUtil.a("FunctionSetCardUtil", "startActivity flags: " + intent.getFlags() + ",h5Flag: " + packageName);
        if (view != null && z) {
            Activity activity = (Activity) context;
            if (VersionControlUtil.isSupportActivityTransitionAnimation(activity)) {
                e(context, view);
                iov.d(context, intent);
                activity.overridePendingTransition(0, 0);
                return;
            }
        }
        iov.d(context, intent);
    }
}
