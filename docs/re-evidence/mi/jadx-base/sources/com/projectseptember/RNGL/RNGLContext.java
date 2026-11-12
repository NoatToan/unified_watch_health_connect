package com.projectseptember.RNGL;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import defpackage.iva;
import defpackage.mva;
import defpackage.ndj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = RNGLContext.NAME)
public class RNGLContext extends ReactContextBaseJavaModule {
    public static final String NAME = "RNGLContext";
    private static String STATIC_VERT = "attribute vec2 position;varying vec2 uv;void main() {gl_Position = vec4(position,0.0,1.0);uv = vec2(0.5, 0.5) * (position+vec2(1.0, 1.0));}";
    private Map<Integer, iva> fbos;
    private Map<Integer, Callback> onCompileCallbacks;
    private Map<Integer, mva> shaders;

    public RNGLContext(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.shaders = new HashMap();
        this.fbos = new HashMap();
        this.onCompileCallbacks = new HashMap();
    }

    public static String glTypeString(int i) {
        if (i == 5124) {
            return "int";
        }
        if (i == 5126) {
            return "float";
        }
        if (i == 35678) {
            return "sampler2D";
        }
        if (i == 35680) {
            return "samplerCube";
        }
        switch (i) {
            case 35664:
                return "vec2";
            case 35665:
                return "vec3";
            case 35666:
                return "vec4";
            case 35667:
                return "ivec2";
            case 35668:
                return "ivec3";
            case 35669:
                return "ivec4";
            case 35670:
                return "bool";
            case 35671:
                return "bvec2";
            case 35672:
                return "bvec3";
            case 35673:
                return "bvec4";
            case 35674:
                return "mat2";
            case 35675:
                return "mat3";
            case 35676:
                return "mat4";
            default:
                return "";
        }
    }

    @ReactMethod
    public void addShader(Integer num, ReadableMap readableMap, Callback callback) {
        String string = readableMap.getString("frag");
        String string2 = readableMap.getString("name");
        synchronized (this) {
            try {
                String string3 = STATIC_VERT;
                if (readableMap.hasKey("vert")) {
                    string3 = readableMap.getString("vert");
                }
                this.shaders.put(num, new mva(string2, string3, string));
                if (callback != null) {
                    this.onCompileCallbacks.put(num, callback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public mva getShader(Integer num) {
        mva mvaVar;
        synchronized (this) {
            mvaVar = this.shaders.get(num);
        }
        return mvaVar;
    }

    @ReactMethod
    public void removeShader(Integer num) {
        mva mvaVarRemove;
        synchronized (this) {
            mvaVarRemove = this.shaders.remove(num);
        }
        if (mvaVarRemove != null) {
            return;
        }
        throw new Error("removeShader(" + num + "): shader does not exist");
    }

    public void shaderFailedToCompile(Integer num, GLShaderCompilationFailed gLShaderCompilationFailed) {
        Callback callback;
        synchronized (this) {
            callback = this.onCompileCallbacks.get(num);
            this.onCompileCallbacks.remove(num);
        }
        if (callback == null) {
            gLShaderCompilationFailed.getMessage();
        } else {
            callback.invoke(gLShaderCompilationFailed.compileError);
        }
    }

    public void shaderSucceedToCompile(Integer num, Map<String, Integer> map) {
        Callback callback;
        synchronized (this) {
            callback = this.onCompileCallbacks.get(num);
            this.onCompileCallbacks.remove(num);
        }
        if (callback != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            for (String str : map.keySet()) {
                writableMapCreateMap2.putString(str, glTypeString(map.get(str).intValue()));
            }
            writableMapCreateMap.putMap("uniforms", writableMapCreateMap2);
            callback.invoke(null, writableMapCreateMap);
        }
    }
}
