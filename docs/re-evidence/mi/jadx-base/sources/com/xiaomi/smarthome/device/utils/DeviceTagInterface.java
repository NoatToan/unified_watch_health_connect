package com.xiaomi.smarthome.device.utils;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public interface DeviceTagInterface<T> {
    public static final String ACTION_CATEGORY_INFO_UPDATED = "category_info_updated_action";
    public static final String ACTION_CUSTOM_TAG_INFO_UPDATED = "custom_info_updated_action";
    public static final String ACTION_TAG_INFO_EDITED = "tag_info_edited_action";
    public static final String ACTION_TAG_INFO_EDITED_NEW = "tag_info_edited_new_action";
    public static final String ACTION_TAG_INFO_UPDATED = "tag_info_updated_action";
    public static final int CURRENT_VERSION_CODE = 1;
    public static final int CUSTOM_COUNT_MAX = 1000;
    public static final int CUSTOM_START = 1001;
    public static final String CUSTOM_TAG_DEVICE_TAG_ORDER = "o";
    public static final String CUSTOM_TAG_DID = "did";
    public static final String CUSTOM_TAG_DISPLAY_TYPE = "dt";
    public static final String CUSTOM_TAG_DISPLAY_TYPE_ORDER = "dto";
    public static final String CUSTOM_TAG_INFO = "custom_tag_info";
    public static final String CUSTOM_TAG_LAST_TIME = "custom_tag_last_time";
    public static final String CUSTOM_TAG_ORDER = "order";
    public static final String CUSTOM_TAG_ORDER_INFO = "custom_tag_order_info";
    public static final String CUSTOM_TAG_ROUTER_INFO = "custom_tag_router_info";
    public static final String CUSTOM_TAG_TAG = "tag";
    public static final String CUSTOM_TAG_TYPE = "t";
    public static final String CUSTOM_TAG_VERSION_INFO = "custom_tag_version_info";
    public static final int CUSTOM_TAG_VER_KEY = 1000;
    public static final int DEVICE_TAG_ALL = -1;
    public static final int DEVICE_TAG_BRAND = 1;
    public static final int DEVICE_TAG_CAPABILITY = 3;
    public static final int DEVICE_TAG_CATEGORY = 0;
    public static final int DEVICE_TAG_COUNT = 5;
    public static final int DEVICE_TAG_CUSTOM = 4;
    public static final int DEVICE_TAG_DEFAULT_ROOM = 6;
    public static final int DEVICE_TAG_ROUTER = 2;
    public static final int DEVICE_TAG_SHARE = 7;
    public static final int DEVICE_TAG_SUB_CATEGORY = 8;
    public static final int MAX_DATA_LENGTH = 2048;
    public static final int ORDER_COUNT_MAX = 1000;
    public static final int ORDER_START = 2001;
    public static final String PARAM_DEVICE_COUNT = "param_device_count";
    public static final String PARAM_DEVICE_TAG_TYPE = "param_device_tag_type";
    public static final String ROUTER_BSSID = "bssid";
    public static final int ROUTER_COUNT_MAX = 1000;
    public static final String ROUTER_INFO = "router_info";
    public static final String ROUTER_LOCATION = "location";
    public static final String ROUTER_LOCATION_LAST_TIME = "router_location_last_time";
    public static final String ROUTER_PAIR_BSSID = "pair_bssid";
    public static final String ROUTER_REMARK = "remark";
    public static final String ROUTER_SSID = "ssid";
    public static final int ROUTER_START = 3001;
    public static final String TAG_DATA_COUNT = "tc";
    public static final String TAG_DATA_START = "ts";
    public static final String TAG_VERSION_CODE = "ver";

    public static class Category implements Serializable {
        public String id;
        public String name;
        public String parentId;
        public int rank;
    }

    public interface IDeviceTagListener {
        void onDeviceTagReady();
    }

    public interface IRoomConfigListener {
        void onRoomConfigReady();
    }

    void addTags(String str, Set<String> set);

    void clear();

    void clearConvertDeviceTags();

    boolean containsTag(int i, String str);

    void filterDeviceListByTag(List<T> list);

    void generateDeviceTagsByPluginInfo(List<T> list);

    void generateSubDeviceTagsByPluginInfo(Map<String, T> map);

    Set<Integer> getAllDeviceTagTypes();

    Collection<Category> getAllTopCategories();

    Set<String> getCategoryDevices(String str, String str2);

    Category getCategoryForModel(String str);

    Map<String, Set<String>> getCategoryTag();

    String getCurrentTag();

    String getCurrentTag2();

    int getCurrentTagDeviceCount();

    List<String> getDefaultRecommendTags();

    List<String> getDeviceTags(int i, String str);

    Set<String> getDevices(int i, String str);

    List<T> getFilteredDevice();

    String getGroupName(String str, String str2);

    Map<String, List<String>> getHomeCategory(String str);

    Map<String, List<String>> getHomeCategoryPure(String str);

    CharSequence getNewTag();

    String getOnlyTagName(int i, String str, String str2);

    List<String> getOrderDeviceTag(int i);

    List<Integer> getOrderDeviceTagType();

    List<Integer> getOrderDisplayDeviceTagType();

    List<String> getRecommendTags(T t);

    String getRouterGroupDefaultName(String str);

    Map<String, Set<String>> getRouterTag();

    String getRouterTagDefaultDisplayName(String str);

    String getRouterTagDisplayName(String str);

    Category getSubCategory(String str);

    String getTagByDevice(String str);

    Map<String, Set<String>> getTags(int i);

    Category getTopCategory(String str);

    Category getTopCategoryId(String str);

    List<Category> getTopCategoryIdCompact(String str);

    List<String> getUnTaggedDevices();

    boolean isInFilterMode();

    void loadTagInfo();

    void modifyTags(String str, String str2, Set<String> set);

    void onServerChanged();

    void registerDeviceTagListener(IDeviceTagListener iDeviceTagListener);

    void removeConvertDeviceTags(String str);

    void removeConvertDevicesIfNeed();

    void removeDeviceTags(String str, String str2);

    void removeTag(String str);

    void resetCurrentTag();

    void resetNewTag();

    void saveConvertDeviceTags(String str, String str2);

    boolean setCurrentTag(int i, String str, String str2);

    void setGroupName(String str, String str2);

    void unregisterDeviceTagListener(IDeviceTagListener iDeviceTagListener);
}
