package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class Education {

    @NamespaceName(name = "EduCurrentPageState", namespace = AIApiConstants.Education.NAME)
    public static class EduCurrentPageState implements ContextPayload {

        @Required
        private Video.PageType page_type;
        private Optional<List<EduSearchTag>> tags = Optional.empty();

        public EduCurrentPageState() {
        }

        public EduCurrentPageState(Video.PageType pageType) {
            this.page_type = pageType;
        }

        @Required
        public Video.PageType getPageType() {
            return this.page_type;
        }

        public Optional<List<EduSearchTag>> getTags() {
            return this.tags;
        }

        @Required
        public EduCurrentPageState setPageType(Video.PageType pageType) {
            this.page_type = pageType;
            return this;
        }

        public EduCurrentPageState setTags(List<EduSearchTag> list) {
            this.tags = Optional.ofNullable(list);
            return this;
        }
    }

    public static class EduSearchChildTag {

        @Required
        private boolean selected;
        private Optional<List<EduSearchSlot>> slots = Optional.empty();
        private Optional<List<EduSearchGrandTag>> tags = Optional.empty();

        @Required
        private String text;

        public EduSearchChildTag() {
        }

        public EduSearchChildTag(String str, boolean z) {
            this.text = str;
            this.selected = z;
        }

        public Optional<List<EduSearchSlot>> getSlots() {
            return this.slots;
        }

        public Optional<List<EduSearchGrandTag>> getTags() {
            return this.tags;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public boolean isSelected() {
            return this.selected;
        }

        @Required
        public EduSearchChildTag setSelected(boolean z) {
            this.selected = z;
            return this;
        }

        public EduSearchChildTag setSlots(List<EduSearchSlot> list) {
            this.slots = Optional.ofNullable(list);
            return this;
        }

        public EduSearchChildTag setTags(List<EduSearchGrandTag> list) {
            this.tags = Optional.ofNullable(list);
            return this;
        }

        @Required
        public EduSearchChildTag setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class EduSearchGrandTag {

        @Required
        private boolean selected;
        private Optional<List<EduSearchSlot>> slots = Optional.empty();

        @Required
        private String text;

        public EduSearchGrandTag() {
        }

        public EduSearchGrandTag(String str, boolean z) {
            this.text = str;
            this.selected = z;
        }

        public Optional<List<EduSearchSlot>> getSlots() {
            return this.slots;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public boolean isSelected() {
            return this.selected;
        }

        @Required
        public EduSearchGrandTag setSelected(boolean z) {
            this.selected = z;
            return this;
        }

        public EduSearchGrandTag setSlots(List<EduSearchSlot> list) {
            this.slots = Optional.ofNullable(list);
            return this;
        }

        @Required
        public EduSearchGrandTag setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class EduSearchSlot {

        @Required
        private String attribute;

        @Required
        private String value;

        public EduSearchSlot() {
        }

        public EduSearchSlot(String str, String str2) {
            this.attribute = str;
            this.value = str2;
        }

        @Required
        public String getAttribute() {
            return this.attribute;
        }

        @Required
        public String getValue() {
            return this.value;
        }

        @Required
        public EduSearchSlot setAttribute(String str) {
            this.attribute = str;
            return this;
        }

        @Required
        public EduSearchSlot setValue(String str) {
            this.value = str;
            return this;
        }
    }

    public static class EduSearchTag {

        @Required
        private boolean selected;
        private Optional<List<EduSearchSlot>> slots = Optional.empty();
        private Optional<List<EduSearchChildTag>> tags = Optional.empty();

        @Required
        private String text;

        public EduSearchTag() {
        }

        public EduSearchTag(String str, boolean z) {
            this.text = str;
            this.selected = z;
        }

        public Optional<List<EduSearchSlot>> getSlots() {
            return this.slots;
        }

        public Optional<List<EduSearchChildTag>> getTags() {
            return this.tags;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public boolean isSelected() {
            return this.selected;
        }

        @Required
        public EduSearchTag setSelected(boolean z) {
            this.selected = z;
            return this;
        }

        public EduSearchTag setSlots(List<EduSearchSlot> list) {
            this.slots = Optional.ofNullable(list);
            return this;
        }

        public EduSearchTag setTags(List<EduSearchChildTag> list) {
            this.tags = Optional.ofNullable(list);
            return this;
        }

        @Required
        public EduSearchTag setText(String str) {
            this.text = str;
            return this;
        }
    }

    @NamespaceName(name = "EduSearchTagsReset", namespace = AIApiConstants.Education.NAME)
    public static class EduSearchTagsReset implements EventPayload {

        @Required
        private List<EduSearchTag> tags;

        public EduSearchTagsReset() {
        }

        public EduSearchTagsReset(List<EduSearchTag> list) {
            this.tags = list;
        }

        @Required
        public List<EduSearchTag> getTags() {
            return this.tags;
        }

        @Required
        public EduSearchTagsReset setTags(List<EduSearchTag> list) {
            this.tags = list;
            return this;
        }
    }

    @NamespaceName(name = "EduShowSearchPage", namespace = AIApiConstants.Education.NAME)
    public static class EduShowSearchPage implements InstructionPayload {

        @Required
        private List<Video.VideoSearchItem> items;
        private Optional<List<EduSearchTag>> tags = Optional.empty();
        private Optional<Integer> total_size = Optional.empty();
        private Optional<SearchAccuracy> accuracy = Optional.empty();
        private Optional<Common.LoadmoreInfo> loadmore_info = Optional.empty();
        private Optional<Common.PageLoadType> load_type = Optional.empty();
        private Optional<List<EduVideoSearchItem>> items_more_info = Optional.empty();
        private Optional<List<Template.JumpItem>> jump_items = Optional.empty();
        private Optional<Template.Image> skill_icon = Optional.empty();

        public EduShowSearchPage() {
        }

        public EduShowSearchPage(List<Video.VideoSearchItem> list) {
            this.items = list;
        }

        public Optional<SearchAccuracy> getAccuracy() {
            return this.accuracy;
        }

        @Required
        public List<Video.VideoSearchItem> getItems() {
            return this.items;
        }

        public Optional<List<EduVideoSearchItem>> getItemsMoreInfo() {
            return this.items_more_info;
        }

        public Optional<List<Template.JumpItem>> getJumpItems() {
            return this.jump_items;
        }

        public Optional<Common.PageLoadType> getLoadType() {
            return this.load_type;
        }

        public Optional<Common.LoadmoreInfo> getLoadmoreInfo() {
            return this.loadmore_info;
        }

        public Optional<Template.Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<List<EduSearchTag>> getTags() {
            return this.tags;
        }

        public Optional<Integer> getTotalSize() {
            return this.total_size;
        }

        public EduShowSearchPage setAccuracy(SearchAccuracy searchAccuracy) {
            this.accuracy = Optional.ofNullable(searchAccuracy);
            return this;
        }

        @Required
        public EduShowSearchPage setItems(List<Video.VideoSearchItem> list) {
            this.items = list;
            return this;
        }

        public EduShowSearchPage setItemsMoreInfo(List<EduVideoSearchItem> list) {
            this.items_more_info = Optional.ofNullable(list);
            return this;
        }

        public EduShowSearchPage setJumpItems(List<Template.JumpItem> list) {
            this.jump_items = Optional.ofNullable(list);
            return this;
        }

        public EduShowSearchPage setLoadType(Common.PageLoadType pageLoadType) {
            this.load_type = Optional.ofNullable(pageLoadType);
            return this;
        }

        public EduShowSearchPage setLoadmoreInfo(Common.LoadmoreInfo loadmoreInfo) {
            this.loadmore_info = Optional.ofNullable(loadmoreInfo);
            return this;
        }

        public EduShowSearchPage setSkillIcon(Template.Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }

        public EduShowSearchPage setTags(List<EduSearchTag> list) {
            this.tags = Optional.ofNullable(list);
            return this;
        }

        public EduShowSearchPage setTotalSize(int i) {
            this.total_size = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public static class EduVideoSearchItem {

        @Required
        private int index;
        private Optional<EduVideoVipType> vip_type = Optional.empty();

        public EduVideoSearchItem() {
        }

        public EduVideoSearchItem(int i) {
            this.index = i;
        }

        @Required
        public int getIndex() {
            return this.index;
        }

        public Optional<EduVideoVipType> getVipType() {
            return this.vip_type;
        }

        @Required
        public EduVideoSearchItem setIndex(int i) {
            this.index = i;
            return this;
        }

        public EduVideoSearchItem setVipType(EduVideoVipType eduVideoVipType) {
            this.vip_type = Optional.ofNullable(eduVideoVipType);
            return this;
        }
    }

    public enum EduVideoVipType {
        UNKNOWN(0),
        PRIMARY(1),
        JUNIOR(2),
        HIGH(3);

        private int id;

        EduVideoVipType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SearchAccuracy {
        FAIL(-1),
        ACCURATE(0),
        FUZZY(1),
        FALLDOWN(2),
        RECOMMEND(3);

        private int id;

        SearchAccuracy(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }
}
