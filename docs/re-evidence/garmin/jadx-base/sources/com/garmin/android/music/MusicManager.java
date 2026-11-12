package com.garmin.android.music;

import android.content.ContentResolver;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes11.dex */
public class MusicManager {
    public static final int CAPABILITY_PLAYBACK_INFO = 2;
    public static final int CAPABILITY_PLAYER_NAME = 8;
    public static final int CAPABILITY_QUEUE_INFO = 16;
    public static final int CAPABILITY_REPEAT_MODE = 32;
    public static final int CAPABILITY_SHUFFLE_MODE = 64;
    public static final int CAPABILITY_TRACK_INFO = 1;
    public static final int CAPABILITY_VOLUME = 4;
    private static volatile MusicManager INSTANCE = null;
    static final String LOGTAG_PREFIX = "MC#";
    private static final String MUSIC_MGR_LOGTAG = "MC#MusicManager";
    private static final int PLAYER_NAME = 3;
    private static final int PLAYER_STATE = 1;
    private static final int PLAYER_VOLUME = 2;
    private static final int TRACK_DATA = 0;
    private int currentVolume;
    private EntityPlayerStateData entityPlayerStateData;
    private EntityTrackData entityTrackData;
    private int maxVolume;
    private String playerName;
    private final Map<String, DeviceMetaData> registeredDevices = new ConcurrentHashMap();
    private final Set<OnDeviceSubscribedListener> onDeviceSubscribedListeners = new CopyOnWriteArraySet();
    private final Set<OnMusicControlCommandReceivedListener> onMusicControlCommandReceivedListeners = new CopyOnWriteArraySet();

    public static class DeviceMetaData {
        final byte capabilities;
        final IMusicControlTransport transport;

        public DeviceMetaData(byte b14, IMusicControlTransport iMusicControlTransport) {
            this.capabilities = b14;
            this.transport = iMusicControlTransport;
        }
    }

    public interface OnDeviceSubscribedListener {
        void onDeviceSubscribed();
    }

    public interface OnMusicControlCommandReceivedListener {
        void onMusicControlCommandReceived(MusicControlCommand musicControlCommand);
    }

    private List<EntityUpdate> buildEntityUpdates(int i14, String str) {
        if (i14 == 0) {
            return deviceHasCapability(str, 1) ? EntityDataKt.toEntityUpdates(this.entityTrackData) : Collections.EMPTY_LIST;
        }
        if (i14 == 1) {
            return deviceHasCapability(str, 2) ? EntityDataKt.toEntityUpdates(this.entityPlayerStateData) : Collections.EMPTY_LIST;
        }
        if (i14 != 2) {
            if (i14 == 3 && deviceHasCapability(str, 8)) {
                return Collections.singletonList(new EntityUpdate(0, 0, 0, this.playerName));
            }
            return Collections.EMPTY_LIST;
        }
        if (!deviceHasCapability(str, 4)) {
            return Collections.EMPTY_LIST;
        }
        int i15 = this.maxVolume;
        return Collections.singletonList(new EntityUpdate(0, 2, 0, Float.toString(i15 != 0 ? this.currentVolume / i15 : 0.0f)));
    }

    private boolean deviceHasCapability(String str, int i14) {
        DeviceMetaData deviceMetaData = this.registeredDevices.get(str);
        return (deviceMetaData == null || (deviceMetaData.capabilities & i14) == 0) ? false : true;
    }

    public static MusicManager getInstance() {
        if (INSTANCE == null) {
            synchronized (MusicManager.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new MusicManager();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return INSTANCE;
    }

    private void sendAll() {
        for (String str : this.registeredDevices.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(buildEntityUpdates(3, str));
            arrayList.addAll(buildEntityUpdates(2, str));
            arrayList.addAll(buildEntityUpdates(0, str));
            arrayList.addAll(buildEntityUpdates(1, str));
            if (!arrayList.isEmpty()) {
                int i14 = gt2.c.f79010a;
                gt2.b.f79005a.i(MUSIC_MGR_LOGTAG).debug("sendAll (" + arrayList.size() + ")");
                sendEntityUpdatesToDevice(str, arrayList);
            }
        }
    }

    private void sendEntityUpdates(int i14) {
        for (String str : this.registeredDevices.keySet()) {
            List<EntityUpdate> listBuildEntityUpdates = buildEntityUpdates(i14, str);
            if (!listBuildEntityUpdates.isEmpty()) {
                sendEntityUpdatesToDevice(str, listBuildEntityUpdates);
            }
        }
    }

    private void sendEntityUpdatesToDevice(String str, List<EntityUpdate> list) {
        DeviceMetaData deviceMetaData = this.registeredDevices.get(str);
        if (deviceMetaData != null) {
            deviceMetaData.transport.sendEntityUpdate(str, list, deviceMetaData.capabilities);
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.i(MUSIC_MGR_LOGTAG).debug("sent " + list.size() + " update(s) to device " + str);
        }
    }

    public void clear() {
        this.playerName = null;
        this.currentVolume = 0;
        this.maxVolume = 0;
        this.entityTrackData = null;
        this.entityPlayerStateData = null;
        sendAll();
    }

    public void init(MediaController mediaController, String str, ContentResolver contentResolver) {
        this.playerName = str;
        this.entityTrackData = EntityDataKt.toEntityTrackData(mediaController.getMetadata(), contentResolver);
        this.entityPlayerStateData = EntityDataKt.toEntityPlayerStateData(mediaController.getPlaybackState());
        MediaController.PlaybackInfo playbackInfo = mediaController.getPlaybackInfo();
        this.currentVolume = playbackInfo != null ? playbackInfo.getCurrentVolume() : 0;
        this.maxVolume = playbackInfo != null ? playbackInfo.getMaxVolume() : 0;
        sendAll();
    }

    public void onMusicControlCommandReceived(MusicControlCommand musicControlCommand) {
        Iterator<OnMusicControlCommandReceivedListener> it = this.onMusicControlCommandReceivedListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onMusicControlCommandReceived(musicControlCommand);
            } catch (Throwable unused) {
            }
        }
    }

    public void registerOnDeviceSubscribedListener(OnDeviceSubscribedListener onDeviceSubscribedListener) {
        this.onDeviceSubscribedListeners.add(onDeviceSubscribedListener);
    }

    public void registerOnMusicControlCommandReceivedListener(OnMusicControlCommandReceivedListener onMusicControlCommandReceivedListener) {
        this.onMusicControlCommandReceivedListeners.add(onMusicControlCommandReceivedListener);
    }

    public void setCurrentAndMaxVolume(int i14, int i15) {
        if (this.currentVolume == i14 && this.maxVolume == i15) {
            return;
        }
        this.currentVolume = i14;
        this.maxVolume = i15;
        sendEntityUpdates(2);
    }

    public void setCurrentVolume(int i14) {
        setCurrentAndMaxVolume(i14, this.maxVolume);
    }

    public void setMetadata(MediaMetadata mediaMetadata, ContentResolver contentResolver) {
        EntityTrackData entityTrackData = EntityDataKt.toEntityTrackData(mediaMetadata, contentResolver);
        if (mediaMetadata != null) {
            ih2.b.b("MC#------ MetaData Details------------");
            StringBuilder sb3 = new StringBuilder();
            for (String str : mediaMetadata.keySet()) {
                sb3.append("MC# ");
                sb3.append(str);
                sb3.append(" :: ");
                str.getClass();
                switch (str) {
                    case "android.media.metadata.ALBUM_ART":
                    case "android.media.metadata.DISPLAY_ICON":
                    case "android.media.metadata.ART":
                        sb3.append(mediaMetadata.getBitmap(str));
                        break;
                    case "android.media.metadata.RATING":
                        sb3.append(mediaMetadata.getRating(str));
                        break;
                    case "android.media.metadata.DURATION":
                        sb3.append(mediaMetadata.getLong(str));
                        break;
                    default:
                        sb3.append(mediaMetadata.getString(str));
                        break;
                }
                sb3.append("\n");
            }
            ih2.b.b(LOGTAG_PREFIX + ((Object) sb3));
            ih2.b.b("MC#-----------------------------------");
        }
        if (entityTrackData.equals(this.entityTrackData)) {
            return;
        }
        this.entityTrackData = entityTrackData;
        sendEntityUpdates(0);
    }

    public void setPlaybackState(PlaybackState playbackState) {
        EntityPlayerStateData entityPlayerStateData = EntityDataKt.toEntityPlayerStateData(playbackState);
        if (entityPlayerStateData.equals(this.entityPlayerStateData)) {
            return;
        }
        this.entityPlayerStateData = entityPlayerStateData;
        sendEntityUpdates(1);
    }

    public void subscribe(String str, byte b14, IMusicControlTransport iMusicControlTransport) {
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.i(MUSIC_MGR_LOGTAG).debug("subscribe -> device MAC address: " + str + ", capabilities: " + ((int) b14));
        this.registeredDevices.put(str, new DeviceMetaData(b14, iMusicControlTransport));
        sendAll();
        Iterator<OnDeviceSubscribedListener> it = this.onDeviceSubscribedListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onDeviceSubscribed();
            } catch (Throwable unused) {
            }
        }
    }

    public void unregisterOnDeviceSubscribedListener(OnDeviceSubscribedListener onDeviceSubscribedListener) {
        this.onDeviceSubscribedListeners.remove(onDeviceSubscribedListener);
    }

    public void unregisterOnMusicControlCommandReceivedListener(OnMusicControlCommandReceivedListener onMusicControlCommandReceivedListener) {
        this.onMusicControlCommandReceivedListeners.remove(onMusicControlCommandReceivedListener);
    }

    public void unsubscribe(String str) {
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.i(MUSIC_MGR_LOGTAG).debug("unsubscribe -> device MAC address: " + str);
        this.registeredDevices.remove(str);
    }

    public void init(MediaController mediaController, String str) {
        init(mediaController, str, null);
    }

    public void setMetadata(MediaMetadata mediaMetadata) {
        setMetadata(mediaMetadata, null);
    }
}
