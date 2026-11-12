/***********************************************************************
 * Module:  IXmPlayer.aidl
 * Author:  chadwii
 * Purpose: Defines the Interface IXmPlayer
 ***********************************************************************/
package com.ximalaya.ting.android.opensdk.player.service;

import com.ximalaya.ting.android.opensdk.player.service.IXmDataCallback;
import com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher;
import com.ximalaya.ting.android.opensdk.player.service.IXmAdsEventDispatcher;
import com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher;
import com.ximalaya.ting.android.opensdk.player.service.IXmPlayHistoryListener;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.history.HistoryModel;
import com.ximalaya.ting.android.opensdk.model.live.radio.Radio;
import com.ximalaya.ting.android.opensdk.model.live.program.Program;
import com.ximalaya.ting.android.opensdk.model.live.schedule.Schedule;
import com.ximalaya.ting.android.opensdk.model.category.CategoryModel;
import com.ximalaya.ting.android.opensdk.player.service.IXmCustomDataCallBack;
import com.ximalaya.ting.android.opensdk.player.service.IXmMainDataSupportDataCallback;
import com.ximalaya.ting.android.opensdk.model.xdcs.CdnConfigModel;
import com.ximalaya.ting.android.opensdk.model.statistic.RecordModel;
import  com.ximalaya.ting.android.opensdk.player.service.IXmTokenInvalidForSDKCallBack;
import com.ximalaya.ting.android.opensdk.model.token.AccessToken;
import com.ximalaya.ting.android.opensdk.httputil.Config;


interface IXmPlayer {
   
   //waring ：请不要在以下加入或者减少任何方法
   //*******************************************播放器所用，请不要增加和删除任何以下方法***************************************
   // 此方法已过时 请使用另外一个setProxyNew
   void setProxy(String host, int port,String authorization ,in Map header);
   boolean playPre();
   boolean playNext();
   boolean play(int index);
   boolean setPlayIndex(int index);
   boolean startPlay();
   boolean pausePlay();
   boolean stopPlay();
   boolean seekTo(int ms);
   boolean isOnlineSource();
   boolean hasPreSound();
   boolean hasNextSound();
   int getPlayerStatus();
   int getCurrIndex();
   int getDuration();
   int getPlayCurrPosition();
   boolean isPlaying();
   boolean isAdsActive();
   void updateTrackDownloadUrlInPlayList(inout Track track);
   boolean updateTrackInPlayList(inout Track track);
   Track getTrack(int index);
   Radio getRadio();
   int getPlaySourceType();
   void setPlayMode(String mode);
   String getPlayMode();
   void setPageSize(int pageSize);
   void setPlayList(in Map param, in List<Track> list);
   // 因为IPC通信机制限制只能传递1M所以setPlayList暂时只能传递100个超过的话就将其拆分循环插入 ,执行这个函数之前一定要先执行setPlayList
   void addPlayList(in List<Track> list);
   boolean playRadio(in Radio radio);
   // position表示第几次请求 ,position从0开始计算
   List<Track> getPlayList(in int position);
   Map getParam();
   int getPlayListSize();
   void clearPlayCache();
   void setNotification(int id, in Notification notification);
   void setAppSecret(String secret);
   void registePlayerListener(IXmPlayerEventDispatcher l);
   void unregistePlayerListener(IXmPlayerEventDispatcher l);
   void registeAdsListener(IXmAdsEventDispatcher l);
   void unregisteAdsListener(IXmAdsEventDispatcher l);
   void registeCommonBusinessListener(IXmCommonBusinessDispatcher l);
   void getNextPlayList();
   void getPrePlayList();
   void setPlayListChangeListener(IXmDataCallback l);
   boolean permutePlayList();
   boolean getPlayListOrder();
   String getCurPlayUrl(); 
   //*******************************************播放器所用，请不要增加和删除任何以上方法***************************************
   
   
   //*******************************************第三方所用 begin***************************************
   void init(String appsecret, String appkey, String packid);
   void registeCustomDataCallBack(IXmCustomDataCallBack l);
   void unregisteCustomDataCallBack(IXmCustomDataCallBack l);
   void setPlayModel(String modelName ,int categoryId ,long key);
   void getSourseLists(String query,int categoryId, int page ,int count ,int type ,long key);
   void browseAlbums(long albumId ,int page ,int count ,long key);
   void setPlayByTrack(String track ,long key);	
   void setPlayByAlbumTracks(String CommonTrackList, int position ,long key);
   void setCategoryId(int categoryId ,long key);
   void getCategoryModelList(long key);
   void getHotContent(boolean isTrack ,int page ,int count ,long key);
   void getTrackListByLastTrack(long albumId ,long trackId ,int pageCount ,long key);
   // 主app的aidl通信
   void registeMainDataSupportCallBack(IXmMainDataSupportDataCallback l);
   void unregisteMainDataSupportCallBack(IXmMainDataSupportDataCallback l);
   void getUserInfo(long key);
   void getMyCollect(int page, int count, long key);
   void getAttentionAlbum(int size, String timeLine, long key);
   void getAlbumInfo(long albumId ,int page ,int count,String fromWhere,long randomkey);
   void getRank(String type ,String key ,int page,long randomkey);
   void getMainHotContent(int type ,int page ,int count,long randomkey);
   void getNewRank(int typeId, int pageId, int pageSize, long randomkey);
   int getDefultPageSize();
   
   // speechcontroler 的方法
   void getAlbumByCategoryId(long categoryid, int page, int count ,long key);


   
   // MainDataSupport 智能硬件 获得硬件插件的配置信息
   void getParseDeviceInfo(long randomkey);
   void setDLNAState(boolean isDLNAState);
   boolean isDLNAState();
   void needContinuePlay(boolean flag);

   // MainDataSupport 猜你喜欢 Get suggested albums
   void getSuggestAlbums(int page , int count ,boolean isLogin,long randomkey);
   // 精品听单 (categoryId 为小于0表示获取全部分类的精品听单)
   void getSpecialListenList(int page ,int count ,int categoryid ,long randomkey);
   // 听单详情
   void getSubjectDetail(int page ,int count ,long subjectId ,long randomkey);
    // 订阅专辑(album 是序列化之后的对象)
   void subscribeAlbum(String album , boolean isSubscribed ,long randomkey);
    // 根据专辑和声音id 获得所在页的声音列表
   void getTrackListByTrackIdAtAlbum(long trackId ,long albumId ,boolean isAsc ,long randomKey);
   // 根据声音ID 获得相关推荐的专辑
   void getRecommendAlbumListByTrackId(long trackId ,long randomKey);
    // 根据专辑ID 获得相关推荐的专辑
    void getRecommendAlbumListByAlbumId(long albumId ,long randomKey);
    // 获取直播省（直辖市）列表
    void getProvinces(long randomKey);
    // 获得电台列表
    void getRadioList(int radioType ,long provinceCode ,int pageSize ,int pageId ,long randomKey);
    // 获取某电台某日节目单
    void getRadioSchedules(String radio ,long randomKey);
    // 获取分类列表
    void getCategoriesList(int page,int count, long randomKey);
     // 根据分类id和tag获取专辑列表
    void getAlbumByCategoryIdAndTag(long categoryId,int keywordId, int page, int count ,long key);
    void getTags(long categoryId,long key);
    void getTrackDetailInfo(long trackId,long key);
    Track getTrackInfoSync(long trackId);
    // 设置Token失效的回调 开放平台使用
    void setTokenInvalidForSDK(IXmTokenInvalidForSDKCallBack callBack);
    // 设置Token到播放器 开放平台使用
    void setTokenToPlayForSDK(inout AccessToken accessToken);
   //*******************************************第三方所用 end***************************************


   //*******************************************请在以下加入非第三方使用的aidl接口***************************************

   void setRecordModel(inout RecordModel model);
   void setVolume(float leftVolume, float rightVolume);
   void setPlayStatisticClassName(String className);
   void setAdsDataHandlerClassName(String className);
   void setPlayCdnConfigureModel(in CdnConfigModel cdnConfigure);
   void resetPlayList();
   void removeListByIndex(int index);
   String getHistoryPos(String historyIds);
   void setHistoryPosById(long historyId,int hisPosition);
   String getLastPlayTrackInAlbum(String albumId);
   // 设置播放进程的请求环境(开发环境environmentId=2，测试环境environmentId=4，线上环境environmentId=1)
   void setPlayerProcessRequestEnvironment(int environment);
//   void setStaticDomainServerIpCallBack(IXmStrDataCallBack l);//设置从主进程获取httpDns的回调
   void setSoundTouchAllParams(float tempo,float pitch,float rate);
   void requestSoundAd();   // 请求声音贴片广告
   void pausePlayInMillis(long millis);  // 在多少毫秒之后暂停播放 ,传入-1 表示播放完当前停止播放
   boolean isAdPlaying();   // 广告是否正在播放中
   boolean haveNextPlayList();   // 是否有下一页
   boolean havePrePlayList();   // 是否有上一页
   boolean isBuffering();   // 是否正在缓冲中
   void setProxyNew(inout Config config); // 设置代理
   void exitSoundAd(); // 跳过广告
   void setBreakpointResume(boolean flag);  //每次播放从头开始播放
   boolean isLoading(); // 是否正在缓冲中(广告请求中,广告缓冲中,音频缓冲中)

   //历史记录相关
   void resetPlayer(); // 重置播放器
//   void unregisteAdsListener(IXmPlayHistoryListener l);
   void insertPlayListHead(in List<Track> list);//在播放列表头部插入数据
    long getCurrentTrackPlayedDuration();
    float getTempo();   // 获取播放速率
    void setAppkeyAndPackId(String appkey ,String packId);

    void setNotificationForNoCrash(int id, in Notification notification);
    // 通知配置变化
    void notifyConfigChange();
    // 关闭通知栏
    void closeNotification();
    //播放激励视频广告成功
    void playRewardVideoAdSuccess(long dataId);
   //*******************************************请在以上加入非第三方使用的aidl接口***************************************
   
}