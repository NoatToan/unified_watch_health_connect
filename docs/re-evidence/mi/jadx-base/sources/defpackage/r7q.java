package defpackage;

import android.widget.ImageView;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.events.TouchEventType;
import com.facebook.react.views.webview.events.TopLoadingErrorEvent;
import com.facebook.react.views.webview.events.TopLoadingFinishEvent;
import com.facebook.react.views.webview.events.TopLoadingStartEvent;
import com.facebook.react.views.webview.events.TopMessageEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class r7q {
    public static Map a() {
        return e4f.a().b("topChange", e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onChange", "captured", "onChangeCapture"))).b("topSelect", e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onSelect", "captured", "onSelectCapture"))).b(TouchEventType.getJSEventName(TouchEventType.START), e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).b(TouchEventType.getJSEventName(TouchEventType.MOVE), e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).b(TouchEventType.getJSEventName(TouchEventType.END), e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).b(TouchEventType.getJSEventName(TouchEventType.CANCEL), e4f.d("phasedRegistrationNames", e4f.e("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).a();
    }

    public static Map<String, Object> b() {
        HashMap mapB = e4f.b();
        mapB.put("UIView", e4f.d("ContentMode", e4f.f("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        mapB.put("StyleConstants", e4f.d("PointerEventsValues", e4f.g("none", Integer.valueOf(PointerEvents.NONE.ordinal()), "boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal()))));
        mapB.put("PopupMenu", e4f.e("dismissed", "dismissed", "itemSelected", "itemSelected"));
        mapB.put("AccessibilityEventTypes", e4f.f("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return mapB;
    }

    public static Map c() {
        return e4f.a().b("topContentSizeChange", e4f.d("registrationName", "onContentSizeChange")).b("topLayout", e4f.d("registrationName", "onLayout")).b(TopLoadingErrorEvent.EVENT_NAME, e4f.d("registrationName", "onLoadingError")).b(TopLoadingFinishEvent.EVENT_NAME, e4f.d("registrationName", "onLoadingFinish")).b(TopLoadingStartEvent.EVENT_NAME, e4f.d("registrationName", "onLoadingStart")).b("topSelectionChange", e4f.d("registrationName", "onSelectionChange")).b(TopMessageEvent.EVENT_NAME, e4f.d("registrationName", "onMessage")).b("topClick", e4f.d("registrationName", "onClick")).b("topScrollBeginDrag", e4f.d("registrationName", "onScrollBeginDrag")).b("topScrollEndDrag", e4f.d("registrationName", "onScrollEndDrag")).b("topScroll", e4f.d("registrationName", "onScroll")).b("topMomentumScrollBegin", e4f.d("registrationName", "onMomentumScrollBegin")).b("topMomentumScrollEnd", e4f.d("registrationName", "onMomentumScrollEnd")).a();
    }
}
