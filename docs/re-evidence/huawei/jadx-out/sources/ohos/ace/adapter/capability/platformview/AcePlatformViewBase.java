package ohos.ace.adapter.capability.platformview;

import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import ohos.ace.adapter.IAceOnCallResourceMethod;
import ohos.ace.adapter.IAceOnResourceEvent;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AcePlatformViewBase {
    private static final String EVENT = "event";
    private static final String LOG_TAG = "AcePlatformViewBase";
    private static final String METHOD = "method";
    private static final String PARAM_AND = "#HWJS-&-#";
    private static final String PARAM_BEGIN = "#HWJS-?-#";
    private static final String PARAM_EQUALS = "#HWJS-=-#";
    private static final String PLATFORM_VIEW_FLAG = "platformview@";
    private final Map<String, IAceOnCallResourceMethod> callMethodMap;
    private final IAceOnResourceEvent callback;
    private final long id;

    /* JADX INFO: renamed from: dispose, reason: merged with bridge method [inline-methods] */
    public abstract String m1988x9512ab65(Map<String, String> map);

    public abstract void onActivityPause();

    public abstract void onActivityResume();

    public abstract String registerPlatformView(Map<String, String> map);

    public abstract void release();

    public abstract String runAsync(Runnable runnable);

    /* JADX INFO: renamed from: setRotation, reason: merged with bridge method [inline-methods] */
    public abstract String m1991x51cdfa42(Map<String, String> map);

    /* JADX INFO: renamed from: setScale, reason: merged with bridge method [inline-methods] */
    public abstract String m1989x29511b04(Map<String, String> map);

    public abstract void setTouchEvent(MotionEvent motionEvent);

    /* JADX INFO: renamed from: setTransformMatrix, reason: merged with bridge method [inline-methods] */
    public abstract String m1992xe60c69e1(Map<String, String> map);

    /* JADX INFO: renamed from: setTranslation, reason: merged with bridge method [inline-methods] */
    public abstract String m1990xbd8f8aa3(Map<String, String> map);

    /* JADX INFO: renamed from: touchCancel, reason: merged with bridge method [inline-methods] */
    public abstract String m1987xd43bc6(Map<String, String> map);

    /* JADX INFO: renamed from: touchDown, reason: merged with bridge method [inline-methods] */
    public abstract String m1984x4418ece9(Map<String, String> map);

    /* JADX INFO: renamed from: touchMove, reason: merged with bridge method [inline-methods] */
    public abstract String m1986x6c95cc27(Map<String, String> map);

    /* JADX INFO: renamed from: touchUp, reason: merged with bridge method [inline-methods] */
    public abstract String m1985xd8575c88(Map<String, String> map);

    public abstract String updateLayout(Map<String, String> map);

    public AcePlatformViewBase(long j, IAceOnResourceEvent iAceOnResourceEvent) {
        this.id = j;
        this.callback = iAceOnResourceEvent;
        HashMap map = new HashMap();
        this.callMethodMap = map;
        map.put(PLATFORM_VIEW_FLAG + j + "method#HWJS-=-#registerPlatformView#HWJS-?-#", new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase.1
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public String onCall(Map<String, String> map2) {
                AcePlatformViewBase.this.runAsync(new InnerProcessor(map2) { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase.1.1
                    {
                        AcePlatformViewBase acePlatformViewBase = AcePlatformViewBase.this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        AcePlatformViewBase.this.registerPlatformView(this.param);
                    }
                });
                return "";
            }
        });
        map.put(PLATFORM_VIEW_FLAG + j + "method#HWJS-=-#updateLayout#HWJS-?-#", new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase.2
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public String onCall(Map<String, String> map2) {
                AcePlatformViewBase.this.runAsync(new InnerProcessor(map2) { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase.2.1
                    {
                        AcePlatformViewBase acePlatformViewBase = AcePlatformViewBase.this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        AcePlatformViewBase.this.updateLayout(this.param);
                    }
                });
                return "";
            }
        });
        map.put(PLATFORM_VIEW_FLAG + j + "method#HWJS-=-#touchDown#HWJS-?-#", new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase$$ExternalSyntheticLambda0
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map2) {
                return this.f$0.m1984x4418ece9(map2);
            }
        });
        map.put(PLATFORM_VIEW_FLAG + j + "method#HWJS-=-#touchUp#HWJS-?-#", new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase$$ExternalSyntheticLambda1
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map2) {
                return this.f$0.m1985xd8575c88(map2);
            }
        });
        map.put(PLATFORM_VIEW_FLAG + j + "method#HWJS-=-#touchMove#HWJS-?-#", new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase$$ExternalSyntheticLambda2
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map2) {
                return this.f$0.m1986x6c95cc27(map2);
            }
        });
        map.put(PLATFORM_VIEW_FLAG + j + "method#HWJS-=-#touchCancel#HWJS-?-#", new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase$$ExternalSyntheticLambda3
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map2) {
                return this.f$0.m1987xd43bc6(map2);
            }
        });
        map.put(PLATFORM_VIEW_FLAG + j + "method#HWJS-=-#dispose#HWJS-?-#", new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase$$ExternalSyntheticLambda4
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map2) {
                return this.f$0.m1988x9512ab65(map2);
            }
        });
        map.put(PLATFORM_VIEW_FLAG + j + "method#HWJS-=-#setScale#HWJS-?-#", new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase$$ExternalSyntheticLambda5
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map2) {
                return this.f$0.m1989x29511b04(map2);
            }
        });
        map.put(PLATFORM_VIEW_FLAG + j + "method#HWJS-=-#setTranslate#HWJS-?-#", new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase$$ExternalSyntheticLambda6
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map2) {
                return this.f$0.m1990xbd8f8aa3(map2);
            }
        });
        map.put(PLATFORM_VIEW_FLAG + j + "method#HWJS-=-#setRotation#HWJS-?-#", new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase$$ExternalSyntheticLambda7
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map2) {
                return this.f$0.m1991x51cdfa42(map2);
            }
        });
        map.put(PLATFORM_VIEW_FLAG + j + "method#HWJS-=-#setTransformMatrix#HWJS-?-#", new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewBase$$ExternalSyntheticLambda8
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map2) {
                return this.f$0.m1992xe60c69e1(map2);
            }
        });
    }

    public Map<String, IAceOnCallResourceMethod> getCallMethod() {
        return this.callMethodMap;
    }

    public long getId() {
        return this.id;
    }

    public void platformViewReady() {
        this.callback.onEvent(PLATFORM_VIEW_FLAG + this.id + "event#HWJS-=-#platformViewReady#HWJS-?-#", "");
    }

    /* JADX INFO: loaded from: classes46.dex */
    public abstract class InnerProcessor implements Runnable {
        Map<String, String> param;

        public InnerProcessor(Map<String, String> map) {
            this.param = map;
        }
    }
}
