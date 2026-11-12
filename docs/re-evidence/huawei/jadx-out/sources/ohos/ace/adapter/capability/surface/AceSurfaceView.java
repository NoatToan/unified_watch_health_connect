package ohos.ace.adapter.capability.surface;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.operation.utils.Constants;
import java.util.HashMap;
import java.util.Map;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.AceSurfaceHolder;
import ohos.ace.adapter.IAceOnCallResourceMethod;
import ohos.ace.adapter.IAceOnResourceEvent;
import ohos.ace.adapter.WindowViewSurface;

/* JADX INFO: loaded from: classes20.dex */
public class AceSurfaceView extends SurfaceView implements SurfaceHolder.Callback, View.OnLayoutChangeListener {
    private static final String EVENT = "event";
    private static final String FALSE = "false";
    private static final String LOG_TAG = "AceSurfaceView";
    private static final String METHOD = "method";
    private static final String PARAM_BEGIN = "#HWJS-?-#";
    private static final String PARAM_EQUALS = "#HWJS-=-#";
    private static final String SUCCESS = "success";
    private static final String SURFACE_FLAG = "surface@";
    private static final String SURFACE_HEIGHT_KEY = "surfaceHeight";
    private static final String SURFACE_LEFT_KEY = "surfaceLeft";
    private static final String SURFACE_SET_BOUNDS = "setSurfaceBounds";
    private static final String SURFACE_TOP_KEY = "surfaceTop";
    private static final String SURFACE_WIDTH_KEY = "surfaceWidth";
    private Map<String, IAceOnCallResourceMethod> callMethodMap;
    private final IAceOnResourceEvent callback;
    private Context context;
    protected final long id;
    private int instanceId;
    protected Surface surface;
    private int surfaceHeight;
    private final IAceSurface surfaceImpl;
    private int surfaceLeft;
    private int surfaceTop;
    private int surfaceWidth;
    private boolean viewAdded;

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public AceSurfaceView(Context context, long j, IAceOnResourceEvent iAceOnResourceEvent, Map<String, String> map, IAceSurface iAceSurface, int i) {
        super(context);
        this.surface = null;
        this.surfaceLeft = 0;
        this.surfaceTop = 0;
        this.surfaceWidth = 0;
        this.surfaceHeight = 0;
        this.viewAdded = false;
        this.instanceId = 0;
        this.id = j;
        this.surfaceImpl = iAceSurface;
        this.callback = iAceOnResourceEvent;
        this.callMethodMap = new HashMap();
        this.context = context;
        this.instanceId = i;
        getHolder().addCallback(this);
        addOnLayoutChangeListener(this);
        initCallMethodMap();
    }

    public void setRootView(View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewGroup;
            frameLayout.addView(this, frameLayout.getChildCount() - 1, buildLayoutParams(0, 0, 0, 0));
        }
    }

    private void initCallMethodMap() {
        IAceOnCallResourceMethod iAceOnCallResourceMethod = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.surface.AceSurfaceView.1
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public String onCall(Map<String, String> map) {
                return AceSurfaceView.this.setSurfaceBounds(map);
            }
        };
        this.callMethodMap.put(SURFACE_FLAG + this.id + "method#HWJS-=-#setSurfaceBounds#HWJS-?-#", iAceOnCallResourceMethod);
        IAceOnCallResourceMethod iAceOnCallResourceMethod2 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.surface.AceSurfaceView$$ExternalSyntheticLambda0
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m1993x4bddb9d4(map);
            }
        };
        this.callMethodMap.put(SURFACE_FLAG + this.id + "method#HWJS-=-#setIsFullScreen#HWJS-?-#", iAceOnCallResourceMethod2);
        IAceOnCallResourceMethod iAceOnCallResourceMethod3 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.surface.AceSurfaceView.2
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public String onCall(Map<String, String> map) {
                return AceSurfaceView.this.attachNativeWindow(map);
            }
        };
        this.callMethodMap.put(SURFACE_FLAG + this.id + "method#HWJS-=-#attachNativeWindow#HWJS-?-#", iAceOnCallResourceMethod3);
    }

    public Map<String, IAceOnCallResourceMethod> getCallMethod() {
        return this.callMethodMap;
    }

    public String setSurfaceBounds(Map<String, String> map) {
        if (!map.containsKey(SURFACE_WIDTH_KEY) || !map.containsKey(SURFACE_HEIGHT_KEY)) {
            return FALSE;
        }
        try {
            this.surfaceLeft = Integer.parseInt(map.get(SURFACE_LEFT_KEY));
            this.surfaceTop = Integer.parseInt(map.get(SURFACE_TOP_KEY));
            this.surfaceWidth = Integer.parseInt(map.get(SURFACE_WIDTH_KEY));
            this.surfaceHeight = Integer.parseInt(map.get(SURFACE_HEIGHT_KEY));
            ALog.i(LOG_TAG, "setSurfaceBounds (" + this.surfaceLeft + ", " + this.surfaceTop + ") - (" + this.surfaceWidth + " x " + this.surfaceHeight + Constants.RIGHT_BRACKET_ONLY);
            setLayoutParams(buildLayoutParams(this.surfaceLeft, this.surfaceTop, this.surfaceWidth, this.surfaceHeight));
            if (this.viewAdded) {
                invalidate();
                return "success";
            }
            this.viewAdded = true;
            ALog.i(LOG_TAG, "AceSurfaceView added");
            return "success";
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "NumberFormatException, setSurfaceSize failed");
            return FALSE;
        }
    }

    /* JADX INFO: renamed from: setIsFullScreen, reason: merged with bridge method [inline-methods] */
    public String m1993x4bddb9d4(Map<String, String> map) {
        if (!map.containsKey("isFullScreen")) {
            return FALSE;
        }
        try {
            ALog.i(LOG_TAG, "isFullScreen:" + map.get("isFullScreen"));
            int i = Integer.parseInt(map.get("isFullScreen"));
            ViewGroup viewGroup = (ViewGroup) getParent();
            ALog.i(LOG_TAG, "this surfaceview count:" + viewGroup.getChildCount());
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                ALog.i(LOG_TAG, "this surfaceview name:" + childAt.getClass().getName().toString());
                if ((childAt instanceof WindowViewSurface) || childAt == this) {
                    ALog.i(LOG_TAG, "this surfaceview is window view.");
                } else {
                    SurfaceView surfaceView = (SurfaceView) childAt;
                    if (i == 0) {
                        surfaceView.setVisibility(0);
                    } else {
                        surfaceView.setVisibility(4);
                    }
                }
            }
            return "success";
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "NumberFormatException, setIsFullScreen failed");
            return FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String attachNativeWindow(Map<String, String> map) {
        ALog.i(LOG_TAG, "attachNativeWindow called.");
        Surface surface = this.surface;
        if (surface == null) {
            ALog.e(LOG_TAG, "NumberFormatException, attachNativeWindow failed");
            return FALSE;
        }
        long jAttachNaitveSurface = this.surfaceImpl.attachNaitveSurface(surface);
        ALog.i(LOG_TAG, "Surface attach:" + jAttachNaitveSurface);
        return "nativeWindow=" + jAttachNaitveSurface;
    }

    public Surface getSurface() {
        return this.surface;
    }

    public long getResId() {
        return this.id;
    }

    public void release() {
        if (this.viewAdded) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
            }
            this.viewAdded = false;
            ALog.i(LOG_TAG, "AceSurfaceView removed");
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ALog.i(LOG_TAG, "Surface Created");
        this.surface = surfaceHolder.getSurface();
        this.callback.onEvent(SURFACE_FLAG + this.id + "event#HWJS-=-#onCreate#HWJS-?-#", "");
        AceSurfaceHolder.addSurface(this.instanceId, this.id, this.surface);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ALog.i(LOG_TAG, "Surface Changed, width:" + i2 + " height:" + i3);
        IAceOnResourceEvent iAceOnResourceEvent = this.callback;
        iAceOnResourceEvent.onEvent(SURFACE_FLAG + this.id + "event#HWJS-=-#onChanged#HWJS-?-#", "surfaceWidth=" + i2 + "&surfaceHeight=" + i3);
        this.surfaceWidth = i2;
        this.surfaceHeight = i3;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ALog.i(LOG_TAG, "Surface Destroyed");
        this.surface = null;
        this.callback.onEvent(SURFACE_FLAG + this.id + "event#HWJS-=-#onDestroyed#HWJS-?-#", "");
        AceSurfaceHolder.removeSurface(this.instanceId, this.id);
    }

    private FrameLayout.LayoutParams buildLayoutParams(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        return layoutParams;
    }
}
