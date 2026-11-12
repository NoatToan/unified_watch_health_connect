package defpackage;

import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import com.xiaomi.ai.api.intent.AIApiConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class jm8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f22919a;

    static {
        HashMap map = new HashMap();
        f22919a = map;
        map.put("View", ReactViewManager.REACT_CLASS);
        map.put(AIApiConstants.Image.NAME, ReactImageManager.REACT_CLASS);
        map.put("ScrollView", ReactScrollViewManager.REACT_CLASS);
        map.put("Slider", ReactSliderManager.REACT_CLASS);
        map.put("ModalHostView", ReactModalHostManager.REACT_CLASS);
        map.put("Paragraph", ReactTextViewManager.REACT_CLASS);
        map.put("Text", "RCText");
        map.put("RawText", ReactRawTextManager.REACT_CLASS);
        map.put("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS);
        map.put("ShimmeringView", "RKShimmeringView");
        map.put("TemplateView", "RCTTemplateView");
        map.put("AxialGradientView", "RCTAxialGradientView");
    }

    public static String a(String str) {
        String str2 = f22919a.get(str);
        return str2 != null ? str2 : str;
    }
}
