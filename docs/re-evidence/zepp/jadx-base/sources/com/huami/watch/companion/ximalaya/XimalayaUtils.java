package com.huami.watch.companion.ximalaya;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.util.Log;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.wearcalling.ModulesDef;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.ximalaya.ting.android.opensdk.model.track.CommonTrackList;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class XimalayaUtils {
    public static final String EDIT_SEARCH = "search_histories";
    public static final String EDIT_SEARCH_KEY = "search_history_key";
    public static final String SEARCH_ALBUM = "search_album_key";
    private static final int b = 5;
    private static DialogFragment c;
    private static final String a = "XimalayaUtils";
    public static final boolean DEBUG = Log.isLoggable(a, 3);

    public class a implements Transporter.DataSendResultCallback {
        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            Log.d(XimalayaUtils.a, "onResultBack ---- ");
            if (dataTransportResult.getResultCode() == 0) {
                Log.d(XimalayaUtils.a, "data send to watch success:");
                return;
            }
            Log.d(XimalayaUtils.a, "data send failed , code:" + dataTransportResult.getResultCode());
        }
    }

    private static void a() {
        DialogFragment dialogFragment = c;
        if (dialogFragment == null || !dialogFragment.isVisible()) {
            return;
        }
        c.dismiss();
    }

    private static void b(DataBundle dataBundle) {
        Transporter.get(CompanionApplication.getContext(), ModulesDef.ACTION_SYNC_XIMALAYA_SOUND_LIST).send(ModulesDef.ACTION_SYNC_XIMALAYA_SOUND_LIST, dataBundle, new a());
    }

    public static String getAlbumSize(int i, Context context) {
        return getAlbumSize(i, context, true);
    }

    public static String getAlbumTime(int i) {
        int i2 = i / 60;
        int i3 = i - (i2 * 60);
        StringBuffer stringBuffer = new StringBuffer();
        if (i2 < 10) {
            stringBuffer.append("0");
            stringBuffer.append(i2);
            stringBuffer.append(":");
        } else {
            stringBuffer.append(i2);
            stringBuffer.append(":");
        }
        if (i3 < 10) {
            stringBuffer.append("0");
            stringBuffer.append(i3);
        } else {
            stringBuffer.append(i3);
        }
        return stringBuffer.toString();
    }

    public static String getStringPlayCount(Long l) {
        float fLongValue = (l.longValue() * 1.0f) / 10000.0f;
        if (fLongValue > 1000.0f) {
            return String.valueOf(l.longValue() / 10000) + "万";
        }
        if (fLongValue > 100.0f) {
            return String.valueOf(Math.round(fLongValue * 10.0f) / 10.0f) + "万";
        }
        if (fLongValue <= 1.0f) {
            return String.valueOf(l);
        }
        return String.valueOf(Math.round(fLongValue * 100.0f) / 100.0f) + "万";
    }

    public static String getWatchSpace(Context context) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice == null || currentDevice.info().storageAvailable() < 0 || currentDevice.info().storageTotal() < 0) {
            return null;
        }
        return decimalFormat.format((currentDevice.info().storageAvailable() / 1024.0f) / 1024.0f) + " " + context.getString(R.string.storage_g);
    }

    public static float getWatchSpaceRest(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice == null || currentDevice.info().storageAvailable() < 0 || currentDevice.info().storageTotal() < 0) {
            return 0.0f;
        }
        return currentDevice.info().storageAvailable() / 1024.0f;
    }

    public static float getWatchSpaceTotal(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice == null || currentDevice.info().storageAvailable() < 0 || currentDevice.info().storageTotal() < 0) {
            return 0.0f;
        }
        return currentDevice.info().storageTotal() / 1024.0f;
    }

    public static void sendDownLoadCommand(List<String> list) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putStringArrayList(XimalayaConst.TRACK_URL_KEY, (ArrayList) list);
        b(dataBundle);
    }

    public static void showChanelDialog(Activity activity) {
        a();
        AlertDialog.Builder builder = new AlertDialog.Builder();
        builder.setMessage(activity.getString(R.string.connect_to_watch));
        builder.setPositiveBtn(activity.getString(R.string.dialog_confirm));
        builder.setNegativeBtn(activity.getString(R.string.dialog_cancel));
        c = builder.show(activity.getFragmentManager(), "NoWatchConnect");
    }

    public static String trackToJsonString(Track track) {
        if (track == null) {
            Log.e(a, "trackToJsonString track is null");
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(XimalayaConst.TRACK_TITLE, track.getTrackTitle());
            jSONObject.put(XimalayaConst.TRACK_TAGS, track.getTrackTags());
            jSONObject.put(XimalayaConst.TRACK_INTRO, track.getTrackIntro());
            jSONObject.put(XimalayaConst.COVER_URL_SMALL, track.getCoverUrlSmall());
            jSONObject.put(XimalayaConst.PLAY_URL64, track.getDownloadUrl());
            jSONObject.put(XimalayaConst.DOWNLOAD_URL, track.getDownloadUrl());
            jSONObject.put("duration", track.getDuration());
            jSONObject.put(XimalayaConst.RATE, "64");
            jSONObject.put(XimalayaConst.ARTIST, track.getAnnouncer().getNickname());
            jSONObject.put("aid", track.getAlbum().getAlbumId());
            jSONObject.put("trackId", track.getDataId());
            jSONObject.put("album", track.getAlbum().getAlbumTitle());
            jSONObject.put(XimalayaConst.KIND, track.getCategoryId());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static List<String> tracksToJsonList(CommonTrackList commonTrackList) {
        if (commonTrackList == null) {
            Log.d(a, "tracksToJsonList null track list!");
        }
        ArrayList arrayList = new ArrayList();
        List tracks = commonTrackList.getTracks();
        if (tracks != null) {
            Iterator it2 = tracks.iterator();
            while (it2.hasNext()) {
                String strTrackToJsonString = trackToJsonString((Track) it2.next());
                if (strTrackToJsonString != null) {
                    arrayList.add(strTrackToJsonString);
                }
            }
        }
        return arrayList;
    }

    public static String getAlbumSize(int i, Context context, boolean z) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (i < 0) {
            return null;
        }
        String str = decimalFormat.format((i / 1024.0f) / 1024.0f);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(context.getString(z ? R.string.ximalaya_storge_M : R.string.ximalaya_storge_MB));
        return sb.toString();
    }

    public static List<String> tracksToJsonList(Track track) {
        String strTrackToJsonString;
        if (track == null) {
            Log.d(a, "tracksToJsonList null track list!");
        }
        ArrayList arrayList = new ArrayList();
        if (track != null && (strTrackToJsonString = trackToJsonString(track)) != null) {
            arrayList.add(strTrackToJsonString);
        }
        return arrayList;
    }
}
