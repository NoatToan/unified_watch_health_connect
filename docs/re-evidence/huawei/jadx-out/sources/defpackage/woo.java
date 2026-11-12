package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.operationbundle.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import health.compact.a.CommonUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class woo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f52272a = 41;

    public static int c(int i) {
        switch (i) {
            case 20002:
            case 20003:
            case 20005:
            case 20006:
                return 20002;
            case 20004:
            default:
                return i;
        }
    }

    public static void c(Context context, String str) {
        HashMap map = new HashMap();
        map.put("click", 1);
        lmf.d().c(context.getApplicationContext(), str, map, 0);
    }

    public static void e(List<MessageObject> list, List<MessageObject> list2) {
        if (list == null) {
            return;
        }
        if ((list.size() > 0 ? list.get(0) : null) instanceof tsr) {
            a(list, list2);
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < list.size(); i++) {
            MessageObject messageObject = list.get(i);
            if (messageObject != null && messageObject.getImgUri() != null && !messageObject.getImgUri().trim().isEmpty() && messageObject.getDetailUri() != null && !messageObject.getDetailUri().trim().isEmpty()) {
                arrayList.add(messageObject);
            }
        }
        Collections.sort(arrayList, new e());
        Collections.sort(arrayList, new b());
        list2.clear();
        if (arrayList.size() > 3) {
            list2.add((MessageObject) arrayList.get(0));
            list2.add((MessageObject) arrayList.get(1));
            list2.add((MessageObject) arrayList.get(2));
            return;
        }
        list2.addAll(arrayList);
    }

    private static void a(List<MessageObject> list, List<MessageObject> list2) {
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        for (int i = 0; i < list.size(); i++) {
            MessageObject messageObject = list.get(i);
            if (messageObject != null && !wvg.a(messageObject.getImgUri())) {
                tsr tsrVar = (tsr) messageObject;
                if (!tsrVar.a()) {
                    if (!wvg.a(messageObject.getDetailUri())) {
                        arrayList.add(messageObject);
                    }
                } else {
                    String strT = tsrVar.b().t();
                    if (TextUtils.equals(strT, String.valueOf(0)) || TextUtils.equals(strT, String.valueOf(1))) {
                        arrayList2.add(messageObject);
                    }
                }
            }
        }
        e eVar = new e();
        Collections.sort(arrayList, eVar);
        b bVar = new b();
        Collections.sort(arrayList, bVar);
        list2.clear();
        if (arrayList.size() > 3) {
            for (int i2 = 0; i2 < 3; i2++) {
                list2.add((MessageObject) arrayList.get(i2));
            }
        } else {
            list2.addAll(arrayList);
        }
        e(arrayList2, list2, eVar, bVar);
    }

    private static void e(List<MessageObject> list, List<MessageObject> list2, Comparator<MessageObject> comparator, Comparator<MessageObject> comparator2) {
        int size;
        if (njy.e(list)) {
            return;
        }
        Collections.sort(list, new c());
        Collections.sort(list, new d());
        if (njy.b(list)) {
            MessageObject messageObject = list.get(0);
            list2.add(messageObject);
            Collections.sort(list2, comparator);
            Collections.sort(list2, comparator2);
            size = list2.indexOf(messageObject);
            list2.remove(messageObject);
        } else {
            size = -1;
        }
        if (size <= -1) {
            size = list2.size();
        }
        if (list.size() <= 5) {
            list2.addAll(size, list);
            return;
        }
        for (int i = 0; i < 5; i++) {
            list2.add(size + i, list.get(i));
        }
    }

    public static int[] b(List<MessageObject> list) {
        if (njy.e(list)) {
            LogUtil.j("UIDV_SocialInteractor", "getImageScaleSize() messageList is empty.");
            return new int[0];
        }
        String strTrim = "";
        for (MessageObject messageObject : list) {
            if (messageObject == null) {
                LogUtil.j("UIDV_SocialInteractor", "getImageScaleSize() messageObject is null.");
            } else if (TextUtils.isEmpty(messageObject.getHarmonyImgUrl())) {
                LogUtil.j("UIDV_SocialInteractor", "getImageScaleSize() harmonyImgUrl is empty.");
            } else {
                String harmonyImageSize = messageObject.getHarmonyImageSize();
                if (TextUtils.isEmpty(harmonyImageSize)) {
                    LogUtil.j("UIDV_SocialInteractor", "getImageScaleSize() harmonyImageSize is empty.");
                } else {
                    strTrim = harmonyImageSize.trim();
                    if ("4:5".equals(strTrim)) {
                        break;
                    }
                }
            }
        }
        return e(strTrim);
    }

    public static boolean e(int[] iArr) {
        return iArr != null && iArr.length >= 2 && iArr[0] > 0;
    }

    private static int[] e(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(":")) {
            LogUtil.j("UIDV_SocialInteractor", "getImageScaleSize() imageSizeString is empty or not contain .");
            return new int[0];
        }
        LogUtil.a("UIDV_SocialInteractor", "getImageScaleSize imageSizeString = ", str);
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length >= 2) {
            int[] iArr = {CommonUtil.b(BaseApplication.getContext(), strArrSplit[0], 21), CommonUtil.b(BaseApplication.getContext(), strArrSplit[1], 9)};
            LogUtil.a("UIDV_SocialInteractor", "getImageScaleSize widthScaleSize = ", Integer.valueOf(iArr[0]), ", heightScaleSize = ", Integer.valueOf(iArr[1]));
            return iArr;
        }
        return new int[0];
    }

    public static int a(Context context) {
        int i = (int) ((qrs.i(context) - BaseApplication.getContext().getResources().getDimension(R.dimen.defaultPaddingStart)) - BaseApplication.getContext().getResources().getDimension(R.dimen.defaultPaddingEnd));
        if (qrs.af(context) && !qrs.aa(context)) {
            int iB = (i - qqp.b(BaseApplication.getContext())) / 2;
            LogUtil.j("UIDV_SocialInteractor", "getBannerImageWidth() width = ", Integer.valueOf(iB));
            return iB;
        }
        int i2 = f52272a;
        boolean z = i2 == 37 || i2 == 38;
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        if (z) {
            return (int) BaseApplication.getContext().getResources().getDimension(R.dimen.weight_light_fasting_card_258);
        }
        return (i - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue();
    }

    public static class b implements Comparator<MessageObject>, Serializable {
        private static final long serialVersionUID = 1;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(MessageObject messageObject, MessageObject messageObject2) {
            return messageObject2.getWeight() - messageObject.getWeight();
        }
    }

    public static class e implements Comparator<MessageObject>, Serializable {
        private static final long serialVersionUID = 1;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(MessageObject messageObject, MessageObject messageObject2) {
            return Long.compare(messageObject2.getCreateTime(), messageObject.getCreateTime());
        }
    }

    public static class d implements Comparator<MessageObject>, Serializable {
        private static final long serialVersionUID = 1;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MessageObject messageObject, MessageObject messageObject2) {
            boolean z = messageObject2 instanceof tsr;
            if (!(messageObject instanceof tsr) || !z) {
                return 0;
            }
            tsr tsrVar = (tsr) messageObject;
            tsr tsrVar2 = (tsr) messageObject2;
            if (!tsrVar.a() || !tsrVar2.a()) {
                return 0;
            }
            return tsrVar2.b().u() - tsrVar.b().u();
        }
    }

    public static class c implements Comparator<MessageObject>, Serializable {
        private static final long serialVersionUID = 1;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compare(MessageObject messageObject, MessageObject messageObject2) {
            boolean z = messageObject2 instanceof tsr;
            if (!(messageObject instanceof tsr) || !z) {
                return 0;
            }
            tsr tsrVar = (tsr) messageObject;
            tsr tsrVar2 = (tsr) messageObject2;
            if (!tsrVar.a() || !tsrVar2.a()) {
                return 0;
            }
            return tsrVar2.b().l() - tsrVar.b().l();
        }
    }

    public static List<MessageObject> c(List<MessageObject> list) {
        if (njy.e(list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<MessageObject> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        return arrayList;
    }

    public static MessageObject b(MessageObject messageObject) {
        if (messageObject == null) {
            return messageObject;
        }
        tsr tsrVar = new tsr();
        tsrVar.setCreateTime(messageObject.getCreateTime());
        tsrVar.setDetailUri(messageObject.getDetailUri());
        tsrVar.setDetailUriExt(messageObject.getDetailUriExt());
        tsrVar.setExpireTime(messageObject.getExpireTime());
        tsrVar.setFlag(messageObject.getFlag());
        tsrVar.setHarmonyImageSize(messageObject.getHarmonyImageSize());
        tsrVar.setHarmonyImgUrl(messageObject.getHarmonyImgUrl());
        tsrVar.setHeatMapCity(messageObject.getHeatMapCity());
        tsrVar.setHuid(messageObject.getHuid());
        tsrVar.setImageTextSeparateSwitch(messageObject.getImageTextSeparateSwitch());
        tsrVar.setImei(messageObject.getImei());
        tsrVar.setImgBigUri(messageObject.getImgBigUri());
        tsrVar.setImgUri(messageObject.getImgUri());
        tsrVar.setInfoClassify(messageObject.getInfoClassify());
        tsrVar.setInfoRecommend(messageObject.getInfoRecommend());
        tsrVar.setLatestGetMsgTimestamp(messageObject.getLatestGetMsgTimestamp());
        tsrVar.setLayout(messageObject.getLayout());
        tsrVar.setMessageExtList(messageObject.getMessageExtList());
        tsrVar.setMetadata(messageObject.getMetadata());
        tsrVar.setModule(messageObject.getModule());
        tsrVar.setMsgContent(messageObject.getMsgContent());
        tsrVar.setMsgFrom(messageObject.getMsgFrom());
        tsrVar.setMsgId(messageObject.getMsgId());
        tsrVar.setMsgPosition(messageObject.getMsgPosition());
        tsrVar.setMsgTitle(messageObject.getMsgTitle());
        tsrVar.setMsgType(messageObject.getMsgType());
        tsrVar.setMsgUserLabel(messageObject.getMsgUserLabel());
        tsrVar.setNotified(messageObject.getNotified());
        tsrVar.setPageType(messageObject.getPageType());
        tsrVar.setPosition(messageObject.getPosition());
        tsrVar.setReadFlag(messageObject.getReadFlag());
        tsrVar.setReceiveTime(messageObject.getReceiveTime());
        tsrVar.setType(messageObject.getType());
        tsrVar.setWeight(messageObject.getWeight());
        return tsrVar;
    }

    public static void a(int i) {
        f52272a = i;
    }

    public static int[] e(List<MessageObject> list) {
        if (njy.e(list)) {
            return new int[0];
        }
        int[] iArr = new int[list.size()];
        int i = 0;
        for (MessageObject messageObject : list) {
            if (messageObject instanceof tsr) {
                tsr tsrVar = (tsr) messageObject;
                if (tsrVar.a()) {
                    int iC = c(tsrVar.b().ai());
                    if (wvg.e(iArr, iC) <= -1) {
                        iArr[i] = iC;
                        i++;
                    }
                }
            }
        }
        if (i > 0) {
            int[] iArr2 = new int[i];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            return iArr2;
        }
        return new int[0];
    }
}
