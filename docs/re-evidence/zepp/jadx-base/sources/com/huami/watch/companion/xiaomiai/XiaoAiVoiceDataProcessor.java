package com.huami.watch.companion.xiaomiai;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.xiaomiai.alexa.VoiceDataCallback;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class XiaoAiVoiceDataProcessor implements VoiceDataCallback<Object> {
    public static final String TAG = "XiaoAiProcessor";
    private Context mContext;
    private boolean mHasStart = false;
    private FileTransfer mTransfer;
    private EngineProcessor mVoiceEngineProcessor;

    public XiaoAiVoiceDataProcessor(Context context, FileTransfer fileTransfer) {
        this.mVoiceEngineProcessor = new EngineProcessor(context, fileTransfer);
        this.mContext = context;
        this.mTransfer = fileTransfer;
    }

    private void doEndTag() {
        this.mVoiceEngineProcessor.doEndSpeech();
        VoiceParcelFD voiceParcelFD = this.mVoiceEngineProcessor.getVoiceParcelFD();
        if (voiceParcelFD == null) {
            Log.d(TAG, "onDataArrived action end fd is null", new Object[0]);
        } else {
            Log.d(TAG, "onDataArrived action end close fd", new Object[0]);
            voiceParcelFD.closeWriteParcelFD();
        }
    }

    public void changeEngineStyle() {
        this.mVoiceEngineProcessor.changeEngineStyle();
    }

    public void handleXiaoAiVoiceData(Object obj) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject;
        Log.d(TAG, "onDataArrived  " + obj.toString(), new Exception());
        if (DeviceUtil.isRomSupportMiAI(this.mContext)) {
            if (obj instanceof String) {
                String str = (String) obj;
                Log.d(VoiceProtocol.HUAMI_CMD_KEY, "=====cmd is " + str, new Object[0]);
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    String strOptString = jSONObject2.optString(VoiceProtocol.HUAMI_CMD_KEY);
                    JSONObject jSONObjectOptJSONObject2 = null;
                    if (TextUtils.isEmpty(strOptString)) {
                        jSONObject = null;
                    } else {
                        try {
                            JSONObject jSONObject3 = new JSONObject(strOptString);
                            jSONObjectOptJSONObject = jSONObject3.optJSONObject(VoiceProtocol.HUAMI_CMD_REQUEIRED_CONTEXT);
                            if (jSONObjectOptJSONObject != null) {
                                try {
                                    SharedPreferences.Editor editorEdit = this.mContext.getSharedPreferences(VoiceProtocol.HUAMI_CMD_KEY, 0).edit();
                                    editorEdit.putString(VoiceProtocol.HUAMI_CMD_REQUEIRED_CONTEXT, jSONObjectOptJSONObject.toString());
                                    editorEdit.commit();
                                } catch (JSONException e) {
                                    e = e;
                                    Log.e(TAG, "onDataArrived context parser : " + e.toString(), e, new Object[0]);
                                }
                            }
                            jSONObjectOptJSONObject2 = jSONObject3.optJSONObject(VoiceProtocol.HUAMI_CMD_OPTIONAL_CONTEXT);
                        } catch (JSONException e2) {
                            e = e2;
                            jSONObjectOptJSONObject = null;
                        }
                        jSONObject = jSONObjectOptJSONObject2;
                        jSONObjectOptJSONObject2 = jSONObjectOptJSONObject;
                    }
                    String string = jSONObject2.getString(VoiceProtocol.CMD);
                    if (VoiceProtocol.START.equals(string)) {
                        if (this.mHasStart) {
                            Log.d(TAG, "has stated ,so wo need do something", new Object[0]);
                            doEndTag();
                        }
                        this.mHasStart = true;
                        this.mVoiceEngineProcessor.doListeningSpeech(jSONObjectOptJSONObject2, jSONObject);
                        this.mTransfer.sendCmd(VoiceProtocol.ACK);
                    } else if (VoiceProtocol.END.equals(string)) {
                        this.mHasStart = false;
                        doEndTag();
                    } else {
                        Log.d(TAG, "not equals cmd " + str + "  start cmd : " + VoiceProtocol.START + "  end cmd : " + VoiceProtocol.END, new Object[0]);
                    }
                } catch (JSONException e3) {
                    Log.e(TAG, "onDataArrived action " + e3.toString(), e3, new Object[0]);
                }
            }
            if (obj instanceof byte[]) {
                if (!this.mHasStart) {
                    Log.d(TAG, "onDataArrived action byte not header start", new Object[0]);
                } else {
                    byte[] bArr = (byte[]) obj;
                    this.mVoiceEngineProcessor.addBuffer(bArr, 0, bArr.length);
                }
            }
        }
    }

    @Override // com.huami.watch.companion.xiaomiai.alexa.VoiceDataCallback
    public void onDataArrived(Object obj) {
        handleXiaoAiVoiceData(obj);
    }
}
