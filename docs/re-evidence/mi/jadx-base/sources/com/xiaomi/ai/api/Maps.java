package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Maps {

    @NamespaceName(name = "AddMidPoi", namespace = AIApiConstants.Map.NAME)
    public static class AddMidPoi implements InstructionPayload {

        @Required
        private Poi poi;

        public AddMidPoi() {
        }

        public AddMidPoi(Poi poi) {
            this.poi = poi;
        }

        @Required
        public Poi getPoi() {
            return this.poi;
        }

        @Required
        public AddMidPoi setPoi(Poi poi) {
            this.poi = poi;
            return this;
        }
    }

    @NamespaceName(name = "AmbiguousPlaces", namespace = AIApiConstants.Map.NAME)
    public static class AmbiguousPlaces implements EventPayload {

        @Required
        private List<String> places;

        @Required
        private TripMode tripMode;

        public AmbiguousPlaces() {
        }

        public AmbiguousPlaces(TripMode tripMode, List<String> list) {
            this.tripMode = tripMode;
            this.places = list;
        }

        @Required
        public List<String> getPlaces() {
            return this.places;
        }

        @Required
        public TripMode getTripMode() {
            return this.tripMode;
        }

        @Required
        public AmbiguousPlaces setPlaces(List<String> list) {
            this.places = list;
            return this;
        }

        @Required
        public AmbiguousPlaces setTripMode(TripMode tripMode) {
            this.tripMode = tripMode;
            return this;
        }
    }

    @NamespaceName(name = "BackToNavigation", namespace = AIApiConstants.Map.NAME)
    @Deprecated
    public static class BackToNavigation implements InstructionPayload {
    }

    public enum BroadcastMode {
        UNKNOWN(-1),
        DETAIL(0),
        BRIEF(1),
        STANDARD(2);

        private int id;

        BroadcastMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class Busline {

        @Required
        private String description;

        @Required
        private String dest_station_id;

        @Required
        private String id;

        @Required
        private Template.Launcher launcher;

        @Required
        private String name;

        public Busline() {
        }

        public Busline(String str, String str2, String str3, String str4, Template.Launcher launcher) {
            this.id = str;
            this.dest_station_id = str2;
            this.name = str3;
            this.description = str4;
            this.launcher = launcher;
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        @Required
        public String getDestStationId() {
            return this.dest_station_id;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public Template.Launcher getLauncher() {
            return this.launcher;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public Busline setDescription(String str) {
            this.description = str;
            return this;
        }

        @Required
        public Busline setDestStationId(String str) {
            this.dest_station_id = str;
            return this;
        }

        @Required
        public Busline setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public Busline setLauncher(Template.Launcher launcher) {
            this.launcher = launcher;
            return this;
        }

        @Required
        public Busline setName(String str) {
            this.name = str;
            return this;
        }
    }

    public static class ChargingStationSearchInfo {

        @Required
        private String brand_desc;

        @Required
        private String current_ele_price;

        @Required
        private String current_ser_price;

        @Required
        private String fast_free;

        @Required
        private String fast_total;

        @Required
        private String num_fast;

        @Required
        private String num_slow;

        @Required
        private String slow_free;

        @Required
        private String slow_total;

        public ChargingStationSearchInfo() {
        }

        public ChargingStationSearchInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.slow_free = str;
            this.slow_total = str2;
            this.fast_free = str3;
            this.fast_total = str4;
            this.brand_desc = str5;
            this.num_slow = str6;
            this.num_fast = str7;
            this.current_ele_price = str8;
            this.current_ser_price = str9;
        }

        @Required
        public String getBrandDesc() {
            return this.brand_desc;
        }

        @Required
        public String getCurrentElePrice() {
            return this.current_ele_price;
        }

        @Required
        public String getCurrentSerPrice() {
            return this.current_ser_price;
        }

        @Required
        public String getFastFree() {
            return this.fast_free;
        }

        @Required
        public String getFastTotal() {
            return this.fast_total;
        }

        @Required
        public String getNumFast() {
            return this.num_fast;
        }

        @Required
        public String getNumSlow() {
            return this.num_slow;
        }

        @Required
        public String getSlowFree() {
            return this.slow_free;
        }

        @Required
        public String getSlowTotal() {
            return this.slow_total;
        }

        @Required
        public ChargingStationSearchInfo setBrandDesc(String str) {
            this.brand_desc = str;
            return this;
        }

        @Required
        public ChargingStationSearchInfo setCurrentElePrice(String str) {
            this.current_ele_price = str;
            return this;
        }

        @Required
        public ChargingStationSearchInfo setCurrentSerPrice(String str) {
            this.current_ser_price = str;
            return this;
        }

        @Required
        public ChargingStationSearchInfo setFastFree(String str) {
            this.fast_free = str;
            return this;
        }

        @Required
        public ChargingStationSearchInfo setFastTotal(String str) {
            this.fast_total = str;
            return this;
        }

        @Required
        public ChargingStationSearchInfo setNumFast(String str) {
            this.num_fast = str;
            return this;
        }

        @Required
        public ChargingStationSearchInfo setNumSlow(String str) {
            this.num_slow = str;
            return this;
        }

        @Required
        public ChargingStationSearchInfo setSlowFree(String str) {
            this.slow_free = str;
            return this;
        }

        @Required
        public ChargingStationSearchInfo setSlowTotal(String str) {
            this.slow_total = str;
            return this;
        }
    }

    public enum CommuterTimeType {
        UNKNOWN(-1),
        ON_DUTY(0),
        OFF_DUTY(1);

        private int id;

        CommuterTimeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "LifeService", namespace = AIApiConstants.Map.NAME)
    public static class LifeService implements InstructionPayload {
        private Optional<List<Poi>> rec_pois = Optional.a();
        private Optional<String> keyword = Optional.a();
        private Optional<Boolean> enable_auto_close = Optional.a();

        public Optional<String> getKeyword() {
            return this.keyword;
        }

        public Optional<List<Poi>> getRecPois() {
            return this.rec_pois;
        }

        public Optional<Boolean> isEnableAutoClose() {
            return this.enable_auto_close;
        }

        public LifeService setEnableAutoClose(boolean z) {
            this.enable_auto_close = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public LifeService setKeyword(String str) {
            this.keyword = Optional.e(str);
            return this;
        }

        public LifeService setRecPois(List<Poi> list) {
            this.rec_pois = Optional.e(list);
            return this;
        }
    }

    public static class MapCitySuggestionList {

        @Required
        private int city_count;

        @Required
        private String city_name;

        public MapCitySuggestionList() {
        }

        public MapCitySuggestionList(String str, int i) {
            this.city_name = str;
            this.city_count = i;
        }

        @Required
        public int getCityCount() {
            return this.city_count;
        }

        @Required
        public String getCityName() {
            return this.city_name;
        }

        @Required
        public MapCitySuggestionList setCityCount(int i) {
            this.city_count = i;
            return this;
        }

        @Required
        public MapCitySuggestionList setCityName(String str) {
            this.city_name = str;
            return this;
        }
    }

    public enum MapDirective {
        UNKNOWN(-1),
        ZOOM_IN(0),
        ZOOM_OUT(1),
        BACK_TO_NAVIGATION(2),
        CANCEL_NAVIGATION(3),
        QUERY_REST_OF_TIME(4),
        QUERY_WHOLE_ROUTE(5),
        DELETE_MID_POI(6),
        QUERY_REST_OF_ROUTE(7),
        SPEED_LIMIT(8),
        NEARBY_TRAFFIC_CONDITION(9),
        ZOOM_IN_MAX(10),
        ZOOM_OUT_MIN(11),
        SWITCH_MAP_MODE(12),
        COLLECT_CURRENT_POI(13),
        EXIT_WHOLE_ROUTE(14),
        NAVIGATION(15),
        SEARCH(16),
        WHERE(17),
        ROUTE_PLAN(18),
        MUTE(19),
        UNMUTE(20),
        OPEN_SETTING_PAGE(21),
        CLOSE_SETTING_PAGE(22),
        BACK_TO_MAIN_PAGE(23),
        VIEW_VIA_POINTS(24),
        NAVI_BROADCAST(25),
        DELETE_HOME(26),
        DELETE_COMPANY(27),
        ZOOM_DEFAULT(28);

        private int id;

        MapDirective(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MapDisplayPage {
        UNKNOWN(-1),
        ROUTE_PLAN_PAGE(0),
        NAVIGATION_PAGE(1),
        SEARCH_DETAILS_PAGE(2);

        private int id;

        MapDisplayPage(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MapFeature {
        UNKNOWN(-1),
        CRUISE_REPORT(0),
        REAL_TIME_TRAFFIC(1),
        RESTRICTION_REMIND(2),
        DESTINATION_PREDICTED(3),
        WHOLE_ROUTE(4),
        BROADCAST_MODE(5),
        SMART_SCALE_BAR(6),
        COMMUTE_SIMPLIFY_BROADCAST(7),
        COMMUTE_AUTO_NAVIGATION(8),
        CHARGING_ROUTE_PLANNING(9),
        LANE_LEVEL_NAVIGATION(10),
        AVOID_RESTRICTION(11);

        private int id;

        MapFeature(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MapMode {
        UNKNOWN(-1),
        FOLLOW_MODE(0),
        NORTH_MODE(1),
        TWO_D_MODE(2),
        THERE_D_MODE(3),
        DAY_MODE(4),
        NIGHT_MODE(5),
        DAY_NIGHT_AUTO_MODE(6);

        private int id;

        MapMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MapNavigateState {
        UNKNOWN(-1),
        NAVIGATE(0),
        ROUTE_LIST(1),
        BEGINING(2);

        private int id;

        MapNavigateState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MapPageMode {
        UNKNOWN(-1),
        OTHER(0),
        POI_LIST(1),
        POI_DETAIL(2),
        ROUTE_LIST(3),
        NAVIGATE(4),
        VIA_LIST(5),
        ALONG_WAY_LIST(6),
        HOME_COMPANY_LIST(7),
        COLLECT_LIST(8),
        FAVORITES_PAGE(9),
        HISTORY_PAGE(10);

        private int id;

        MapPageMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MapPoiType {
        UNKNOWN(-1),
        GAS_STATION(0),
        ATM(1),
        AUTO_REPAIR_STORE(2),
        TOILET(3),
        CHARGING_STATION(4);

        private int id;

        MapPoiType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "MapState", namespace = AIApiConstants.Map.NAME)
    public static class MapState implements ContextPayload {
        private Optional<String> city = Optional.a();
        private Optional<MapPageMode> page_mode = Optional.a();
        private Optional<List<Poi>> poi_items = Optional.a();
        private Optional<Poi> selected_poi = Optional.a();
        private Optional<List<Route>> route_items = Optional.a();
        private Optional<List<Poi>> via_items = Optional.a();
        private Optional<List<Poi>> selected_via_items = Optional.a();
        private Optional<Poi> end_poi = Optional.a();
        private Optional<MapNavigateState> navigate_state = Optional.a();
        private Optional<List<Poi>> home_company_items = Optional.a();
        private Optional<List<Poi>> collect_items = Optional.a();
        private Optional<Boolean> location_auth = Optional.a();

        public Optional<String> getCity() {
            return this.city;
        }

        public Optional<List<Poi>> getCollectItems() {
            return this.collect_items;
        }

        public Optional<Poi> getEndPoi() {
            return this.end_poi;
        }

        public Optional<List<Poi>> getHomeCompanyItems() {
            return this.home_company_items;
        }

        public Optional<MapNavigateState> getNavigateState() {
            return this.navigate_state;
        }

        public Optional<MapPageMode> getPageMode() {
            return this.page_mode;
        }

        public Optional<List<Poi>> getPoiItems() {
            return this.poi_items;
        }

        public Optional<List<Route>> getRouteItems() {
            return this.route_items;
        }

        public Optional<Poi> getSelectedPoi() {
            return this.selected_poi;
        }

        public Optional<List<Poi>> getSelectedViaItems() {
            return this.selected_via_items;
        }

        public Optional<List<Poi>> getViaItems() {
            return this.via_items;
        }

        public Optional<Boolean> isLocationAuth() {
            return this.location_auth;
        }

        public MapState setCity(String str) {
            this.city = Optional.e(str);
            return this;
        }

        public MapState setCollectItems(List<Poi> list) {
            this.collect_items = Optional.e(list);
            return this;
        }

        public MapState setEndPoi(Poi poi) {
            this.end_poi = Optional.e(poi);
            return this;
        }

        public MapState setHomeCompanyItems(List<Poi> list) {
            this.home_company_items = Optional.e(list);
            return this;
        }

        public MapState setLocationAuth(boolean z) {
            this.location_auth = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public MapState setNavigateState(MapNavigateState mapNavigateState) {
            this.navigate_state = Optional.e(mapNavigateState);
            return this;
        }

        public MapState setPageMode(MapPageMode mapPageMode) {
            this.page_mode = Optional.e(mapPageMode);
            return this;
        }

        public MapState setPoiItems(List<Poi> list) {
            this.poi_items = Optional.e(list);
            return this;
        }

        public MapState setRouteItems(List<Route> list) {
            this.route_items = Optional.e(list);
            return this;
        }

        public MapState setSelectedPoi(Poi poi) {
            this.selected_poi = Optional.e(poi);
            return this;
        }

        public MapState setSelectedViaItems(List<Poi> list) {
            this.selected_via_items = Optional.e(list);
            return this;
        }

        public MapState setViaItems(List<Poi> list) {
            this.via_items = Optional.e(list);
            return this;
        }
    }

    @NamespaceName(name = "ModifyUsualAddress", namespace = AIApiConstants.Map.NAME)
    public static class ModifyUsualAddress implements InstructionPayload {

        @Required
        private PoiType poi_type;

        public ModifyUsualAddress() {
        }

        public ModifyUsualAddress(PoiType poiType) {
            this.poi_type = poiType;
        }

        @Required
        public PoiType getPoiType() {
            return this.poi_type;
        }

        @Required
        public ModifyUsualAddress setPoiType(PoiType poiType) {
            this.poi_type = poiType;
            return this;
        }
    }

    public static class PoiEntry {

        @Required
        private double entry_latitude;

        @Required
        private double entry_longitude;

        public PoiEntry() {
        }

        public PoiEntry(double d, double d2) {
            this.entry_latitude = d;
            this.entry_longitude = d2;
        }

        @Required
        public double getEntryLatitude() {
            return this.entry_latitude;
        }

        @Required
        public double getEntryLongitude() {
            return this.entry_longitude;
        }

        @Required
        public PoiEntry setEntryLatitude(double d) {
            this.entry_latitude = d;
            return this;
        }

        @Required
        public PoiEntry setEntryLongitude(double d) {
            this.entry_longitude = d;
            return this;
        }
    }

    public enum PoiType {
        UNKNOWN(-1),
        NORMAL(0),
        HOME(1),
        COMPANY(2),
        MY_LOCATION(3),
        AUTO_CHARGING_STATION(4);

        private int id;

        PoiType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "QueryTrafficCondition", namespace = AIApiConstants.Map.NAME)
    public static class QueryTrafficCondition implements InstructionPayload {

        @Required
        private String name;

        public QueryTrafficCondition() {
        }

        public QueryTrafficCondition(String str) {
            this.name = str;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public QueryTrafficCondition setName(String str) {
            this.name = str;
            return this;
        }
    }

    @NamespaceName(name = "RefreshBuslines", namespace = AIApiConstants.Map.NAME)
    public static class RefreshBuslines implements EventPayload {

        @Required
        private List<Busline> lines;

        public RefreshBuslines() {
        }

        public RefreshBuslines(List<Busline> list) {
            this.lines = list;
        }

        @Required
        public List<Busline> getLines() {
            return this.lines;
        }

        @Required
        public RefreshBuslines setLines(List<Busline> list) {
            this.lines = list;
            return this;
        }
    }

    @NamespaceName(name = "RefreshBuslinesInfo", namespace = AIApiConstants.Map.NAME)
    public static class RefreshBuslinesInfo implements InstructionPayload {

        @Required
        private List<Busline> lines;

        public RefreshBuslinesInfo() {
        }

        public RefreshBuslinesInfo(List<Busline> list) {
            this.lines = list;
        }

        @Required
        public List<Busline> getLines() {
            return this.lines;
        }

        @Required
        public RefreshBuslinesInfo setLines(List<Busline> list) {
            this.lines = list;
            return this;
        }
    }

    public enum RouteOverviewMode {
        UNKNOWN(-1),
        BEAM(0),
        ABBREVIATION(1);

        private int id;

        RouteOverviewMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum RoutePreference {
        UNKNOWN(-1),
        DEFAULT(0),
        AVOID_CONGESTION(1),
        NO_HIGHWAY(2),
        HIGHWAY_FIRST(3),
        AVOID_CHARGES(4),
        TIME_FIRST(5),
        DISTANCE_FIRST(6),
        FOLLOW_MY_SETTINGS(7),
        MAIN_ROAD(8),
        SIDE_ROAD(9),
        ON_THE_VIADUCT(10),
        UNDER_THE_VIADUCT(11);

        private int id;

        RoutePreference(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SearchAlongType {
        UNKNOWN(-1),
        POI(0),
        ROAD_CONDITION(1),
        REMAIN_TIME(2),
        REMAIN_DISTANCE(3),
        TRAFFIC_LIGHT(4),
        SPEED(5);

        private int id;

        SearchAlongType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SetBroadcastMode", namespace = AIApiConstants.Map.NAME)
    public static class SetBroadcastMode implements InstructionPayload {

        @Required
        private BroadcastMode mode;

        public SetBroadcastMode() {
        }

        public SetBroadcastMode(BroadcastMode broadcastMode) {
            this.mode = broadcastMode;
        }

        @Required
        public BroadcastMode getMode() {
            return this.mode;
        }

        @Required
        public SetBroadcastMode setMode(BroadcastMode broadcastMode) {
            this.mode = broadcastMode;
            return this;
        }
    }

    @NamespaceName(name = "SetCommuterTime", namespace = AIApiConstants.Map.NAME)
    public static class SetCommuterTime implements InstructionPayload {

        @Required
        private Application.ScheduleDuration duration;

        @Required
        private CommuterTimeType setting_type;

        public SetCommuterTime() {
        }

        public SetCommuterTime(CommuterTimeType commuterTimeType, Application.ScheduleDuration scheduleDuration) {
            this.setting_type = commuterTimeType;
            this.duration = scheduleDuration;
        }

        @Required
        public Application.ScheduleDuration getDuration() {
            return this.duration;
        }

        @Required
        public CommuterTimeType getSettingType() {
            return this.setting_type;
        }

        @Required
        public SetCommuterTime setDuration(Application.ScheduleDuration scheduleDuration) {
            this.duration = scheduleDuration;
            return this;
        }

        @Required
        public SetCommuterTime setSettingType(CommuterTimeType commuterTimeType) {
            this.setting_type = commuterTimeType;
            return this;
        }
    }

    @NamespaceName(name = "SetMapMode", namespace = AIApiConstants.Map.NAME)
    public static class SetMapMode implements InstructionPayload {

        @Required
        private List<MapMode> map_mode;

        public SetMapMode() {
        }

        public SetMapMode(List<MapMode> list) {
            this.map_mode = list;
        }

        @Required
        public List<MapMode> getMapMode() {
            return this.map_mode;
        }

        @Required
        public SetMapMode setMapMode(List<MapMode> list) {
            this.map_mode = list;
            return this;
        }
    }

    @NamespaceName(name = "SetRouteOverview", namespace = AIApiConstants.Map.NAME)
    public static class SetRouteOverview implements InstructionPayload {

        @Required
        private RouteOverviewMode mode;

        public SetRouteOverview() {
        }

        public SetRouteOverview(RouteOverviewMode routeOverviewMode) {
            this.mode = routeOverviewMode;
        }

        @Required
        public RouteOverviewMode getMode() {
            return this.mode;
        }

        @Required
        public SetRouteOverview setMode(RouteOverviewMode routeOverviewMode) {
            this.mode = routeOverviewMode;
            return this;
        }
    }

    @NamespaceName(name = "ShowPoiDetail", namespace = AIApiConstants.Map.NAME)
    public static class ShowPoiDetail implements InstructionPayload {
        private Optional<Poi> poi = Optional.a();

        public Optional<Poi> getPoi() {
            return this.poi;
        }

        public ShowPoiDetail setPoi(Poi poi) {
            this.poi = Optional.e(poi);
            return this;
        }
    }

    @NamespaceName(name = "SwitchRoute", namespace = AIApiConstants.Map.NAME)
    public static class SwitchRoute implements InstructionPayload {
        private Optional<RoutePreference> preference = Optional.a();

        public Optional<RoutePreference> getPreference() {
            return this.preference;
        }

        public SwitchRoute setPreference(RoutePreference routePreference) {
            this.preference = Optional.e(routePreference);
            return this;
        }
    }

    public enum TripMode {
        UNKNOWN(-1),
        DRIVING(0),
        RIDING(1),
        WALKING(2),
        TRANSIT(3);

        private int id;

        TripMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "TurnOff", namespace = AIApiConstants.Map.NAME)
    public static class TurnOff implements InstructionPayload {

        @Required
        private MapFeature feature;

        public TurnOff() {
        }

        public TurnOff(MapFeature mapFeature) {
            this.feature = mapFeature;
        }

        @Required
        public MapFeature getFeature() {
            return this.feature;
        }

        @Required
        public TurnOff setFeature(MapFeature mapFeature) {
            this.feature = mapFeature;
            return this;
        }
    }

    @NamespaceName(name = "TurnOn", namespace = AIApiConstants.Map.NAME)
    public static class TurnOn implements InstructionPayload {

        @Required
        private MapFeature feature;

        public TurnOn() {
        }

        public TurnOn(MapFeature mapFeature) {
            this.feature = mapFeature;
        }

        @Required
        public MapFeature getFeature() {
            return this.feature;
        }

        @Required
        public TurnOn setFeature(MapFeature mapFeature) {
            this.feature = mapFeature;
            return this;
        }
    }

    @NamespaceName(name = "ZoomIn", namespace = AIApiConstants.Map.NAME)
    @Deprecated
    public static class ZoomIn implements InstructionPayload {
    }

    @NamespaceName(name = "ZoomOut", namespace = AIApiConstants.Map.NAME)
    @Deprecated
    public static class ZoomOut implements InstructionPayload {
    }

    @NamespaceName(name = "ExecuteDirective", namespace = AIApiConstants.Map.NAME)
    public static class ExecuteDirective implements InstructionPayload {

        @Required
        private MapDirective directive;
        private Optional<String> pkg_name = Optional.a();

        public ExecuteDirective() {
        }

        @Required
        public MapDirective getDirective() {
            return this.directive;
        }

        public Optional<String> getPkgName() {
            return this.pkg_name;
        }

        @Required
        public ExecuteDirective setDirective(MapDirective mapDirective) {
            this.directive = mapDirective;
            return this;
        }

        public ExecuteDirective setPkgName(String str) {
            this.pkg_name = Optional.e(str);
            return this;
        }

        public ExecuteDirective(MapDirective mapDirective) {
            this.directive = mapDirective;
        }
    }

    public static class MapPoiResult {
        private Optional<List<MapCitySuggestionList>> city_suggestion_list = Optional.a();

        @Required
        private int count;

        @Required
        private List<MapSearchPoi> poi_list;

        public MapPoiResult() {
        }

        public Optional<List<MapCitySuggestionList>> getCitySuggestionList() {
            return this.city_suggestion_list;
        }

        @Required
        public int getCount() {
            return this.count;
        }

        @Required
        public List<MapSearchPoi> getPoiList() {
            return this.poi_list;
        }

        public MapPoiResult setCitySuggestionList(List<MapCitySuggestionList> list) {
            this.city_suggestion_list = Optional.e(list);
            return this;
        }

        @Required
        public MapPoiResult setCount(int i) {
            this.count = i;
            return this;
        }

        @Required
        public MapPoiResult setPoiList(List<MapSearchPoi> list) {
            this.poi_list = list;
            return this;
        }

        public MapPoiResult(int i, List<MapSearchPoi> list) {
            this.count = i;
            this.poi_list = list;
        }
    }

    public static class MapPoiSearchResponse {
        private Optional<String> category = Optional.a();

        @Required
        private int current_page;

        @Required
        private String display_keyword;

        @Required
        private boolean is_backup_result;

        @Required
        private int poi_count;

        @Required
        private MapPoiResult poi_result;

        @Required
        private boolean show_search_page;

        @Required
        private int total_page;

        public MapPoiSearchResponse() {
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        @Required
        public int getCurrentPage() {
            return this.current_page;
        }

        @Required
        public String getDisplayKeyword() {
            return this.display_keyword;
        }

        @Required
        public int getPoiCount() {
            return this.poi_count;
        }

        @Required
        public MapPoiResult getPoiResult() {
            return this.poi_result;
        }

        @Required
        public int getTotalPage() {
            return this.total_page;
        }

        @Required
        public boolean isBackupResult() {
            return this.is_backup_result;
        }

        @Required
        public boolean isShowSearchPage() {
            return this.show_search_page;
        }

        public MapPoiSearchResponse setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        @Required
        public MapPoiSearchResponse setCurrentPage(int i) {
            this.current_page = i;
            return this;
        }

        @Required
        public MapPoiSearchResponse setDisplayKeyword(String str) {
            this.display_keyword = str;
            return this;
        }

        @Required
        public MapPoiSearchResponse setIsBackupResult(boolean z) {
            this.is_backup_result = z;
            return this;
        }

        @Required
        public MapPoiSearchResponse setPoiCount(int i) {
            this.poi_count = i;
            return this;
        }

        @Required
        public MapPoiSearchResponse setPoiResult(MapPoiResult mapPoiResult) {
            this.poi_result = mapPoiResult;
            return this;
        }

        @Required
        public MapPoiSearchResponse setShowSearchPage(boolean z) {
            this.show_search_page = z;
            return this;
        }

        @Required
        public MapPoiSearchResponse setTotalPage(int i) {
            this.total_page = i;
            return this;
        }

        public MapPoiSearchResponse(String str, int i, MapPoiResult mapPoiResult, int i2, int i3, boolean z, boolean z2) {
            this.display_keyword = str;
            this.poi_count = i;
            this.poi_result = mapPoiResult;
            this.current_page = i2;
            this.total_page = i3;
            this.is_backup_result = z;
            this.show_search_page = z2;
        }
    }

    @NamespaceName(name = "PlanRoute", namespace = AIApiConstants.Map.NAME)
    public static class PlanRoute implements InstructionPayload {

        @Required
        private Poi end_poi;

        @Required
        private MapDisplayPage map_display_page;
        private Optional<List<Poi>> mid_pois = Optional.a();

        @Required
        private String pkg_name;

        @Required
        private List<RoutePreference> route_preference;

        @Required
        private Poi start_poi;

        @Required
        private TripMode trip_mode;

        public PlanRoute() {
        }

        @Required
        public Poi getEndPoi() {
            return this.end_poi;
        }

        @Required
        public MapDisplayPage getMapDisplayPage() {
            return this.map_display_page;
        }

        public Optional<List<Poi>> getMidPois() {
            return this.mid_pois;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        @Required
        public List<RoutePreference> getRoutePreference() {
            return this.route_preference;
        }

        @Required
        public Poi getStartPoi() {
            return this.start_poi;
        }

        @Required
        public TripMode getTripMode() {
            return this.trip_mode;
        }

        @Required
        public PlanRoute setEndPoi(Poi poi) {
            this.end_poi = poi;
            return this;
        }

        @Required
        public PlanRoute setMapDisplayPage(MapDisplayPage mapDisplayPage) {
            this.map_display_page = mapDisplayPage;
            return this;
        }

        public PlanRoute setMidPois(List<Poi> list) {
            this.mid_pois = Optional.e(list);
            return this;
        }

        @Required
        public PlanRoute setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        @Required
        public PlanRoute setRoutePreference(List<RoutePreference> list) {
            this.route_preference = list;
            return this;
        }

        @Required
        public PlanRoute setStartPoi(Poi poi) {
            this.start_poi = poi;
            return this;
        }

        @Required
        public PlanRoute setTripMode(TripMode tripMode) {
            this.trip_mode = tripMode;
            return this;
        }

        public PlanRoute(String str, MapDisplayPage mapDisplayPage, TripMode tripMode, Poi poi, Poi poi2, List<RoutePreference> list) {
            this.pkg_name = str;
            this.map_display_page = mapDisplayPage;
            this.trip_mode = tripMode;
            this.start_poi = poi;
            this.end_poi = poi2;
            this.route_preference = list;
        }
    }

    @NamespaceName(name = "SearchKeyword", namespace = AIApiConstants.Map.NAME)
    public static class SearchKeyword implements InstructionPayload {
        private Optional<String> city = Optional.a();

        @Required
        private String name;

        public SearchKeyword() {
        }

        public Optional<String> getCity() {
            return this.city;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public SearchKeyword setCity(String str) {
            this.city = Optional.e(str);
            return this;
        }

        @Required
        public SearchKeyword setName(String str) {
            this.name = str;
            return this;
        }

        public SearchKeyword(String str) {
            this.name = str;
        }
    }

    @NamespaceName(name = "SetPreference", namespace = AIApiConstants.Map.NAME)
    public static class SetPreference implements InstructionPayload {
        private Optional<List<Application.Hint>> hints = Optional.a();

        @Required
        private List<RoutePreference> route_preference;

        public SetPreference() {
        }

        public Optional<List<Application.Hint>> getHints() {
            return this.hints;
        }

        @Required
        public List<RoutePreference> getRoutePreference() {
            return this.route_preference;
        }

        public SetPreference setHints(List<Application.Hint> list) {
            this.hints = Optional.e(list);
            return this;
        }

        @Required
        public SetPreference setRoutePreference(List<RoutePreference> list) {
            this.route_preference = list;
            return this;
        }

        public SetPreference(List<RoutePreference> list) {
            this.route_preference = list;
        }
    }

    @NamespaceName(name = "ShowTips", namespace = AIApiConstants.Map.NAME)
    public static class ShowTips implements InstructionPayload {

        @Required
        private List<Place> items;

        @Required
        private MapDisplayPage map_display_page;

        @Required
        private String pkg_name;

        @Required
        private List<RoutePreference> route_preference;
        private Optional<Template.Image> skill_icon = Optional.a();

        @Required
        private TripMode trip_mode;

        public ShowTips() {
        }

        @Required
        public List<Place> getItems() {
            return this.items;
        }

        @Required
        public MapDisplayPage getMapDisplayPage() {
            return this.map_display_page;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        @Required
        public List<RoutePreference> getRoutePreference() {
            return this.route_preference;
        }

        public Optional<Template.Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public TripMode getTripMode() {
            return this.trip_mode;
        }

        @Required
        public ShowTips setItems(List<Place> list) {
            this.items = list;
            return this;
        }

        @Required
        public ShowTips setMapDisplayPage(MapDisplayPage mapDisplayPage) {
            this.map_display_page = mapDisplayPage;
            return this;
        }

        @Required
        public ShowTips setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        @Required
        public ShowTips setRoutePreference(List<RoutePreference> list) {
            this.route_preference = list;
            return this;
        }

        public ShowTips setSkillIcon(Template.Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        @Required
        public ShowTips setTripMode(TripMode tripMode) {
            this.trip_mode = tripMode;
            return this;
        }

        public ShowTips(String str, MapDisplayPage mapDisplayPage, TripMode tripMode, List<Place> list, List<RoutePreference> list2) {
            this.pkg_name = str;
            this.map_display_page = mapDisplayPage;
            this.trip_mode = tripMode;
            this.items = list;
            this.route_preference = list2;
        }
    }

    public static class Place {

        @Required
        private String distance;

        @Required
        private Poi poi;
        private Optional<Template.AndroidIntent> intent = Optional.a();
        private Optional<Poi> start_poi = Optional.a();

        public Place() {
        }

        @Required
        public String getDistance() {
            return this.distance;
        }

        public Optional<Template.AndroidIntent> getIntent() {
            return this.intent;
        }

        @Required
        public Poi getPoi() {
            return this.poi;
        }

        public Optional<Poi> getStartPoi() {
            return this.start_poi;
        }

        @Required
        public Place setDistance(String str) {
            this.distance = str;
            return this;
        }

        public Place setIntent(Template.AndroidIntent androidIntent) {
            this.intent = Optional.e(androidIntent);
            return this;
        }

        @Required
        public Place setPoi(Poi poi) {
            this.poi = poi;
            return this;
        }

        public Place setStartPoi(Poi poi) {
            this.start_poi = Optional.e(poi);
            return this;
        }

        public Place(Poi poi, String str) {
            this.poi = poi;
            this.distance = str;
        }
    }

    public static class ChildPoi {

        @Required
        private String address;

        @Required
        private String distance;

        @Required
        private double latitude;

        @Required
        private double longitude;

        @Required
        private String name;

        @Required
        private String poi_id;

        @Required
        private String type_code;
        private Optional<String> tel = Optional.a();
        private Optional<Double> radio = Optional.a();
        private Optional<List<PoiEntry>> entry_list = Optional.a();

        public ChildPoi() {
        }

        @Required
        public String getAddress() {
            return this.address;
        }

        @Required
        public String getDistance() {
            return this.distance;
        }

        public Optional<List<PoiEntry>> getEntryList() {
            return this.entry_list;
        }

        @Required
        public double getLatitude() {
            return this.latitude;
        }

        @Required
        public double getLongitude() {
            return this.longitude;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getPoiId() {
            return this.poi_id;
        }

        public Optional<Double> getRadio() {
            return this.radio;
        }

        public Optional<String> getTel() {
            return this.tel;
        }

        @Required
        public String getTypeCode() {
            return this.type_code;
        }

        @Required
        public ChildPoi setAddress(String str) {
            this.address = str;
            return this;
        }

        @Required
        public ChildPoi setDistance(String str) {
            this.distance = str;
            return this;
        }

        public ChildPoi setEntryList(List<PoiEntry> list) {
            this.entry_list = Optional.e(list);
            return this;
        }

        @Required
        public ChildPoi setLatitude(double d) {
            this.latitude = d;
            return this;
        }

        @Required
        public ChildPoi setLongitude(double d) {
            this.longitude = d;
            return this;
        }

        @Required
        public ChildPoi setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public ChildPoi setPoiId(String str) {
            this.poi_id = str;
            return this;
        }

        public ChildPoi setRadio(double d) {
            this.radio = Optional.e(Double.valueOf(d));
            return this;
        }

        public ChildPoi setTel(String str) {
            this.tel = Optional.e(str);
            return this;
        }

        @Required
        public ChildPoi setTypeCode(String str) {
            this.type_code = str;
            return this;
        }

        public ChildPoi(String str, String str2, String str3, String str4, String str5, double d, double d2) {
            this.name = str;
            this.distance = str2;
            this.poi_id = str3;
            this.type_code = str4;
            this.address = str5;
            this.latitude = d;
            this.longitude = d2;
        }
    }

    public static class RawPlace {

        @Required
        private String keyword;
        private Optional<String> district = Optional.a();
        private Optional<String> city = Optional.a();
        private Optional<String> province = Optional.a();
        private Optional<String> country = Optional.a();

        public RawPlace() {
        }

        public Optional<String> getCity() {
            return this.city;
        }

        public Optional<String> getCountry() {
            return this.country;
        }

        public Optional<String> getDistrict() {
            return this.district;
        }

        @Required
        public String getKeyword() {
            return this.keyword;
        }

        public Optional<String> getProvince() {
            return this.province;
        }

        public RawPlace setCity(String str) {
            this.city = Optional.e(str);
            return this;
        }

        public RawPlace setCountry(String str) {
            this.country = Optional.e(str);
            return this;
        }

        public RawPlace setDistrict(String str) {
            this.district = Optional.e(str);
            return this;
        }

        @Required
        public RawPlace setKeyword(String str) {
            this.keyword = str;
            return this;
        }

        public RawPlace setProvince(String str) {
            this.province = Optional.e(str);
            return this;
        }

        public RawPlace(String str) {
            this.keyword = str;
        }
    }

    @NamespaceName(name = "RawPlanRoute", namespace = AIApiConstants.Map.NAME)
    public static class RawPlanRoute implements InstructionPayload {

        @Required
        private RawPlace dest;

        @Required
        private RawPlace raw_dest;

        @Required
        private List<RoutePreference> route_preference;
        private Optional<RawPlace> origin = Optional.a();
        private Optional<List<RawPlace>> passing = Optional.a();
        private Optional<String> tag = Optional.a();
        private Optional<String> directive = Optional.a();

        public RawPlanRoute() {
        }

        @Required
        public RawPlace getDest() {
            return this.dest;
        }

        public Optional<String> getDirective() {
            return this.directive;
        }

        public Optional<RawPlace> getOrigin() {
            return this.origin;
        }

        public Optional<List<RawPlace>> getPassing() {
            return this.passing;
        }

        @Required
        public RawPlace getRawDest() {
            return this.raw_dest;
        }

        @Required
        public List<RoutePreference> getRoutePreference() {
            return this.route_preference;
        }

        public Optional<String> getTag() {
            return this.tag;
        }

        @Required
        public RawPlanRoute setDest(RawPlace rawPlace) {
            this.dest = rawPlace;
            return this;
        }

        public RawPlanRoute setDirective(String str) {
            this.directive = Optional.e(str);
            return this;
        }

        public RawPlanRoute setOrigin(RawPlace rawPlace) {
            this.origin = Optional.e(rawPlace);
            return this;
        }

        public RawPlanRoute setPassing(List<RawPlace> list) {
            this.passing = Optional.e(list);
            return this;
        }

        @Required
        public RawPlanRoute setRawDest(RawPlace rawPlace) {
            this.raw_dest = rawPlace;
            return this;
        }

        @Required
        public RawPlanRoute setRoutePreference(List<RoutePreference> list) {
            this.route_preference = list;
            return this;
        }

        public RawPlanRoute setTag(String str) {
            this.tag = Optional.e(str);
            return this;
        }

        public RawPlanRoute(RawPlace rawPlace, RawPlace rawPlace2, List<RoutePreference> list) {
            this.dest = rawPlace;
            this.raw_dest = rawPlace2;
            this.route_preference = list;
        }
    }

    @NamespaceName(name = "SearchAlong", namespace = AIApiConstants.Map.NAME)
    public static class SearchAlong implements InstructionPayload {

        @Required
        private String name;
        private Optional<Boolean> search_target = Optional.a();
        private Optional<SearchAlongType> search_type = Optional.a();
        private Optional<MapPoiType> poi_type = Optional.a();
        private Optional<List<Application.Hint>> hints = Optional.a();

        public SearchAlong() {
        }

        public Optional<List<Application.Hint>> getHints() {
            return this.hints;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<MapPoiType> getPoiType() {
            return this.poi_type;
        }

        public Optional<SearchAlongType> getSearchType() {
            return this.search_type;
        }

        public Optional<Boolean> isSearchTarget() {
            return this.search_target;
        }

        public SearchAlong setHints(List<Application.Hint> list) {
            this.hints = Optional.e(list);
            return this;
        }

        @Required
        public SearchAlong setName(String str) {
            this.name = str;
            return this;
        }

        public SearchAlong setPoiType(MapPoiType mapPoiType) {
            this.poi_type = Optional.e(mapPoiType);
            return this;
        }

        public SearchAlong setSearchTarget(boolean z) {
            this.search_target = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SearchAlong setSearchType(SearchAlongType searchAlongType) {
            this.search_type = Optional.e(searchAlongType);
            return this;
        }

        public SearchAlong(String str) {
            this.name = str;
        }
    }

    @NamespaceName(name = "NavigateState", namespace = AIApiConstants.Map.NAME)
    public static class NavigateState implements ContextPayload {

        @Required
        private String current_road;

        @Required
        private Poi end_poi;

        @Required
        private Poi start_poi;

        @Required
        private TripMode trip_mode;
        private Optional<List<Poi>> mid_pois = Optional.a();
        private Optional<List<Poi>> service_pois = Optional.a();
        private Optional<List<Poi>> toll_pois = Optional.a();
        private Optional<Integer> road_level = Optional.a();
        private Optional<List<String>> along_cities = Optional.a();

        public NavigateState() {
        }

        public Optional<List<String>> getAlongCities() {
            return this.along_cities;
        }

        @Required
        public String getCurrentRoad() {
            return this.current_road;
        }

        @Required
        public Poi getEndPoi() {
            return this.end_poi;
        }

        public Optional<List<Poi>> getMidPois() {
            return this.mid_pois;
        }

        public Optional<Integer> getRoadLevel() {
            return this.road_level;
        }

        public Optional<List<Poi>> getServicePois() {
            return this.service_pois;
        }

        @Required
        public Poi getStartPoi() {
            return this.start_poi;
        }

        public Optional<List<Poi>> getTollPois() {
            return this.toll_pois;
        }

        @Required
        public TripMode getTripMode() {
            return this.trip_mode;
        }

        public NavigateState setAlongCities(List<String> list) {
            this.along_cities = Optional.e(list);
            return this;
        }

        @Required
        public NavigateState setCurrentRoad(String str) {
            this.current_road = str;
            return this;
        }

        @Required
        public NavigateState setEndPoi(Poi poi) {
            this.end_poi = poi;
            return this;
        }

        public NavigateState setMidPois(List<Poi> list) {
            this.mid_pois = Optional.e(list);
            return this;
        }

        public NavigateState setRoadLevel(int i) {
            this.road_level = Optional.e(Integer.valueOf(i));
            return this;
        }

        public NavigateState setServicePois(List<Poi> list) {
            this.service_pois = Optional.e(list);
            return this;
        }

        @Required
        public NavigateState setStartPoi(Poi poi) {
            this.start_poi = poi;
            return this;
        }

        public NavigateState setTollPois(List<Poi> list) {
            this.toll_pois = Optional.e(list);
            return this;
        }

        @Required
        public NavigateState setTripMode(TripMode tripMode) {
            this.trip_mode = tripMode;
            return this;
        }

        public NavigateState(TripMode tripMode, Poi poi, Poi poi2, String str) {
            this.trip_mode = tripMode;
            this.start_poi = poi;
            this.end_poi = poi2;
            this.current_road = str;
        }
    }

    public static class SubPoi {

        @Required
        private String address;

        @Required
        private String name;
        private Optional<String> id = Optional.a();
        private Optional<Double> longitude = Optional.a();
        private Optional<Double> latitude = Optional.a();
        private Optional<List<String>> alias = Optional.a();
        private Optional<String> description = Optional.a();

        public SubPoi() {
        }

        @Required
        public String getAddress() {
            return this.address;
        }

        public Optional<List<String>> getAlias() {
            return this.alias;
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<Double> getLatitude() {
            return this.latitude;
        }

        public Optional<Double> getLongitude() {
            return this.longitude;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public SubPoi setAddress(String str) {
            this.address = str;
            return this;
        }

        public SubPoi setAlias(List<String> list) {
            this.alias = Optional.e(list);
            return this;
        }

        public SubPoi setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public SubPoi setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public SubPoi setLatitude(double d) {
            this.latitude = Optional.e(Double.valueOf(d));
            return this;
        }

        public SubPoi setLongitude(double d) {
            this.longitude = Optional.e(Double.valueOf(d));
            return this;
        }

        @Required
        public SubPoi setName(String str) {
            this.name = str;
            return this;
        }

        public SubPoi(String str, String str2) {
            this.name = str;
            this.address = str2;
        }
    }

    public static class Route {

        @Required
        private double distance;

        @Required
        private double time;
        private Optional<Double> charge = Optional.a();
        private Optional<Integer> traffic_light = Optional.a();
        private Optional<Double> power = Optional.a();
        private Optional<List<String>> feature = Optional.a();
        private Optional<Boolean> is_current_route = Optional.a();
        private Optional<Long> route_id = Optional.a();
        private Optional<Integer> energy_sum = Optional.a();

        public Route() {
        }

        public Optional<Double> getCharge() {
            return this.charge;
        }

        @Required
        public double getDistance() {
            return this.distance;
        }

        public Optional<Integer> getEnergySum() {
            return this.energy_sum;
        }

        public Optional<List<String>> getFeature() {
            return this.feature;
        }

        public Optional<Double> getPower() {
            return this.power;
        }

        public Optional<Long> getRouteId() {
            return this.route_id;
        }

        @Required
        public double getTime() {
            return this.time;
        }

        public Optional<Integer> getTrafficLight() {
            return this.traffic_light;
        }

        public Optional<Boolean> isCurrentRoute() {
            return this.is_current_route;
        }

        public Route setCharge(double d) {
            this.charge = Optional.e(Double.valueOf(d));
            return this;
        }

        @Required
        public Route setDistance(double d) {
            this.distance = d;
            return this;
        }

        public Route setEnergySum(int i) {
            this.energy_sum = Optional.e(Integer.valueOf(i));
            return this;
        }

        public Route setFeature(List<String> list) {
            this.feature = Optional.e(list);
            return this;
        }

        public Route setIsCurrentRoute(boolean z) {
            this.is_current_route = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Route setPower(double d) {
            this.power = Optional.e(Double.valueOf(d));
            return this;
        }

        public Route setRouteId(long j) {
            this.route_id = Optional.e(Long.valueOf(j));
            return this;
        }

        @Required
        public Route setTime(double d) {
            this.time = d;
            return this;
        }

        public Route setTrafficLight(int i) {
            this.traffic_light = Optional.e(Integer.valueOf(i));
            return this;
        }

        public Route(double d, double d2) {
            this.time = d;
            this.distance = d2;
        }
    }

    public static class MapSearchPoi {

        @Required
        private String address;

        @Required
        private String distance;

        @Required
        private int label_type;

        @Required
        private double latitude;

        @Required
        private double longitude;

        @Required
        private String name;

        @Required
        private String poi_id;

        @Required
        private String type_code;
        private Optional<String> alias_name = Optional.a();
        private Optional<String> tel = Optional.a();
        private Optional<String> tag = Optional.a();
        private Optional<String> rating = Optional.a();
        private Optional<String> deep_price = Optional.a();
        private Optional<String> park_day_charge = Optional.a();
        private Optional<String> park_night_charge = Optional.a();
        private Optional<ChargingStationSearchInfo> charging_station_info = Optional.a();
        private Optional<String> distance_to_via = Optional.a();
        private Optional<List<PoiEntry>> entry_list = Optional.a();
        private Optional<List<ChildPoi>> child_poi_list = Optional.a();
        private Optional<String> ad_code = Optional.a();
        private Optional<String> open_hours = Optional.a();

        public MapSearchPoi() {
        }

        public Optional<String> getAdCode() {
            return this.ad_code;
        }

        @Required
        public String getAddress() {
            return this.address;
        }

        public Optional<String> getAliasName() {
            return this.alias_name;
        }

        public Optional<ChargingStationSearchInfo> getChargingStationInfo() {
            return this.charging_station_info;
        }

        public Optional<List<ChildPoi>> getChildPoiList() {
            return this.child_poi_list;
        }

        public Optional<String> getDeepPrice() {
            return this.deep_price;
        }

        @Required
        public String getDistance() {
            return this.distance;
        }

        public Optional<String> getDistanceToVia() {
            return this.distance_to_via;
        }

        public Optional<List<PoiEntry>> getEntryList() {
            return this.entry_list;
        }

        @Required
        public int getLabelType() {
            return this.label_type;
        }

        @Required
        public double getLatitude() {
            return this.latitude;
        }

        @Required
        public double getLongitude() {
            return this.longitude;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getOpenHours() {
            return this.open_hours;
        }

        public Optional<String> getParkDayCharge() {
            return this.park_day_charge;
        }

        public Optional<String> getParkNightCharge() {
            return this.park_night_charge;
        }

        @Required
        public String getPoiId() {
            return this.poi_id;
        }

        public Optional<String> getRating() {
            return this.rating;
        }

        public Optional<String> getTag() {
            return this.tag;
        }

        public Optional<String> getTel() {
            return this.tel;
        }

        @Required
        public String getTypeCode() {
            return this.type_code;
        }

        public MapSearchPoi setAdCode(String str) {
            this.ad_code = Optional.e(str);
            return this;
        }

        @Required
        public MapSearchPoi setAddress(String str) {
            this.address = str;
            return this;
        }

        public MapSearchPoi setAliasName(String str) {
            this.alias_name = Optional.e(str);
            return this;
        }

        public MapSearchPoi setChargingStationInfo(ChargingStationSearchInfo chargingStationSearchInfo) {
            this.charging_station_info = Optional.e(chargingStationSearchInfo);
            return this;
        }

        public MapSearchPoi setChildPoiList(List<ChildPoi> list) {
            this.child_poi_list = Optional.e(list);
            return this;
        }

        public MapSearchPoi setDeepPrice(String str) {
            this.deep_price = Optional.e(str);
            return this;
        }

        @Required
        public MapSearchPoi setDistance(String str) {
            this.distance = str;
            return this;
        }

        public MapSearchPoi setDistanceToVia(String str) {
            this.distance_to_via = Optional.e(str);
            return this;
        }

        public MapSearchPoi setEntryList(List<PoiEntry> list) {
            this.entry_list = Optional.e(list);
            return this;
        }

        @Required
        public MapSearchPoi setLabelType(int i) {
            this.label_type = i;
            return this;
        }

        @Required
        public MapSearchPoi setLatitude(double d) {
            this.latitude = d;
            return this;
        }

        @Required
        public MapSearchPoi setLongitude(double d) {
            this.longitude = d;
            return this;
        }

        @Required
        public MapSearchPoi setName(String str) {
            this.name = str;
            return this;
        }

        public MapSearchPoi setOpenHours(String str) {
            this.open_hours = Optional.e(str);
            return this;
        }

        public MapSearchPoi setParkDayCharge(String str) {
            this.park_day_charge = Optional.e(str);
            return this;
        }

        public MapSearchPoi setParkNightCharge(String str) {
            this.park_night_charge = Optional.e(str);
            return this;
        }

        @Required
        public MapSearchPoi setPoiId(String str) {
            this.poi_id = str;
            return this;
        }

        public MapSearchPoi setRating(String str) {
            this.rating = Optional.e(str);
            return this;
        }

        public MapSearchPoi setTag(String str) {
            this.tag = Optional.e(str);
            return this;
        }

        public MapSearchPoi setTel(String str) {
            this.tel = Optional.e(str);
            return this;
        }

        @Required
        public MapSearchPoi setTypeCode(String str) {
            this.type_code = str;
            return this;
        }

        public MapSearchPoi(String str, String str2, String str3, String str4, String str5, double d, double d2, int i) {
            this.name = str;
            this.distance = str2;
            this.poi_id = str3;
            this.type_code = str4;
            this.address = str5;
            this.latitude = d;
            this.longitude = d2;
            this.label_type = i;
        }
    }

    public static class Poi {

        @Required
        private String address;

        @Required
        private String name;

        @Required
        private PoiType type;
        private Optional<String> id = Optional.a();
        private Optional<Double> longitude = Optional.a();
        private Optional<Double> latitude = Optional.a();
        private Optional<List<String>> alias = Optional.a();
        private Optional<Double> distance = Optional.a();
        private Optional<String> description = Optional.a();
        private Optional<List<SubPoi>> sub_pois = Optional.a();
        private Optional<Integer> adcode = Optional.a();
        private Optional<String> open_hours = Optional.a();
        private Optional<String> brand = Optional.a();
        private Optional<Double> averageCost = Optional.a();
        private Optional<Double> rating = Optional.a();
        private Optional<Long> sapa_detail = Optional.a();
        private Optional<Long> remain_time = Optional.a();
        private Optional<Integer> energy_consume = Optional.a();
        private Optional<String> service_poi_id = Optional.a();
        private Optional<String> type_code = Optional.a();
        private Optional<String> phone = Optional.a();

        public Poi() {
        }

        public Optional<Integer> getAdcode() {
            return this.adcode;
        }

        @Required
        public String getAddress() {
            return this.address;
        }

        public Optional<List<String>> getAlias() {
            return this.alias;
        }

        public Optional<Double> getAverageCost() {
            return this.averageCost;
        }

        public Optional<String> getBrand() {
            return this.brand;
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<Double> getDistance() {
            return this.distance;
        }

        public Optional<Integer> getEnergyConsume() {
            return this.energy_consume;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<Double> getLatitude() {
            return this.latitude;
        }

        public Optional<Double> getLongitude() {
            return this.longitude;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getOpenHours() {
            return this.open_hours;
        }

        public Optional<String> getPhone() {
            return this.phone;
        }

        public Optional<Double> getRating() {
            return this.rating;
        }

        public Optional<Long> getRemainTime() {
            return this.remain_time;
        }

        public Optional<Long> getSapaDetail() {
            return this.sapa_detail;
        }

        public Optional<String> getServicePoiId() {
            return this.service_poi_id;
        }

        public Optional<List<SubPoi>> getSubPois() {
            return this.sub_pois;
        }

        @Required
        public PoiType getType() {
            return this.type;
        }

        public Optional<String> getTypeCode() {
            return this.type_code;
        }

        public Poi setAdcode(int i) {
            this.adcode = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public Poi setAddress(String str) {
            this.address = str;
            return this;
        }

        public Poi setAlias(List<String> list) {
            this.alias = Optional.e(list);
            return this;
        }

        public Poi setAverageCost(double d) {
            this.averageCost = Optional.e(Double.valueOf(d));
            return this;
        }

        public Poi setBrand(String str) {
            this.brand = Optional.e(str);
            return this;
        }

        public Poi setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public Poi setDistance(double d) {
            this.distance = Optional.e(Double.valueOf(d));
            return this;
        }

        public Poi setEnergyConsume(int i) {
            this.energy_consume = Optional.e(Integer.valueOf(i));
            return this;
        }

        public Poi setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public Poi setLatitude(double d) {
            this.latitude = Optional.e(Double.valueOf(d));
            return this;
        }

        public Poi setLongitude(double d) {
            this.longitude = Optional.e(Double.valueOf(d));
            return this;
        }

        @Required
        public Poi setName(String str) {
            this.name = str;
            return this;
        }

        public Poi setOpenHours(String str) {
            this.open_hours = Optional.e(str);
            return this;
        }

        public Poi setPhone(String str) {
            this.phone = Optional.e(str);
            return this;
        }

        public Poi setRating(double d) {
            this.rating = Optional.e(Double.valueOf(d));
            return this;
        }

        public Poi setRemainTime(long j) {
            this.remain_time = Optional.e(Long.valueOf(j));
            return this;
        }

        public Poi setSapaDetail(long j) {
            this.sapa_detail = Optional.e(Long.valueOf(j));
            return this;
        }

        public Poi setServicePoiId(String str) {
            this.service_poi_id = Optional.e(str);
            return this;
        }

        public Poi setSubPois(List<SubPoi> list) {
            this.sub_pois = Optional.e(list);
            return this;
        }

        @Required
        public Poi setType(PoiType poiType) {
            this.type = poiType;
            return this;
        }

        public Poi setTypeCode(String str) {
            this.type_code = Optional.e(str);
            return this;
        }

        public Poi(PoiType poiType, String str, String str2) {
            this.type = poiType;
            this.name = str;
            this.address = str2;
        }
    }
}
