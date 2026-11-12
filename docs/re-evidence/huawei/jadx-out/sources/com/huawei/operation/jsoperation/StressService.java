package com.huawei.operation.jsoperation;

import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.adapter.PluginOperationAdapter;
import defpackage.iov;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class StressService implements JsCommand {
    private static final String CHECK_MONITOR = "monitor_type";
    private static final int HAVE_DEVICE = 1;
    private static final String TAG = "PluginOperation_StressService";
    private static final int TOTAL_TIME_TYPE_60 = 0;
    private int mResultCode = 0;
    private int mBreathType = 0;
    private int mBreathDuration = 0;
    private int mBreathRhythm = -1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    @Override // com.huawei.operation.jsoperation.JsCommand
    public void execute(WebViewActivity webViewActivity, PluginOperationAdapter pluginOperationAdapter, JsCommandOption jsCommandOption) {
        if (jsCommandOption == null || webViewActivity == null || pluginOperationAdapter == null) {
            LogUtil.e(TAG, "execute option or web or adapter is null");
            return;
        }
        LogUtil.a(TAG, "execute fun type is ", jsCommandOption.getFuncType());
        String funcType = jsCommandOption.getFuncType();
        funcType.hashCode();
        switch (funcType) {
            case "CALIBRATION_CONTROL":
                calibrationControl(webViewActivity, pluginOperationAdapter, jsCommandOption);
                break;
            case "RESET_CALIBRATION":
                resetCalibration(webViewActivity, pluginOperationAdapter, jsCommandOption);
                break;
            case "RELAX_CONTROL":
                relaxControl(webViewActivity, pluginOperationAdapter, jsCommandOption);
                break;
            case "CHECK_CONNECTED":
                checkConnected(webViewActivity, pluginOperationAdapter, jsCommandOption);
                break;
            case "BREATHE_CONTROL":
                breatheControl(webViewActivity, pluginOperationAdapter, jsCommandOption);
                break;
            case "STRESS_CONTROL":
                stressControl(webViewActivity, pluginOperationAdapter, jsCommandOption);
                break;
            case "GAME_CONTROL":
                gameControl(webViewActivity, pluginOperationAdapter, jsCommandOption);
                break;
            case "CHECK_CALIBRATION":
                checkCalibration(webViewActivity, pluginOperationAdapter, jsCommandOption);
                break;
        }
    }

    private void breatheControl(WebViewActivity webViewActivity, PluginOperationAdapter pluginOperationAdapter, JsCommandOption jsCommandOption) {
        String param = jsCommandOption.getParam();
        String functionRes = jsCommandOption.getFunctionRes();
        try {
            JSONObject jSONObject = new JSONObject(param);
            this.mBreathType = jSONObject.optInt("type");
            this.mBreathDuration = jSONObject.optInt(JsUtil.BREATHE_TIME);
            this.mBreathRhythm = jSONObject.optInt(JsUtil.BREATHE_RHYTHM);
            this.mResultCode = jSONObject.optInt("result_code");
            switchBreathe(webViewActivity, pluginOperationAdapter, jsCommandOption);
        } catch (JSONException e) {
            LogUtil.e(TAG, "breatheControl parse param json fail ", e.getMessage());
            JsUtil.runJsFunc(webViewActivity, functionRes, 1001, "");
        }
    }

    private void switchBreathe(WebViewActivity webViewActivity, PluginOperationAdapter pluginOperationAdapter, JsCommandOption jsCommandOption) {
        String functionRes = jsCommandOption.getFunctionRes();
        int i = this.mBreathType;
        if (i == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resultCode", pluginOperationAdapter.getJanusDeviceConnect());
                JsUtil.runJsFunc(webViewActivity, functionRes, 0, jSONObject.toString());
                pluginOperationAdapter.breatheControl(1, 0, this.mBreathRhythm, 0, null);
                return;
            } catch (JSONException e) {
                LogUtil.e(TAG, "switchBreathe ", e.getMessage());
                JsUtil.runJsFunc(webViewActivity, functionRes, 0, "");
                return;
            }
        }
        pluginOperationAdapter.breatheControl(i, this.mBreathDuration, this.mBreathRhythm, this.mResultCode, new ResponseCallbackImpl(webViewActivity, functionRes));
    }

    private void stressControl(WebViewActivity webViewActivity, PluginOperationAdapter pluginOperationAdapter, JsCommandOption jsCommandOption) {
        if (JsUtil.checkAuth(webViewActivity, jsCommandOption.getFunctionRes(), jsCommandOption.isLegal())) {
            String param = jsCommandOption.getParam();
            String functionRes = jsCommandOption.getFunctionRes();
            try {
                JSONObject jSONObject = new JSONObject(param);
                pluginOperationAdapter.stressControl(jSONObject.getInt("type"), jSONObject.getInt("duration"), new ResponseCallbackImpl(webViewActivity, functionRes));
            } catch (JSONException e) {
                LogUtil.e(TAG, "stressControl parse param json fail ", e.getMessage());
                JsUtil.runJsFunc(webViewActivity, functionRes, 1001, null);
            }
        }
    }

    private void calibrationControl(WebViewActivity webViewActivity, PluginOperationAdapter pluginOperationAdapter, JsCommandOption jsCommandOption) {
        if (JsUtil.checkAuth(webViewActivity, jsCommandOption.getFunctionRes(), jsCommandOption.isLegal())) {
            String param = jsCommandOption.getParam();
            String functionRes = jsCommandOption.getFunctionRes();
            try {
                JSONObject jSONObject = new JSONObject(param);
                int i = jSONObject.getInt("type");
                int i2 = jSONObject.getInt(JsUtil.SCORE);
                pluginOperationAdapter.calibrationControl(i, jSONObject.getInt("duration"), i2, new ResponseCallbackImpl(webViewActivity, functionRes));
            } catch (JSONException e) {
                LogUtil.e(TAG, "calibrationControl parse param json fail ", e.getMessage());
                JsUtil.runJsFunc(webViewActivity, functionRes, 1001, null);
            }
        }
    }

    private void checkCalibration(WebViewActivity webViewActivity, PluginOperationAdapter pluginOperationAdapter, JsCommandOption jsCommandOption) {
        if (JsUtil.checkAuth(webViewActivity, jsCommandOption.getFunctionRes(), jsCommandOption.isLegal())) {
            pluginOperationAdapter.checkCalibration(new ResponseCallbackImpl(webViewActivity, jsCommandOption.getFunctionRes()));
        }
    }

    private void resetCalibration(WebViewActivity webViewActivity, PluginOperationAdapter pluginOperationAdapter, JsCommandOption jsCommandOption) {
        if (JsUtil.checkAuth(webViewActivity, jsCommandOption.getFunctionRes(), jsCommandOption.isLegal())) {
            pluginOperationAdapter.resetCalibration(new ResponseCallbackImpl(webViewActivity, jsCommandOption.getFunctionRes()));
        }
    }

    private void relaxControl(WebViewActivity webViewActivity, PluginOperationAdapter pluginOperationAdapter, JsCommandOption jsCommandOption) {
        if (JsUtil.checkAuth(webViewActivity, jsCommandOption.getFunctionRes(), jsCommandOption.isLegal())) {
            String param = jsCommandOption.getParam();
            String functionRes = jsCommandOption.getFunctionRes();
            try {
                JSONObject jSONObject = new JSONObject(param);
                pluginOperationAdapter.relaxControl(jSONObject.getInt("type"), jSONObject.getInt("duration"), new ResponseCallbackImpl(webViewActivity, functionRes));
            } catch (JSONException e) {
                LogUtil.e(TAG, "relaxControl parse param json fail ", e.getMessage());
                JsUtil.runJsFunc(webViewActivity, functionRes, 1001, null);
            }
        }
    }

    private void gameControl(WebViewActivity webViewActivity, PluginOperationAdapter pluginOperationAdapter, JsCommandOption jsCommandOption) {
        if (JsUtil.checkAuth(webViewActivity, jsCommandOption.getFunctionRes(), jsCommandOption.isLegal())) {
            String param = jsCommandOption.getParam();
            String functionRes = jsCommandOption.getFunctionRes();
            try {
                JSONObject jSONObject = new JSONObject(param);
                pluginOperationAdapter.gameControl(jSONObject.getInt("type"), jSONObject.getInt("duration"), jSONObject.getInt(JsUtil.SCORE), new ResponseCallbackImpl(webViewActivity, functionRes));
            } catch (JSONException e) {
                LogUtil.e(TAG, "gameControl parse param json fail ", e.getMessage());
                JsUtil.runJsFunc(webViewActivity, functionRes, 1001, null);
            }
        }
    }

    private void checkConnected(WebViewActivity webViewActivity, PluginOperationAdapter pluginOperationAdapter, JsCommandOption jsCommandOption) {
        if (JsUtil.checkAuth(webViewActivity, jsCommandOption.getFunctionRes(), jsCommandOption.isLegal())) {
            pluginOperationAdapter.checkConnected(new CheckConnectResponseCallbackImpl(webViewActivity, jsCommandOption.getFunctionRes()));
        }
    }

    static class ResponseCallbackImpl implements IBaseResponseCallback {
        private String mFunctionRes;
        private WeakReference<WebViewActivity> mWeakReference;

        ResponseCallbackImpl(WebViewActivity webViewActivity, String str) {
            this.mWeakReference = new WeakReference<>(webViewActivity);
            this.mFunctionRes = str;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            WebViewActivity webViewActivity = this.mWeakReference.get();
            if (iov.d(webViewActivity)) {
                JsUtil.runJsFunc(webViewActivity, this.mFunctionRes, i, obj);
            }
        }
    }

    static class CheckConnectResponseCallbackImpl implements IBaseResponseCallback {
        private String mFunctionRes;
        private WeakReference<WebViewActivity> mWeakReference;

        CheckConnectResponseCallbackImpl(WebViewActivity webViewActivity, String str) {
            this.mWeakReference = new WeakReference<>(webViewActivity);
            this.mFunctionRes = str;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            WebViewActivity webViewActivity = this.mWeakReference.get();
            if (webViewActivity == null || webViewActivity.isFinishing()) {
                return;
            }
            if (obj == null) {
                JsUtil.runJsFunc(webViewActivity, this.mFunctionRes, i, null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                jSONObject.put(StressService.CHECK_MONITOR, 0);
                JsUtil.runJsFunc(webViewActivity, this.mFunctionRes, i, jSONObject.toString());
            } catch (JSONException e) {
                LogUtil.e(StressService.TAG, "checkConnected", e.getMessage());
                JsUtil.runJsFunc(webViewActivity, this.mFunctionRes, i, obj);
            }
        }
    }
}
