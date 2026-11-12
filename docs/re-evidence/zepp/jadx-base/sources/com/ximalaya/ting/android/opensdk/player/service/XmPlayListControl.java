package com.ximalaya.ting.android.opensdk.player.service;

import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.live.radio.Radio;
import com.ximalaya.ting.android.opensdk.model.track.CommonTrackList;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.player.constants.PlayerConstants;
import com.ximalaya.ting.android.opensdk.util.BaseUtil;
import com.ximalaya.ting.android.opensdk.util.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class XmPlayListControl {
    public static final int PLAY_SOURCE_NONE = 1;
    public static final int PLAY_SOURCE_RADIO = 3;
    public static final int PLAY_SOURCE_TRACK = 2;
    public static final String POSITIVE_SEQ = "positive_seq";
    private static final String TAG = "XmPlayListControl";
    private PlayableModel mCurrModel;
    private int mCurrSize;
    private IXmDataCallback mDataCallback;
    private PlayableModel mLastModel;
    private int mNextPageId;
    private int mPageSize;
    private Map<String, String> mParam;
    private int mPrePageId;
    private int mTotalPage;
    private int mPlaySource = 1;
    private List<Track> mPlayList = new ArrayList();
    private volatile int mCurrIndex = -1;
    private int mLastIndex = -1;
    private PlayMode mPlayMode = PlayMode.PLAY_MODEL_LIST;
    private boolean mLoading = false;
    private boolean isAsc = true;
    private boolean mPositiveSeq = true;
    private CommonRequest mXimalaya = CommonRequest.getInstanse();

    /* JADX INFO: renamed from: com.ximalaya.ting.android.opensdk.player.service.XmPlayListControl$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$ximalaya$ting$android$opensdk$player$service$XmPlayListControl$PlayMode;

        static {
            int[] iArr = new int[PlayMode.values().length];
            $SwitchMap$com$ximalaya$ting$android$opensdk$player$service$XmPlayListControl$PlayMode = iArr;
            try {
                iArr[PlayMode.PLAY_MODEL_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ximalaya$ting$android$opensdk$player$service$XmPlayListControl$PlayMode[PlayMode.PLAY_MODEL_LIST_LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ximalaya$ting$android$opensdk$player$service$XmPlayListControl$PlayMode[PlayMode.PLAY_MODEL_SINGLE_LOOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ximalaya$ting$android$opensdk$player$service$XmPlayListControl$PlayMode[PlayMode.PLAY_MODEL_RANDOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ximalaya$ting$android$opensdk$player$service$XmPlayListControl$PlayMode[PlayMode.PLAY_MODEL_SINGLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum PlayMode {
        PLAY_MODEL_SINGLE,
        PLAY_MODEL_SINGLE_LOOP,
        PLAY_MODEL_LIST,
        PLAY_MODEL_LIST_LOOP,
        PLAY_MODEL_RANDOM;

        public static PlayMode getIndex(int i) {
            PlayMode playMode = PLAY_MODEL_SINGLE;
            if (i == playMode.ordinal()) {
                return playMode;
            }
            PlayMode playMode2 = PLAY_MODEL_SINGLE_LOOP;
            if (i == playMode2.ordinal()) {
                return playMode2;
            }
            PlayMode playMode3 = PLAY_MODEL_LIST;
            if (i == playMode3.ordinal()) {
                return playMode3;
            }
            PlayMode playMode4 = PLAY_MODEL_LIST_LOOP;
            if (i == playMode4.ordinal()) {
                return playMode4;
            }
            PlayMode playMode5 = PLAY_MODEL_RANDOM;
            return i == playMode5.ordinal() ? playMode5 : playMode3;
        }
    }

    public static /* synthetic */ int access$410(XmPlayListControl xmPlayListControl) {
        int i = xmPlayListControl.mPrePageId;
        xmPlayListControl.mPrePageId = i - 1;
        return i;
    }

    public static /* synthetic */ int access$908(XmPlayListControl xmPlayListControl) {
        int i = xmPlayListControl.mNextPageId;
        xmPlayListControl.mNextPageId = i + 1;
        return i;
    }

    private boolean checkListType(Map<String, String> map) {
        if (map == null || this.mParam == null) {
            return false;
        }
        boolean zEquals = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            zEquals &= entry.getValue().equals(this.mParam.get(entry.getKey()));
        }
        return zEquals;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dataCallbackOnError(int i, String str, boolean z) {
        IXmDataCallback iXmDataCallback = this.mDataCallback;
        if (iXmDataCallback != null) {
            try {
                iXmDataCallback.onError(i, str, z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private int getRadioNextIndex() {
        return -1;
    }

    private int getRadioPreIndex() {
        return -1;
    }

    private int getTrackNextIndex(boolean z) {
        int i;
        PlayMode playMode = this.mPlayMode;
        if (z && playMode == PlayMode.PLAY_MODEL_SINGLE_LOOP) {
            playMode = PlayMode.PLAY_MODEL_LIST;
        }
        int i2 = AnonymousClass3.$SwitchMap$com$ximalaya$ting$android$opensdk$player$service$XmPlayListControl$PlayMode[playMode.ordinal()];
        if (i2 == 1) {
            i = this.mCurrIndex + 1;
            if (needLoadNextPage(i)) {
                loadNextPageSync();
            }
            if (i >= this.mCurrSize) {
                return -1;
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    return this.mCurrIndex;
                }
                if (i2 != 4) {
                    return -1;
                }
                if (this.mCurrSize == 1) {
                    return 1;
                }
                return (int) (Math.random() * ((double) this.mCurrSize));
            }
            i = this.mCurrIndex + 1;
            if (needLoadNextPage(i)) {
                loadNextPageSync();
            }
            if (i >= this.mCurrSize) {
                return 0;
            }
        }
        return i;
    }

    private int getTrackPreIndex() {
        int i;
        PlayMode playMode = this.mPlayMode;
        if (playMode == PlayMode.PLAY_MODEL_SINGLE_LOOP) {
            playMode = PlayMode.PLAY_MODEL_LIST;
        }
        int i2 = AnonymousClass3.$SwitchMap$com$ximalaya$ting$android$opensdk$player$service$XmPlayListControl$PlayMode[playMode.ordinal()];
        if (i2 == 1) {
            i = this.mCurrIndex - 1;
            if (needLoadPrePage(i)) {
                loadPrePageSync();
            }
            if (i < 0) {
                return -1;
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    return this.mCurrIndex;
                }
                if (i2 != 4) {
                    return -1;
                }
                if (this.mCurrSize == 1) {
                    return 1;
                }
                return (int) (Math.random() * ((double) this.mCurrSize));
            }
            i = this.mCurrIndex - 1;
            if (needLoadPrePage(i)) {
                loadPrePageSync();
            }
            if (i < 0) {
                i = this.mCurrSize - 1;
            }
        }
        return i;
    }

    private void loadNextPageSync() {
        Map<String, String> map;
        Logger.i(TAG, "loadNextPageSync");
        if (this.mLoading || (map = this.mParam) == null) {
            dataCallbackOnError(400, "加载失败", this.mPositiveSeq);
            return;
        }
        this.mLoading = true;
        map.put(DTransferConstants.PAGE, "" + (this.mNextPageId + 1));
        if (!this.mParam.containsKey("count")) {
            this.mParam.put("count", "" + this.mXimalaya.getDefaultPagesize());
        }
        CommonRequest.getTrackList(this.mParam, new IDataCallBack<CommonTrackList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayListControl.2
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onError(int i, String str) {
                Logger.i(XmPlayListControl.TAG, "CommonRequest.getTrackList 获取播放器下一页数据 onError " + i + ", " + str);
                XmPlayListControl.this.mLoading = false;
                XmPlayListControl xmPlayListControl = XmPlayListControl.this;
                xmPlayListControl.dataCallbackOnError(i, str, xmPlayListControl.mPositiveSeq);
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onSuccess(CommonTrackList commonTrackList) {
                XmPlayListControl.this.mLoading = false;
                Logger.i(XmPlayListControl.TAG, "CommonRequest.getTrackList 获取播放器下一页数据");
                if (commonTrackList == null) {
                    XmPlayListControl xmPlayListControl = XmPlayListControl.this;
                    xmPlayListControl.dataCallbackOnError(400, "加载失败", xmPlayListControl.mPositiveSeq);
                    return;
                }
                if (XmPlayListControl.this.mTotalPage == 0 || commonTrackList.getTotalPage() != 0) {
                    XmPlayListControl.this.mTotalPage = commonTrackList.getTotalPage();
                }
                List<Track> tracks = commonTrackList.getTracks();
                if (tracks == null || tracks.size() == 0) {
                    XmPlayListControl xmPlayListControl2 = XmPlayListControl.this;
                    xmPlayListControl2.dataCallbackOnError(400, "加载失败", xmPlayListControl2.mPositiveSeq);
                    return;
                }
                XmPlayListControl.access$908(XmPlayListControl.this);
                synchronized (XmPlayListControl.this.mPlayList) {
                    if (XmPlayListControl.this.mPositiveSeq) {
                        XmPlayListControl.this.mPlayList.addAll(tracks);
                    } else {
                        Collections.reverse(tracks);
                        XmPlayListControl.this.mPlayList.addAll(0, tracks);
                        XmPlayListControl.this.mCurrIndex += tracks.size();
                    }
                    XmPlayListControl xmPlayListControl3 = XmPlayListControl.this;
                    xmPlayListControl3.mCurrSize = xmPlayListControl3.mPlayList.size();
                }
                boolean zHasNextPage = XmPlayListControl.this.hasNextPage();
                if (XmPlayListControl.this.mDataCallback != null) {
                    try {
                        XmPlayListControl.this.mDataCallback.onDataReady(tracks, zHasNextPage, XmPlayListControl.this.mPositiveSeq);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        XmPlayListControl xmPlayListControl4 = XmPlayListControl.this;
                        xmPlayListControl4.dataCallbackOnError(400, "加载失败", xmPlayListControl4.mPositiveSeq);
                    }
                }
            }
        });
    }

    private void loadPrePageSync() {
        Map<String, String> map;
        Logger.i(TAG, "loadPrePageSync");
        if (this.mLoading || (map = this.mParam) == null) {
            dataCallbackOnError(400, "加载失败", true ^ this.mPositiveSeq);
            return;
        }
        this.mLoading = true;
        map.put(DTransferConstants.PAGE, "" + this.mPrePageId);
        if (!this.mParam.containsKey("count")) {
            this.mParam.put("count", "" + this.mXimalaya.getDefaultPagesize());
        }
        CommonRequest.getTrackList(this.mParam, new IDataCallBack<CommonTrackList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayListControl.1
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onError(int i, String str) {
                Logger.i(XmPlayListControl.TAG, "CommonRequest.getTrackList 获取播放器下一页数据 onError " + i + ", " + str);
                XmPlayListControl.this.mLoading = false;
                XmPlayListControl xmPlayListControl = XmPlayListControl.this;
                xmPlayListControl.dataCallbackOnError(i, str, xmPlayListControl.mPositiveSeq ^ true);
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onSuccess(CommonTrackList commonTrackList) {
                Logger.i(XmPlayListControl.TAG, "CommonRequest.getTrackList 获取播放器下一页数据");
                XmPlayListControl.this.mLoading = false;
                if (commonTrackList == null) {
                    XmPlayListControl xmPlayListControl = XmPlayListControl.this;
                    xmPlayListControl.dataCallbackOnError(400, "加载失败", true ^ xmPlayListControl.mPositiveSeq);
                    return;
                }
                XmPlayListControl.this.mTotalPage = commonTrackList.getTotalPage();
                List<Track> tracks = commonTrackList.getTracks();
                if (tracks == null || tracks.size() == 0) {
                    XmPlayListControl xmPlayListControl2 = XmPlayListControl.this;
                    xmPlayListControl2.dataCallbackOnError(400, "加载失败", true ^ xmPlayListControl2.mPositiveSeq);
                    return;
                }
                XmPlayListControl.access$410(XmPlayListControl.this);
                synchronized (XmPlayListControl.this.mPlayList) {
                    if (XmPlayListControl.this.mPositiveSeq) {
                        XmPlayListControl.this.mPlayList.addAll(0, tracks);
                        XmPlayListControl.this.mCurrIndex += tracks.size();
                    } else {
                        Collections.reverse(tracks);
                        XmPlayListControl.this.mPlayList.addAll(tracks);
                    }
                }
                XmPlayListControl xmPlayListControl3 = XmPlayListControl.this;
                xmPlayListControl3.mCurrSize = xmPlayListControl3.mPlayList.size();
                boolean zHasPrePage = XmPlayListControl.this.hasPrePage();
                if (XmPlayListControl.this.mDataCallback != null) {
                    try {
                        XmPlayListControl.this.mDataCallback.onDataReady(tracks, zHasPrePage, XmPlayListControl.this.mPositiveSeq ? false : true);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        XmPlayListControl xmPlayListControl4 = XmPlayListControl.this;
                        xmPlayListControl4.dataCallbackOnError(400, "加载失败", xmPlayListControl4.mPositiveSeq);
                    }
                }
            }
        });
    }

    private boolean needLoadNextPage(int i) {
        if (this.mParam == null || PlayerConstants.PRE_LOAD_INDEX + i < this.mCurrSize || !hasNextPage()) {
            return false;
        }
        Logger.i(TAG, "needLoadNextPage currPage:" + this.mNextPageId + ", currPageSize:" + this.mPageSize + ", next:" + i);
        return true;
    }

    private boolean needLoadPrePage(int i) {
        if (this.mParam == null || i - PlayerConstants.PRE_LOAD_INDEX > 0 || !hasPrePage()) {
            return false;
        }
        Logger.i(TAG, "needLoadNextPage currPage:" + this.mNextPageId + ", currPageSize:" + this.mPageSize + ", next:" + i);
        return true;
    }

    public void addPlayList(List<Track> list) {
        synchronized (this.mPlayList) {
            if (this.mPlayList == null) {
                this.mPlayList = new ArrayList();
            }
            this.mPlayList.addAll(list);
            this.mCurrSize = this.mPlayList.size();
            if (this.mPlayList.contains(this.mCurrModel)) {
                this.mCurrIndex = this.mPlayList.indexOf(this.mCurrModel);
            }
        }
    }

    public int getCurrIndex() {
        return this.mCurrIndex;
    }

    public int getCurrListSize() {
        return this.mCurrSize;
    }

    public PlayableModel getCurrentPlayableModel() {
        return this.mCurrModel;
    }

    public int getLastIndex() {
        return this.mLastIndex;
    }

    public Radio getLastRadio() {
        PlayableModel playableModel = this.mLastModel;
        if (playableModel instanceof Radio) {
            return (Radio) playableModel;
        }
        return null;
    }

    public int getNextIndex(boolean z) {
        int i = this.mPlaySource;
        if (i != 3 && i == 2) {
            return getTrackNextIndex(z);
        }
        return -1;
    }

    public void getNextPlayList(boolean z) {
        if (!this.mPositiveSeq && !z) {
            getPrePlayList(true);
            return;
        }
        if (hasNextPage()) {
            if (this.mParam == null || this.mLoading) {
                dataCallbackOnError(400, "加载失败", this.mPositiveSeq);
                return;
            } else {
                loadNextPageSync();
                return;
            }
        }
        IXmDataCallback iXmDataCallback = this.mDataCallback;
        if (iXmDataCallback != null) {
            try {
                iXmDataCallback.onDataReady(null, false, this.mPositiveSeq);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public Track getNextPlayTrack() {
        try {
            if (this.mCurrIndex < 0 || this.mCurrIndex + 1 >= this.mPlayList.size()) {
                return null;
            }
            return this.mPlayList.get(this.mCurrIndex + 1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map<String, String> getParams() {
        if (this.mParam == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.putAll(this.mParam);
        map.put(DTransferConstants.PRE_PAGE, this.mPrePageId + "");
        map.put(DTransferConstants.PAGE, this.mNextPageId + "");
        map.put(POSITIVE_SEQ, this.mPositiveSeq + "");
        map.put(DTransferConstants.TOTAL_PAGE, this.mTotalPage + "");
        map.put(DTransferConstants.LOCAL_IS_ASC, this.isAsc + "");
        return map;
    }

    public List<Track> getPlayList() {
        return this.mPlayList;
    }

    public boolean getPlayListOrder() {
        return this.isAsc;
    }

    public PlayMode getPlayMode() {
        return this.mPlayMode;
    }

    public int getPlaySource() {
        if (getCurrentPlayableModel() == null) {
            return 1;
        }
        Track track = (Track) getCurrentPlayableModel();
        if (TextUtils.isEmpty(track.getKind())) {
            return 1;
        }
        if ("radio".endsWith(track.getKind())) {
            this.mPlaySource = 3;
        } else if ("track".endsWith(track.getKind())) {
            this.mPlaySource = 2;
        } else if ("schedule".endsWith(track.getKind())) {
            String str = track.getStartTime() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + track.getEndTime();
            if (BaseUtil.isInTime(str) == 0) {
                this.mPlaySource = 3;
            } else if (BaseUtil.isInTime(str) == -1) {
                this.mPlaySource = 2;
            }
        }
        return this.mPlaySource;
    }

    public PlayableModel getPlayableModel(int i) {
        List<Track> list = this.mPlayList;
        if (list == null || list.size() <= 0 || i < 0 || i >= this.mPlayList.size()) {
            return null;
        }
        return this.mPlayList.get(i);
    }

    public int getPreIndex() {
        return getTrackPreIndex();
    }

    public void getPrePlayList(boolean z) {
        boolean z2 = true;
        if (!this.mPositiveSeq && !z) {
            getNextPlayList(true);
            return;
        }
        if (hasPrePage()) {
            if (this.mParam == null || this.mLoading) {
                dataCallbackOnError(400, "加载失败", !this.mPositiveSeq);
                return;
            } else {
                loadPrePageSync();
                return;
            }
        }
        IXmDataCallback iXmDataCallback = this.mDataCallback;
        if (iXmDataCallback != null) {
            try {
                if (this.mPositiveSeq) {
                    z2 = false;
                }
                iXmDataCallback.onDataReady(null, false, z2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public Radio getRadio() {
        PlayableModel playableModel = this.mCurrModel;
        if (playableModel instanceof Radio) {
            return (Radio) playableModel;
        }
        return null;
    }

    public boolean hasNextPage() {
        int i = this.mTotalPage;
        return i > 0 && this.mNextPageId < i;
    }

    public boolean hasPrePage() {
        int i;
        int i2 = this.mTotalPage;
        return i2 > 0 && (i = this.mPrePageId) < i2 && i > 0;
    }

    public void insertPlayListHead(List<Track> list) {
        synchronized (this.mPlayList) {
            if (this.mPlayList == null) {
                this.mPlayList = new ArrayList();
            }
            this.mPlayList.addAll(0, list);
            this.mCurrSize = this.mPlayList.size();
            if (this.mPlayList.contains(this.mCurrModel)) {
                this.mCurrIndex = this.mPlayList.indexOf(this.mCurrModel);
            }
        }
    }

    public boolean isLoading() {
        return this.mLoading;
    }

    public synchronized boolean permutePlayList() {
        this.isAsc = !this.isAsc;
        this.mPositiveSeq = this.mPositiveSeq ? false : true;
        List<Track> list = this.mPlayList;
        if (list != null && list.size() > 0) {
            Collections.reverse(this.mPlayList);
            PlayableModel playableModel = this.mCurrModel;
            if (playableModel != null) {
                this.mCurrIndex = this.mPlayList.indexOf(playableModel);
            }
            PlayableModel playableModel2 = this.mLastModel;
            if (playableModel2 != null) {
                this.mLastIndex = this.mPlayList.indexOf(playableModel2);
            }
        }
        return true;
    }

    public void removeListByIndex(int i) {
        List<Track> list = this.mPlayList;
        if (list == null || list.size() < i) {
            return;
        }
        this.mPlayList.remove(i);
        int i2 = AnonymousClass3.$SwitchMap$com$ximalaya$ting$android$opensdk$player$service$XmPlayListControl$PlayMode[this.mPlayMode.ordinal()];
        if ((i2 == 1 || i2 == 2) && i <= this.mCurrIndex) {
            this.mCurrIndex--;
        }
        this.mCurrSize--;
    }

    public void resetPlayList() {
        synchronized (this.mPlayList) {
            this.mParam = null;
            this.mPlayList.clear();
            this.mNextPageId = 0;
            this.mPrePageId = 0;
            this.mPageSize = 0;
            this.mTotalPage = 0;
            this.mCurrIndex = -1;
            this.mCurrSize = 0;
            this.mLastIndex = -1;
            this.mCurrModel = null;
            this.mLastModel = null;
            this.mPositiveSeq = true;
        }
    }

    public void setCurrIndex(int i) {
        if (i != this.mCurrIndex) {
            this.mLastIndex = this.mCurrIndex;
            this.mCurrIndex = i;
            this.mLastModel = this.mCurrModel;
        }
        this.mCurrModel = getPlayableModel(this.mCurrIndex);
        if (needLoadNextPage(i + 1)) {
            loadNextPageSync();
        }
        if (needLoadPrePage(i - 1)) {
            loadPrePageSync();
        }
    }

    public void setPlayList(Map<String, String> map, List<Track> list) {
        if (map != null) {
            if (map.containsKey(DTransferConstants.LOCAL_IS_ASC)) {
                this.isAsc = Boolean.parseBoolean(map.remove(DTransferConstants.LOCAL_IS_ASC));
            } else {
                if (map.containsKey("asc")) {
                    this.isAsc = Boolean.parseBoolean(map.get("asc"));
                }
                if (map.containsKey("isAsc")) {
                    this.isAsc = Boolean.parseBoolean(map.get("isAsc"));
                }
            }
            if (!map.containsKey(DTransferConstants.TRACK_BASE_URL)) {
                map = null;
            }
        }
        this.mPlaySource = 2;
        resetPlayList();
        synchronized (this.mPlayList) {
            this.mTotalPage = 0;
            this.mParam = map;
            if (map != null) {
                if (map.containsKey("trackId")) {
                    map.remove("trackId");
                }
                String strRemove = this.mParam.remove(POSITIVE_SEQ);
                if (!TextUtils.isEmpty(strRemove)) {
                    this.mPositiveSeq = Boolean.valueOf(strRemove).booleanValue();
                }
                if (!this.mParam.containsKey(DTransferConstants.TOTAL_PAGE) || this.mParam.get(DTransferConstants.TOTAL_PAGE) == null) {
                    this.mTotalPage = 0;
                } else {
                    this.mTotalPage = Integer.valueOf(this.mParam.remove(DTransferConstants.TOTAL_PAGE)).intValue() + 1;
                }
                if (!this.mParam.containsKey("count") || this.mParam.get("count") == null) {
                    this.mPageSize = 0;
                } else {
                    this.mPageSize = Integer.valueOf(this.mParam.get("count")).intValue();
                }
                if (this.mPageSize <= 0) {
                    this.mPageSize = this.mXimalaya.getDefaultPagesize();
                }
                if (!this.mParam.containsKey(DTransferConstants.PAGE) || this.mParam.get(DTransferConstants.PAGE) == null) {
                    this.mNextPageId = 0;
                } else {
                    this.mNextPageId = Integer.valueOf(this.mParam.get(DTransferConstants.PAGE)).intValue();
                }
                if (this.mNextPageId <= 0) {
                    this.mNextPageId = list.size() / this.mPageSize;
                }
                if (!this.mParam.containsKey(DTransferConstants.PRE_PAGE) || this.mParam.get(DTransferConstants.PRE_PAGE) == null) {
                    int i = this.mNextPageId;
                    if (i > 0) {
                        this.mPrePageId = i - 1;
                    } else {
                        this.mPrePageId = 0;
                    }
                } else {
                    int iIntValue = Integer.valueOf(this.mParam.get(DTransferConstants.PRE_PAGE)).intValue();
                    this.mPrePageId = iIntValue;
                    if (iIntValue < 0) {
                        this.mPrePageId = 0;
                    }
                }
            } else {
                this.mPageSize = 0;
                this.mNextPageId = 0;
                this.mPrePageId = 0;
            }
            this.mPlayList.clear();
            this.mPlayList.addAll(list);
            this.mCurrSize = this.mPlayList.size();
            if (this.mPlayList.contains(this.mCurrModel)) {
                this.mCurrIndex = this.mPlayList.indexOf(this.mCurrModel);
            } else {
                this.mCurrIndex = -1;
            }
        }
    }

    public void setPlayListChangeListener(IXmDataCallback iXmDataCallback) {
        this.mDataCallback = iXmDataCallback;
    }

    public PlayMode setPlayMode(PlayMode playMode) {
        this.mPlayMode = playMode;
        return playMode;
    }

    public void setRadio(Radio radio) {
        if (radio == null) {
            return;
        }
        if (this.mPlaySource != 3) {
            resetPlayList();
            this.mPlaySource = 3;
        }
        if (radio.equals(this.mCurrModel)) {
            return;
        }
        this.mLastModel = this.mCurrModel;
        this.mCurrModel = radio;
    }

    public void updateTrackInPlayList(int i, Track track) {
        getPlayList().set(i, track);
        PlayableModel playableModel = this.mCurrModel;
        if (playableModel == null || track == null || playableModel.getDataId() != track.getDataId()) {
            return;
        }
        this.mCurrModel = track;
    }
}
