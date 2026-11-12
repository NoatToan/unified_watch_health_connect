package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Station {

    public enum StationMatchLevel {
        UNKNOWN(-1),
        ACCURATE(0),
        RECOMMEND(1);

        private int id;

        StationMatchLevel(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum StationResponseType {
        UNKNOWN(-1),
        SEARCH_LIST(0),
        SINGLE_CLICK(1);

        private int id;

        StationResponseType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class StationCard {

        @Required
        private String cp_package_name;
        private Optional<List<FullScreenTemplate.StationInfo>> station_info_list = Optional.a();

        public StationCard() {
        }

        @Required
        public String getCpPackageName() {
            return this.cp_package_name;
        }

        public Optional<List<FullScreenTemplate.StationInfo>> getStationInfoList() {
            return this.station_info_list;
        }

        @Required
        public StationCard setCpPackageName(String str) {
            this.cp_package_name = str;
            return this;
        }

        public StationCard setStationInfoList(List<FullScreenTemplate.StationInfo> list) {
            this.station_info_list = Optional.e(list);
            return this;
        }

        public StationCard(String str) {
            this.cp_package_name = str;
        }
    }

    @NamespaceName(name = "DisplayDetails", namespace = AIApiConstants.Station.NAME)
    public static class DisplayDetails implements EventPayload {

        @Required
        private String id;
        private Optional<Integer> offset = Optional.a();
        private Optional<Integer> version = Optional.a();
        private Optional<String> ref = Optional.a();
        private Optional<String> cp = Optional.a();

        public DisplayDetails() {
        }

        public Optional<String> getCp() {
            return this.cp;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<Integer> getOffset() {
            return this.offset;
        }

        public Optional<String> getRef() {
            return this.ref;
        }

        public Optional<Integer> getVersion() {
            return this.version;
        }

        public DisplayDetails setCp(String str) {
            this.cp = Optional.e(str);
            return this;
        }

        @Required
        public DisplayDetails setId(String str) {
            this.id = str;
            return this;
        }

        public DisplayDetails setOffset(int i) {
            this.offset = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DisplayDetails setRef(String str) {
            this.ref = Optional.e(str);
            return this;
        }

        public DisplayDetails setVersion(int i) {
            this.version = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DisplayDetails(String str) {
            this.id = str;
        }
    }

    @NamespaceName(name = "ShowSearchPage", namespace = "station")
    public static class ShowSearchPage implements InstructionPayload {

        @Required
        private FullScreenTemplate.StationPageType page_type;
        private Optional<Template.Image> skill_icon = Optional.a();
        private Optional<FullScreenTemplate.StationResourceType> resource_type = Optional.a();
        private Optional<StationResponseType> response_type = Optional.a();
        private Optional<FullScreenTemplate.StationAlbumChapter> chapter = Optional.a();
        private Optional<List<StationCard>> station_card_list = Optional.a();
        private Optional<List<Template.AppEntity>> apps = Optional.a();
        private Optional<StationMatchLevel> match_level = Optional.a();

        public ShowSearchPage() {
        }

        public Optional<List<Template.AppEntity>> getApps() {
            return this.apps;
        }

        public Optional<FullScreenTemplate.StationAlbumChapter> getChapter() {
            return this.chapter;
        }

        public Optional<StationMatchLevel> getMatchLevel() {
            return this.match_level;
        }

        @Required
        public FullScreenTemplate.StationPageType getPageType() {
            return this.page_type;
        }

        public Optional<FullScreenTemplate.StationResourceType> getResourceType() {
            return this.resource_type;
        }

        public Optional<StationResponseType> getResponseType() {
            return this.response_type;
        }

        public Optional<Template.Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<List<StationCard>> getStationCardList() {
            return this.station_card_list;
        }

        public ShowSearchPage setApps(List<Template.AppEntity> list) {
            this.apps = Optional.e(list);
            return this;
        }

        public ShowSearchPage setChapter(FullScreenTemplate.StationAlbumChapter stationAlbumChapter) {
            this.chapter = Optional.e(stationAlbumChapter);
            return this;
        }

        public ShowSearchPage setMatchLevel(StationMatchLevel stationMatchLevel) {
            this.match_level = Optional.e(stationMatchLevel);
            return this;
        }

        @Required
        public ShowSearchPage setPageType(FullScreenTemplate.StationPageType stationPageType) {
            this.page_type = stationPageType;
            return this;
        }

        public ShowSearchPage setResourceType(FullScreenTemplate.StationResourceType stationResourceType) {
            this.resource_type = Optional.e(stationResourceType);
            return this;
        }

        public ShowSearchPage setResponseType(StationResponseType stationResponseType) {
            this.response_type = Optional.e(stationResponseType);
            return this;
        }

        public ShowSearchPage setSkillIcon(Template.Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public ShowSearchPage setStationCardList(List<StationCard> list) {
            this.station_card_list = Optional.e(list);
            return this;
        }

        public ShowSearchPage(FullScreenTemplate.StationPageType stationPageType) {
            this.page_type = stationPageType;
        }
    }
}
