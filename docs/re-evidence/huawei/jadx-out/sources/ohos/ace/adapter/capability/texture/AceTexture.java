package ohos.ace.adapter.capability.texture;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.IAceOnCallResourceMethod;
import ohos.ace.adapter.IAceOnResourceEvent;

/* JADX INFO: loaded from: classes20.dex */
public class AceTexture {
    private static final String EVENT = "event";
    private static final String FALSE = "false";
    private static final String LOG_TAG = "AceTexture";
    private static final String METHOD = "method";
    private static final String PARAM_BEGIN = "#HWJS-?-#";
    private static final String PARAM_EQUALS = "#HWJS-=-#";
    private static final String SUCCESS = "success";
    private static final String TEXTURE_ATTACH_TO_GL_CONTEXT_KEY = "attachToGLContext";
    private static final String TEXTURE_FLAG = "texture@";
    private static final String TEXTURE_GET_TEXTURE_ID_KEY = "getTextureId";
    private static final String TEXTURE_HEIGHT_KEY = "textureHeight";
    private static final String TEXTURE_ID_KEY = "textureId";
    private static final String TEXTURE_INIT_PARAM_KEY = "initParam";
    private static final String TEXTURE_IS_ATTACH = "isAttach";
    private static final String TEXTURE_REGISTER_SURFACE_VALUE = "registerSurface";
    private static final String TEXTURE_SET_TEXTURE_SIZE_KEY = "setTextureSize";
    private static final String TEXTURE_UPDATE_TEXTURE_IMAGE_KEY = "updateTextureImage";
    private static final String TEXTURE_WIDTH_KEY = "textureWidth";
    private final IAceOnResourceEvent callback;
    protected final long id;
    private int instanceId;
    protected final IAceSurfaceTexture surfaceTexture;
    protected final IAceTexture textureImpl;
    protected boolean hasRegisterSurface = false;
    private boolean hasRegisterTexture = false;
    private int textureWidth = 0;
    private int textureHeight = 0;
    private float[] transform = new float[16];
    private boolean useImageReaderMode = false;
    private IAceSurfaceTexture.OnFrameAvailableListener onFrameListener = new IAceSurfaceTexture.OnFrameAvailableListener() { // from class: ohos.ace.adapter.capability.texture.AceTexture.1
        @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(IAceSurfaceTexture iAceSurfaceTexture) {
            AceTexture.this.markTextureFrame();
        }
    };
    private Map<String, IAceOnCallResourceMethod> callMethodMap = new HashMap();

    public AceTexture(int i, long j, IAceTexture iAceTexture, IAceOnResourceEvent iAceOnResourceEvent, Map<String, String> map) {
        this.instanceId = -1;
        this.instanceId = i;
        this.id = j;
        this.textureImpl = iAceTexture;
        this.callback = iAceOnResourceEvent;
        registerCallMethods();
        if (getTextureMode(map)) {
            ALog.i(LOG_TAG, "AceTexture: Using ImageReader mode for textureId=" + j);
            this.surfaceTexture = new AceImageTexture(i, j, iAceTexture);
        } else {
            ALog.i(LOG_TAG, "AceTexture: Using SurfaceTexture mode for textureId=" + j);
            this.surfaceTexture = new AceSurfaceTexture(i, j, iAceTexture);
        }
        this.surfaceTexture.setOnFrameAvailableListener(this.onFrameListener);
    }

    private boolean getTextureMode(Map<String, String> map) {
        if (map != null && map.containsKey("useImageReader")) {
            this.useImageReaderMode = "true".equalsIgnoreCase(map.get("useImageReader"));
        }
        return this.useImageReaderMode;
    }

    private void registerCallMethods() {
        IAceOnCallResourceMethod iAceOnCallResourceMethod = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.texture.AceTexture.2
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public String onCall(Map<String, String> map) {
                return AceTexture.this.setTextureSize(map);
            }
        };
        this.callMethodMap.put(TEXTURE_FLAG + this.id + "method#HWJS-=-#setTextureSize#HWJS-?-#", iAceOnCallResourceMethod);
        IAceOnCallResourceMethod iAceOnCallResourceMethod2 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.texture.AceTexture.3
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public String onCall(Map<String, String> map) {
                return AceTexture.this.attachToGLContext(map);
            }
        };
        this.callMethodMap.put(TEXTURE_FLAG + this.id + "method#HWJS-=-#attachToGLContext#HWJS-?-#", iAceOnCallResourceMethod2);
        IAceOnCallResourceMethod iAceOnCallResourceMethod3 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.texture.AceTexture.4
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public String onCall(Map<String, String> map) {
                return AceTexture.this.updateTextureImage(map);
            }
        };
        this.callMethodMap.put(TEXTURE_FLAG + this.id + "method#HWJS-=-#updateTextureImage#HWJS-?-#", iAceOnCallResourceMethod3);
        IAceOnCallResourceMethod iAceOnCallResourceMethod4 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.texture.AceTexture.5
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public String onCall(Map<String, String> map) {
                return AceTexture.this.attachNativeWindow(map);
            }
        };
        this.callMethodMap.put(TEXTURE_FLAG + this.id + "method#HWJS-=-#attachNativeWindow#HWJS-?-#", iAceOnCallResourceMethod4);
        IAceOnCallResourceMethod iAceOnCallResourceMethod5 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.texture.AceTexture.6
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public String onCall(Map<String, String> map) {
                return AceTexture.this.getTextureId(map);
            }
        };
        this.callMethodMap.put(TEXTURE_FLAG + this.id + "method#HWJS-=-#getTextureId#HWJS-?-#", iAceOnCallResourceMethod5);
    }

    public Map<String, IAceOnCallResourceMethod> getCallMethod() {
        return this.callMethodMap;
    }

    public String getTextureId(Map<String, String> map) {
        IAceSurfaceTexture iAceSurfaceTexture = this.surfaceTexture;
        if (iAceSurfaceTexture == null) {
            ALog.e(LOG_TAG, "surfaceTexture is null.");
            return "";
        }
        return "textureId:" + iAceSurfaceTexture.getTextureId();
    }

    public String setTextureSize(Map<String, String> map) {
        if (!map.containsKey(TEXTURE_WIDTH_KEY) || !map.containsKey(TEXTURE_HEIGHT_KEY)) {
            return FALSE;
        }
        try {
            this.textureWidth = Integer.parseInt(map.get(TEXTURE_WIDTH_KEY));
            int i = Integer.parseInt(map.get(TEXTURE_HEIGHT_KEY));
            this.textureHeight = i;
            this.surfaceTexture.setTextureSize(this.textureWidth, i);
            String str = "textureWidth=" + this.textureWidth + "&textureHeight=" + this.textureHeight;
            this.callback.onEvent(TEXTURE_FLAG + this.id + "event#HWJS-=-#onChanged#HWJS-?-#", str);
            return "success";
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "NumberFormatException, setTextureSize failed");
            return FALSE;
        }
    }

    public String updateTextureImage(Map<String, String> map) {
        IAceSurfaceTexture iAceSurfaceTexture = this.surfaceTexture;
        if (iAceSurfaceTexture == null) {
            ALog.e(LOG_TAG, "updateTextureImage surfaceTexture is null.");
            return FALSE;
        }
        iAceSurfaceTexture.updateTexImage();
        float[] transformMatrix = this.surfaceTexture.getTransformMatrix();
        this.transform = transformMatrix;
        if (transformMatrix == null || transformMatrix.length < 16) {
            return FALSE;
        }
        String str = "transform=[" + this.transform[0];
        for (int i = 1; i < this.transform.length; i++) {
            str = (str + ",") + this.transform[i];
        }
        return str + "]";
    }

    public String attachToGLContext(Map<String, String> map) {
        ALog.i(LOG_TAG, "attachToGLContext start.");
        if (!map.containsKey(TEXTURE_ID_KEY)) {
            ALog.e(LOG_TAG, "attachToGLContext texture id is empty.");
            return FALSE;
        }
        if (this.surfaceTexture == null) {
            ALog.e(LOG_TAG, "attachToGLContext surfaceTexture is null.");
            return FALSE;
        }
        int i = Integer.parseInt(map.get(TEXTURE_ID_KEY));
        if (Integer.parseInt(map.get(TEXTURE_IS_ATTACH)) == 1) {
            this.surfaceTexture.attachToGLContext(i);
        } else {
            this.surfaceTexture.detachFromGLContext();
        }
        ALog.i(LOG_TAG, "attachToGLContext end." + i);
        return "success";
    }

    public SurfaceTexture getSurfaceTexture() {
        IAceSurfaceTexture iAceSurfaceTexture = this.surfaceTexture;
        if (iAceSurfaceTexture == null) {
            return null;
        }
        return iAceSurfaceTexture.getTexture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String attachNativeWindow(Map<String, String> map) {
        ALog.d(LOG_TAG, "attachNativeWindow called.");
        Surface surface = getSurface();
        if (surface == null) {
            ALog.e(LOG_TAG, "surface is null, attachNativeWindow failed");
            return FALSE;
        }
        long jAttachNaitveSurface = this.textureImpl.attachNaitveSurface(surface);
        ALog.d(LOG_TAG, "Surface attach:" + jAttachNaitveSurface);
        return "nativeWindow=" + jAttachNaitveSurface;
    }

    public Surface getSurface() {
        IAceSurfaceTexture iAceSurfaceTexture = this.surfaceTexture;
        if (iAceSurfaceTexture == null) {
            return null;
        }
        return iAceSurfaceTexture.getSurface();
    }

    public long getId() {
        return this.id;
    }

    public void release() {
        this.surfaceTexture.release();
    }

    public void markTextureFrame() {
        this.textureImpl.markTextureFrameAvailable(this.id);
        String str = "instanceId=" + this.instanceId + "&textureId=" + this.id;
        this.callback.onEvent(TEXTURE_FLAG + this.id + "event#HWJS-=-#markTextureAvailable#HWJS-?-#", str);
    }
}
