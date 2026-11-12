package com.huami.watch.dataflow.sync;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.gson.GsonBuilder;
import com.huami.ecg.core.db.EcgDataBase;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.core.db.entity.EcgTagValue;
import com.huami.ecg.core.util.EcgFileUtil;
import com.huami.ecg.core.web.EcgWebApi;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.util.AacEncoder;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.bean.EcgSyncData;
import com.huami.watch.dataflow.sync.bean.SyncResult;
import com.huami.watch.opus.OpusCodecEncoder;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.ZipUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class EcgSync extends BaseDataSync<EcgSyncData> {
    private static final String b = "DataFlow-Sync-ECG";

    public EcgSync() {
        super(DataType.ECG);
    }

    private boolean a(EcgTagValue ecgTagValue) {
        return ecgTagValue == null || (ArraysUtil.isEmpty(ecgTagValue.getStringTags()) && TextUtils.isEmpty(ecgTagValue.getCom.huami.ecg.core.db.entity.EcgTag.CUSTOM_TAG java.lang.String()) && TextUtils.isEmpty(ecgTagValue.getCom.huami.ecg.core.db.entity.EcgTag.VOICE_TAG java.lang.String()));
    }

    private boolean b(Context context, String str, @NonNull String str2) {
        EcgFileUtil ecgFileUtil = EcgFileUtil.INSTANCE;
        File file = new File(ecgFileUtil.getEcgTempDir(context, str), "raw.zip");
        boolean zSaveSafe = FilesUtil.saveSafe(Base64.decode(str2, 0), file);
        if (zSaveSafe) {
            try {
                if (ArraysUtil.isEmpty(ZipUtil.upZipSelectedFile(file, ecgFileUtil.getEcgDir(context, str).getAbsolutePath(), "txt"))) {
                    return false;
                }
            } catch (Exception e) {
                Log.e(b, "解压ECG RAW FILE失败", e, new Object[0]);
                return false;
            }
        }
        return zSaveSafe;
    }

    private boolean c(Context context, EcgData ecgData) {
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        ecgData.setMSourceAppName(Cloud.SysParams.APP_NAME);
        ecgData.setUserId(currentUid);
        boolean zUploadEcg = new EcgWebApi().uploadEcg(ecgData, EcgFileUtil.INSTANCE.getEcgZipFile(context, currentUid, ecgData.getTimestamp()).getAbsolutePath());
        if (zUploadEcg) {
            ecgData.setServerUpdatedTime(System.currentTimeMillis());
            EcgDataBase.INSTANCE.getInstance().ecgDao().insertOrReplace(ecgData);
        }
        return zUploadEcg;
    }

    private void d(EcgSyncData ecgSyncData) {
        EcgDataBase.Companion companion = EcgDataBase.INSTANCE;
        EcgTag ecgTag = companion.getInstance().ecgTagDao().get(ecgSyncData.summary.getTimestamp());
        boolean zA = a(ecgSyncData.tag);
        if (ecgTag != null || !zA) {
            if (ecgTag == null) {
                ecgTag = new EcgTag();
                ecgTag.setEcgId(ecgSyncData.summary.getTimestamp());
            }
            if (!zA) {
                if (ecgTag.getValue() != null && !TextUtils.isEmpty(ecgTag.getValue().getCom.huami.ecg.core.db.entity.EcgTag.VOICE_TAG java.lang.String())) {
                    ecgSyncData.tag.setVoiceTag(ecgTag.getValue().getCom.huami.ecg.core.db.entity.EcgTag.VOICE_TAG java.lang.String());
                }
                ecgTag.setValue(ecgSyncData.tag);
            }
            ecgTag.setSynced(0);
        }
        if (ecgTag != null) {
            if (new EcgWebApi().saveEcgTag(ecgTag)) {
                ecgTag.setSynced(1);
            }
            companion.getInstance().ecgTagDao().insertOrReplace(ecgTag);
        }
    }

    private boolean e(Context context, String str, EcgSyncData ecgSyncData) {
        byte[] bArrOpusDecode;
        if (TextUtils.isEmpty(ecgSyncData.voiceData)) {
            return true;
        }
        byte[] bArrDecode = Base64.decode(ecgSyncData.voiceData, 0);
        OpusCodecEncoder opusCodecEncoder = new OpusCodecEncoder();
        byte[] bArrEncode = null;
        try {
            try {
                opusCodecEncoder.createOpusDecoder(16000, 1);
                bArrOpusDecode = opusCodecEncoder.opusDecode(bArrDecode, OpusCodecEncoder.OPUS_FRAME_DURATION.TIME_20, bArrDecode.length);
                opusCodecEncoder.destroyOpusDecoder();
            } catch (Exception e) {
                Log.e(b, "Ecg voice data opus decode fail,EcgId:" + ecgSyncData.summary.getTimestamp(), e, new Object[0]);
                opusCodecEncoder.destroyOpusDecoder();
                bArrOpusDecode = null;
            }
            if (bArrOpusDecode == null) {
                return false;
            }
            try {
                bArrEncode = new AacEncoder().encode(bArrOpusDecode);
            } catch (Exception e2) {
                Log.e(b, "Ecg voice data acc encode fail,EcgId:" + ecgSyncData.summary.getTimestamp(), e2, new Object[0]);
            }
            if (bArrEncode == null) {
                return false;
            }
            String strUploadVoiceTag = new EcgWebApi().uploadVoiceTag(ecgSyncData.summary.getTimestamp() + "voice.aac", bArrEncode);
            if (TextUtils.isEmpty(strUploadVoiceTag)) {
                return false;
            }
            EcgDataBase.Companion companion = EcgDataBase.INSTANCE;
            EcgTag ecgTag = companion.getInstance().ecgTagDao().get(ecgSyncData.summary.getTimestamp());
            if (ecgTag == null) {
                ecgTag = new EcgTag();
                ecgTag.setEcgId(ecgSyncData.summary.getTimestamp());
            }
            EcgTagValue value = ecgTag.getValue();
            if (value == null) {
                value = new EcgTagValue();
            }
            value.setVoiceTag(strUploadVoiceTag);
            ecgTag.setValue(value);
            ecgTag.setSynced(0);
            companion.getInstance().ecgTagDao().insertOrReplace(ecgTag);
            return true;
        } catch (Throwable th) {
            opusCodecEncoder.destroyOpusDecoder();
            throw th;
        }
    }

    private boolean f(Context context, String str, long j) throws Throwable {
        EcgFileUtil ecgFileUtil = EcgFileUtil.INSTANCE;
        File ecgFile = ecgFileUtil.getEcgFile(context, str, j);
        File ppgFile = ecgFileUtil.getPpgFile(context, str, j);
        if (!ecgFile.exists()) {
            Log.i(b, "Ecg raw file not exits", new Object[0]);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ecgFile);
        if (ppgFile.exists()) {
            arrayList.add(ppgFile);
        }
        try {
            File ecgZipFile = ecgFileUtil.getEcgZipFile(context, str, j);
            boolean zDelete = ecgZipFile.exists() ? ecgZipFile.delete() : true;
            if (zDelete) {
                zDelete = ecgZipFile.createNewFile();
            }
            if (zDelete) {
                ZipUtil.zip((File[]) arrayList.toArray(new File[0]), ecgZipFile);
            }
            return zDelete;
        } catch (IOException unused) {
            Log.e(b, "压缩ECG RAW FILE失败", new Object[0]);
            return false;
        }
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean saveToLocal(Context context, @NonNull EcgSyncData ecgSyncData) {
        return true;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync
    public String tag() {
        return b;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean isSyncDataEmpty(@NonNull EcgSyncData ecgSyncData) {
        EcgData ecgData = ecgSyncData.summary;
        return ecgData == null || ecgData.getTimestamp() <= 0 || TextUtils.isEmpty(ecgSyncData.zipData);
    }

    @Override // com.huami.watch.dataflow.sync.a
    public EcgSyncData parseSyncData(@NonNull String str) {
        try {
            return (EcgSyncData) new GsonBuilder().excludeFieldsWithModifiers(128, 8, 16).create().fromJson(str, EcgSyncData.class);
        } catch (Exception e) {
            Log.e(b, "ParseEcgDataErr", e, new Object[0]);
            return null;
        }
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean postToCloud(Context context, @NonNull EcgSyncData ecgSyncData) throws Throwable {
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        boolean zB = b(context, currentUid, ecgSyncData.zipData);
        if (zB) {
            zB = f(context, currentUid, ecgSyncData.summary.getTimestamp());
        }
        if (zB) {
            zB = c(context, ecgSyncData.summary);
        }
        if (zB) {
            zB = e(context, currentUid, ecgSyncData);
        }
        if (zB) {
            d(ecgSyncData);
        }
        return zB;
    }

    @Override // com.huami.watch.dataflow.sync.a
    @NonNull
    public SyncResult processResult(Context context, @NonNull EcgSyncData ecgSyncData) {
        SyncResult syncResult = new SyncResult();
        if (isSyncDataEmpty(ecgSyncData)) {
            syncResult.needContinue = false;
            syncResult.dataEmpty = true;
        } else {
            syncResult.needContinue = true;
            HashMap map = new HashMap(2);
            map.put("generatedTime", Long.valueOf(ecgSyncData.summary.getTimestamp()));
            syncResult.data = map;
        }
        return syncResult;
    }
}
