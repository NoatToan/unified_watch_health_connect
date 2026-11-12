package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MultiModal {

    @NamespaceName(name = "AiSearch", namespace = AIApiConstants.MultiModal.NAME)
    public static class AiSearch implements InstructionPayload {
        private Optional<String> query = Optional.a();
        private Optional<List<String>> keywords = Optional.a();
        private Optional<String> relation = Optional.a();
        private Optional<String> relation_desc = Optional.a();
        private Optional<Boolean> l4_tag = Optional.a();
        private Optional<String> entity = Optional.a();
        private Optional<UseAiMemoryScene> scene = Optional.a();

        public Optional<String> getEntity() {
            return this.entity;
        }

        public Optional<List<String>> getKeywords() {
            return this.keywords;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<String> getRelation() {
            return this.relation;
        }

        public Optional<String> getRelationDesc() {
            return this.relation_desc;
        }

        public Optional<UseAiMemoryScene> getScene() {
            return this.scene;
        }

        public Optional<Boolean> isL4Tag() {
            return this.l4_tag;
        }

        public AiSearch setEntity(String str) {
            this.entity = Optional.e(str);
            return this;
        }

        public AiSearch setKeywords(List<String> list) {
            this.keywords = Optional.e(list);
            return this;
        }

        public AiSearch setL4Tag(boolean z) {
            this.l4_tag = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AiSearch setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public AiSearch setRelation(String str) {
            this.relation = Optional.e(str);
            return this;
        }

        public AiSearch setRelationDesc(String str) {
            this.relation_desc = Optional.e(str);
            return this;
        }

        public AiSearch setScene(UseAiMemoryScene useAiMemoryScene) {
            this.scene = Optional.e(useAiMemoryScene);
            return this;
        }
    }

    public static class CarIdentifyCoordinate {

        @Required
        private long h_scale;

        @Required
        private long w_scale;

        @Required
        private long x;

        @Required
        private long y;

        public CarIdentifyCoordinate() {
        }

        public CarIdentifyCoordinate(long j, long j2, long j3, long j4) {
            this.x = j;
            this.y = j2;
            this.w_scale = j3;
            this.h_scale = j4;
        }

        @Required
        public long getHScale() {
            return this.h_scale;
        }

        @Required
        public long getWScale() {
            return this.w_scale;
        }

        @Required
        public long getX() {
            return this.x;
        }

        @Required
        public long getY() {
            return this.y;
        }

        @Required
        public CarIdentifyCoordinate setHScale(long j) {
            this.h_scale = j;
            return this;
        }

        @Required
        public CarIdentifyCoordinate setWScale(long j) {
            this.w_scale = j;
            return this;
        }

        @Required
        public CarIdentifyCoordinate setX(long j) {
            this.x = j;
            return this;
        }

        @Required
        public CarIdentifyCoordinate setY(long j) {
            this.y = j;
            return this;
        }
    }

    public enum CarIdentifyLocation {
        UNKNOWN(-1),
        FRONT(0);

        private int id;

        CarIdentifyLocation(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "CarIdentifyResult", namespace = AIApiConstants.MultiModal.NAME)
    public static class CarIdentifyResult implements InstructionPayload {

        @Required
        private int image_index;

        @Required
        private List<CarIdentifyItem> item_list;

        public CarIdentifyResult() {
        }

        public CarIdentifyResult(int i, List<CarIdentifyItem> list) {
            this.image_index = i;
            this.item_list = list;
        }

        @Required
        public int getImageIndex() {
            return this.image_index;
        }

        @Required
        public List<CarIdentifyItem> getItemList() {
            return this.item_list;
        }

        @Required
        public CarIdentifyResult setImageIndex(int i) {
            this.image_index = i;
            return this;
        }

        @Required
        public CarIdentifyResult setItemList(List<CarIdentifyItem> list) {
            this.item_list = list;
            return this;
        }
    }

    public static class CarSeatInfo {

        @Required
        private AutoController.Position position;

        @Required
        private CarSeatStatus seat_status;

        public CarSeatInfo() {
        }

        public CarSeatInfo(AutoController.Position position, CarSeatStatus carSeatStatus) {
            this.position = position;
            this.seat_status = carSeatStatus;
        }

        @Required
        public AutoController.Position getPosition() {
            return this.position;
        }

        @Required
        public CarSeatStatus getSeatStatus() {
            return this.seat_status;
        }

        @Required
        public CarSeatInfo setPosition(AutoController.Position position) {
            this.position = position;
            return this;
        }

        @Required
        public CarSeatInfo setSeatStatus(CarSeatStatus carSeatStatus) {
            this.seat_status = carSeatStatus;
            return this;
        }
    }

    public enum CarSeatStatus {
        UNKNOWN(-1),
        EMPTY(0),
        OCCUPIED(1);

        private int id;

        CarSeatStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DriverGazeArea {
        UNKNOWN(-1),
        GAZE_AREA_OTHER(0),
        GAZE_AREA_FRONT_WINDSHIELD(1),
        GAZE_AREA_LEFT_REAR_MIRROR(2),
        GAZE_AREA_RIGHT_REAR_MIRROR(3),
        GAZE_AREA_REAR_MIRROR(4),
        GAZE_AREA_CENTRAL_CONTROL_PANNEL(5),
        GAZE_AREA_DASHBOARD(6),
        GAZE_AREA_FRONT_PASSENGER_SEAT_WINDSHIELD(7),
        GAZE_AREA_FRONT_PASSENGER_SEAT(8);

        private int id;

        DriverGazeArea(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class DriverGazeAreaInfo {

        @Required
        private int confidence;

        @Required
        private DriverGazeArea gaze_area;

        public DriverGazeAreaInfo() {
        }

        public DriverGazeAreaInfo(DriverGazeArea driverGazeArea, int i) {
            this.gaze_area = driverGazeArea;
            this.confidence = i;
        }

        @Required
        public int getConfidence() {
            return this.confidence;
        }

        @Required
        public DriverGazeArea getGazeArea() {
            return this.gaze_area;
        }

        @Required
        public DriverGazeAreaInfo setConfidence(int i) {
            this.confidence = i;
            return this;
        }

        @Required
        public DriverGazeAreaInfo setGazeArea(DriverGazeArea driverGazeArea) {
            this.gaze_area = driverGazeArea;
            return this;
        }
    }

    public static class DriverHoldPhoneInfo {

        @Required
        private int confidence;

        @Required
        private DriverHoldPhonePosition position;

        public DriverHoldPhoneInfo() {
        }

        public DriverHoldPhoneInfo(DriverHoldPhonePosition driverHoldPhonePosition, int i) {
            this.position = driverHoldPhonePosition;
            this.confidence = i;
        }

        @Required
        public int getConfidence() {
            return this.confidence;
        }

        @Required
        public DriverHoldPhonePosition getPosition() {
            return this.position;
        }

        @Required
        public DriverHoldPhoneInfo setConfidence(int i) {
            this.confidence = i;
            return this;
        }

        @Required
        public DriverHoldPhoneInfo setPosition(DriverHoldPhonePosition driverHoldPhonePosition) {
            this.position = driverHoldPhonePosition;
            return this;
        }
    }

    public enum DriverHoldPhonePosition {
        UNKNOWN(-1),
        HOLD_PHONE_POSITION_NO_PHONE(0),
        HOLD_PHONE_POSITION_LEFT_EAR(1),
        HOLD_PHONE_POSITION_RIGHT_EAR(2),
        HOLD_PHONE_POSITION_MOUTH(3);

        private int id;

        DriverHoldPhonePosition(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class DriverInfo {
        private Optional<DriverHoldPhoneInfo> hold_phone_position = Optional.a();
        private Optional<DriverGazeAreaInfo> gaze_area = Optional.a();

        public Optional<DriverGazeAreaInfo> getGazeArea() {
            return this.gaze_area;
        }

        public Optional<DriverHoldPhoneInfo> getHoldPhonePosition() {
            return this.hold_phone_position;
        }

        public DriverInfo setGazeArea(DriverGazeAreaInfo driverGazeAreaInfo) {
            this.gaze_area = Optional.e(driverGazeAreaInfo);
            return this;
        }

        public DriverInfo setHoldPhonePosition(DriverHoldPhoneInfo driverHoldPhoneInfo) {
            this.hold_phone_position = Optional.e(driverHoldPhoneInfo);
            return this;
        }
    }

    @NamespaceName(name = "ExecutionResult", namespace = AIApiConstants.MultiModal.NAME)
    public static class ExecutionResult implements InstructionPayload {

        @Required
        private List<ExecutionResultDetail> results;

        public ExecutionResult() {
        }

        public ExecutionResult(List<ExecutionResultDetail> list) {
            this.results = list;
        }

        @Required
        public List<ExecutionResultDetail> getResults() {
            return this.results;
        }

        @Required
        public ExecutionResult setResults(List<ExecutionResultDetail> list) {
            this.results = list;
            return this;
        }
    }

    public static class ExecutionResultDetail {

        @Required
        private boolean is_success;

        @Required
        private FeatureName name;

        public ExecutionResultDetail() {
        }

        public ExecutionResultDetail(FeatureName featureName, boolean z) {
            this.name = featureName;
            this.is_success = z;
        }

        @Required
        public FeatureName getName() {
            return this.name;
        }

        @Required
        public boolean isSuccess() {
            return this.is_success;
        }

        @Required
        public ExecutionResultDetail setIsSuccess(boolean z) {
            this.is_success = z;
            return this;
        }

        @Required
        public ExecutionResultDetail setName(FeatureName featureName) {
            this.name = featureName;
            return this;
        }
    }

    public static class EyeContactInfo {

        @Required
        private boolean has_face;

        @Required
        private boolean is_eye_open;

        public EyeContactInfo() {
        }

        public EyeContactInfo(boolean z, boolean z2) {
            this.has_face = z;
            this.is_eye_open = z2;
        }

        @Required
        public boolean isEyeOpen() {
            return this.is_eye_open;
        }

        @Required
        public boolean isHasFace() {
            return this.has_face;
        }

        @Required
        public EyeContactInfo setHasFace(boolean z) {
            this.has_face = z;
            return this;
        }

        @Required
        public EyeContactInfo setIsEyeOpen(boolean z) {
            this.is_eye_open = z;
            return this;
        }
    }

    @NamespaceName(name = "EyeContactRecognizeResult", namespace = AIApiConstants.MultiModal.NAME)
    public static class EyeContactRecognizeResult implements EventPayload {

        @Required
        private List<EyeContactInfo> results;

        public EyeContactRecognizeResult() {
        }

        public EyeContactRecognizeResult(List<EyeContactInfo> list) {
            this.results = list;
        }

        @Required
        public List<EyeContactInfo> getResults() {
            return this.results;
        }

        @Required
        public EyeContactRecognizeResult setResults(List<EyeContactInfo> list) {
            this.results = list;
            return this;
        }
    }

    public static class FaceParam {
        private Optional<Integer> age = Optional.a();
        private Optional<Integer> distance = Optional.a();
        private Optional<Integer> eye_right_y = Optional.a();
        private Optional<Integer> eye_right_x = Optional.a();
        private Optional<Integer> eye_left_y = Optional.a();
        private Optional<Integer> eye_left_x = Optional.a();

        public Optional<Integer> getAge() {
            return this.age;
        }

        public Optional<Integer> getDistance() {
            return this.distance;
        }

        public Optional<Integer> getEyeLeftX() {
            return this.eye_left_x;
        }

        public Optional<Integer> getEyeLeftY() {
            return this.eye_left_y;
        }

        public Optional<Integer> getEyeRightX() {
            return this.eye_right_x;
        }

        public Optional<Integer> getEyeRightY() {
            return this.eye_right_y;
        }

        public FaceParam setAge(int i) {
            this.age = Optional.e(Integer.valueOf(i));
            return this;
        }

        public FaceParam setDistance(int i) {
            this.distance = Optional.e(Integer.valueOf(i));
            return this;
        }

        public FaceParam setEyeLeftX(int i) {
            this.eye_left_x = Optional.e(Integer.valueOf(i));
            return this;
        }

        public FaceParam setEyeLeftY(int i) {
            this.eye_left_y = Optional.e(Integer.valueOf(i));
            return this;
        }

        public FaceParam setEyeRightX(int i) {
            this.eye_right_x = Optional.e(Integer.valueOf(i));
            return this;
        }

        public FaceParam setEyeRightY(int i) {
            this.eye_right_y = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public enum FeatureName {
        UNKNOWN(-1),
        EYE_CONTACT_WAKEUP(0),
        MORNING_GREET(1);

        private int id;

        FeatureName(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class GestureParam {

        @Required
        private GestureType type;

        public GestureParam() {
        }

        public GestureParam(GestureType gestureType) {
            this.type = gestureType;
        }

        @Required
        public GestureType getType() {
            return this.type;
        }

        @Required
        public GestureParam setType(GestureType gestureType) {
            this.type = gestureType;
            return this;
        }
    }

    public enum GestureType {
        INVALID(-1),
        OK(0),
        FAST_BACKWARD(1),
        FAST_FORWARD(2),
        STOP(3),
        THUMS_UP(4);

        private int id;

        GestureType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class HumanDetectionParam {

        @Required
        private boolean human_detected;

        public HumanDetectionParam() {
        }

        public HumanDetectionParam(boolean z) {
            this.human_detected = z;
        }

        @Required
        public boolean isHumanDetected() {
            return this.human_detected;
        }

        @Required
        public HumanDetectionParam setHumanDetected(boolean z) {
            this.human_detected = z;
            return this;
        }
    }

    public enum ImageDecodeAlgo {
        UNKNOWN(-1),
        HUMAN_DETECTION(0);

        private int id;

        ImageDecodeAlgo(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ImageFormat {
        UNKNOWN(-1),
        JPEG(0),
        PNG(1);

        private int id;

        ImageFormat(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ImageStreamFinished", namespace = AIApiConstants.MultiModal.NAME)
    public static class ImageStreamFinished implements EventPayload {
    }

    @NamespaceName(name = "ImageStreamStarted", namespace = AIApiConstants.MultiModal.NAME)
    public static class ImageStreamStarted implements EventPayload {
        private Optional<Boolean> storage_only = Optional.a();
        private Optional<Boolean> need_encrypt = Optional.a();

        public Optional<Boolean> isNeedEncrypt() {
            return this.need_encrypt;
        }

        public Optional<Boolean> isStorageOnly() {
            return this.storage_only;
        }

        public ImageStreamStarted setNeedEncrypt(boolean z) {
            this.need_encrypt = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ImageStreamStarted setStorageOnly(boolean z) {
            this.storage_only = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class Line {
        private Optional<String> line_text = Optional.a();
        private Optional<Integer> line_id = Optional.a();
        private Optional<Float> line_confidence = Optional.a();
        private Optional<Location> location = Optional.a();
        private Optional<List<SingleChar>> character = Optional.a();

        public Optional<List<SingleChar>> getCharacter() {
            return this.character;
        }

        public Optional<Float> getLineConfidence() {
            return this.line_confidence;
        }

        public Optional<Integer> getLineId() {
            return this.line_id;
        }

        public Optional<String> getLineText() {
            return this.line_text;
        }

        public Optional<Location> getLocation() {
            return this.location;
        }

        public Line setCharacter(List<SingleChar> list) {
            this.character = Optional.e(list);
            return this;
        }

        public Line setLineConfidence(float f) {
            this.line_confidence = Optional.e(Float.valueOf(f));
            return this;
        }

        public Line setLineId(int i) {
            this.line_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public Line setLineText(String str) {
            this.line_text = Optional.e(str);
            return this;
        }

        public Line setLocation(Location location) {
            this.location = Optional.e(location);
            return this;
        }
    }

    @NamespaceName(name = "LoadXiaoAiImage", namespace = AIApiConstants.MultiModal.NAME)
    public static class LoadXiaoAiImage implements InstructionPayload {
        private Optional<String> taskId = Optional.a();
        private Optional<String> fileId = Optional.a();
        private Optional<String> url = Optional.a();

        public Optional<String> getFileId() {
            return this.fileId;
        }

        public Optional<String> getTaskId() {
            return this.taskId;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public LoadXiaoAiImage setFileId(String str) {
            this.fileId = Optional.e(str);
            return this;
        }

        public LoadXiaoAiImage setTaskId(String str) {
            this.taskId = Optional.e(str);
            return this;
        }

        public LoadXiaoAiImage setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }
    }

    public static class Location {
        private Optional<List<Float>> poly = Optional.a();
        private Optional<List<Float>> box = Optional.a();

        public Optional<List<Float>> getBox() {
            return this.box;
        }

        public Optional<List<Float>> getPoly() {
            return this.poly;
        }

        public Location setBox(List<Float> list) {
            this.box = Optional.e(list);
            return this;
        }

        public Location setPoly(List<Float> list) {
            this.poly = Optional.e(list);
            return this;
        }
    }

    public static class MultiModalContent {
        private Optional<String> id = Optional.a();
        private Optional<String> title = Optional.a();
        private Optional<MultiModalContentTag> tag = Optional.a();
        private Optional<MultiModalContentImageTask> task = Optional.a();
        private Optional<MultiModalContentScene> content_scene = Optional.a();
        private Optional<Boolean> again = Optional.a();

        public Optional<MultiModalContentScene> getContentScene() {
            return this.content_scene;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<MultiModalContentTag> getTag() {
            return this.tag;
        }

        public Optional<MultiModalContentImageTask> getTask() {
            return this.task;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public Optional<Boolean> isAgain() {
            return this.again;
        }

        public MultiModalContent setAgain(boolean z) {
            this.again = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public MultiModalContent setContentScene(MultiModalContentScene multiModalContentScene) {
            this.content_scene = Optional.e(multiModalContentScene);
            return this;
        }

        public MultiModalContent setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public MultiModalContent setTag(MultiModalContentTag multiModalContentTag) {
            this.tag = Optional.e(multiModalContentTag);
            return this;
        }

        public MultiModalContent setTask(MultiModalContentImageTask multiModalContentImageTask) {
            this.task = Optional.e(multiModalContentImageTask);
            return this;
        }

        public MultiModalContent setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }
    }

    public enum MultiModalContentImageTask {
        UNKNOWN(-1),
        CHANGE_BACKGROUND(0),
        EXPAND_IMAGE(1),
        PASSER_ERASE(2),
        CHANGE_STYLE(3);

        private int id;

        MultiModalContentImageTask(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MultiModalContentScene {
        UNKNOWN(-1),
        EDIT_IMG(0),
        UNDERSTAND_IMG(1),
        CREATE_IMG(2);

        private int id;

        MultiModalContentScene(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MultiModalContentTag {
        UNKNOWN(-1),
        MI_CAR(0);

        private int id;

        MultiModalContentTag(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "MultiModalContext", namespace = AIApiConstants.MultiModal.NAME)
    public static class MultiModalContext implements ContextPayload {
        private Optional<List<ResourceInfo>> doc_infos = Optional.a();
        private Optional<List<ResourceInfo>> image_infos = Optional.a();
        private Optional<List<ResourceInfo>> note_infos = Optional.a();
        private Optional<List<ResourceInfo>> recording_infos = Optional.a();
        private Optional<List<ResourceInfo>> message_infos = Optional.a();
        private Optional<List<ResourceType>> orders = Optional.a();

        public Optional<List<ResourceInfo>> getDocInfos() {
            return this.doc_infos;
        }

        public Optional<List<ResourceInfo>> getImageInfos() {
            return this.image_infos;
        }

        public Optional<List<ResourceInfo>> getMessageInfos() {
            return this.message_infos;
        }

        public Optional<List<ResourceInfo>> getNoteInfos() {
            return this.note_infos;
        }

        public Optional<List<ResourceType>> getOrders() {
            return this.orders;
        }

        public Optional<List<ResourceInfo>> getRecordingInfos() {
            return this.recording_infos;
        }

        public MultiModalContext setDocInfos(List<ResourceInfo> list) {
            this.doc_infos = Optional.e(list);
            return this;
        }

        public MultiModalContext setImageInfos(List<ResourceInfo> list) {
            this.image_infos = Optional.e(list);
            return this;
        }

        public MultiModalContext setMessageInfos(List<ResourceInfo> list) {
            this.message_infos = Optional.e(list);
            return this;
        }

        public MultiModalContext setNoteInfos(List<ResourceInfo> list) {
            this.note_infos = Optional.e(list);
            return this;
        }

        public MultiModalContext setOrders(List<ResourceType> list) {
            this.orders = Optional.e(list);
            return this;
        }

        public MultiModalContext setRecordingInfos(List<ResourceInfo> list) {
            this.recording_infos = Optional.e(list);
            return this;
        }
    }

    public static class MultiModalParam {
        private Optional<ResourceType> resource_type = Optional.a();
        private Optional<MultiModalContent> multi_modal_content = Optional.a();

        public Optional<MultiModalContent> getMultiModalContent() {
            return this.multi_modal_content;
        }

        public Optional<ResourceType> getResourceType() {
            return this.resource_type;
        }

        public MultiModalParam setMultiModalContent(MultiModalContent multiModalContent) {
            this.multi_modal_content = Optional.e(multiModalContent);
            return this;
        }

        public MultiModalParam setResourceType(ResourceType resourceType) {
            this.resource_type = Optional.e(resourceType);
            return this;
        }
    }

    public enum MultiModalScenesCode {
        UNKNOWN(-1),
        EXCEED_SEARCH_RESULT_INDEX(0);

        private int id;

        MultiModalScenesCode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class MultiModalScenesMessage {

        @Required
        private MultiModalScenesCode code;

        @Required
        private String message;

        public MultiModalScenesMessage() {
        }

        public MultiModalScenesMessage(MultiModalScenesCode multiModalScenesCode, String str) {
            this.code = multiModalScenesCode;
            this.message = str;
        }

        @Required
        public MultiModalScenesCode getCode() {
            return this.code;
        }

        @Required
        public String getMessage() {
            return this.message;
        }

        @Required
        public MultiModalScenesMessage setCode(MultiModalScenesCode multiModalScenesCode) {
            this.code = multiModalScenesCode;
            return this;
        }

        @Required
        public MultiModalScenesMessage setMessage(String str) {
            this.message = str;
            return this;
        }
    }

    @NamespaceName(name = "MultiModalState", namespace = AIApiConstants.MultiModal.NAME)
    public static class MultiModalState implements ContextPayload {
        private Optional<CarSeatInfo> car_seat = Optional.a();
        private Optional<DriverInfo> driver_info = Optional.a();
        private Optional<Boolean> is_from_suggestion = Optional.a();

        public Optional<CarSeatInfo> getCarSeat() {
            return this.car_seat;
        }

        public Optional<DriverInfo> getDriverInfo() {
            return this.driver_info;
        }

        public Optional<Boolean> isFromSuggestion() {
            return this.is_from_suggestion;
        }

        public MultiModalState setCarSeat(CarSeatInfo carSeatInfo) {
            this.car_seat = Optional.e(carSeatInfo);
            return this;
        }

        public MultiModalState setDriverInfo(DriverInfo driverInfo) {
            this.driver_info = Optional.e(driverInfo);
            return this;
        }

        public MultiModalState setIsFromSuggestion(boolean z) {
            this.is_from_suggestion = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class OCR {
        private Optional<String> total_text = Optional.a();
        private Optional<Paragraph> paragraph = Optional.a();
        private Optional<List<OCREntity>> entities = Optional.a();

        public Optional<List<OCREntity>> getEntities() {
            return this.entities;
        }

        public Optional<Paragraph> getParagraph() {
            return this.paragraph;
        }

        public Optional<String> getTotalText() {
            return this.total_text;
        }

        public OCR setEntities(List<OCREntity> list) {
            this.entities = Optional.e(list);
            return this;
        }

        public OCR setParagraph(Paragraph paragraph) {
            this.paragraph = Optional.e(paragraph);
            return this;
        }

        public OCR setTotalText(String str) {
            this.total_text = Optional.e(str);
            return this;
        }
    }

    public static class OCREntity {

        @Required
        private String content;

        @Required
        private OCREntityType entity_type;

        public OCREntity() {
        }

        public OCREntity(OCREntityType oCREntityType, String str) {
            this.entity_type = oCREntityType;
            this.content = str;
        }

        @Required
        public String getContent() {
            return this.content;
        }

        @Required
        public OCREntityType getEntityType() {
            return this.entity_type;
        }

        @Required
        public OCREntity setContent(String str) {
            this.content = str;
            return this;
        }

        @Required
        public OCREntity setEntityType(OCREntityType oCREntityType) {
            this.entity_type = oCREntityType;
            return this;
        }
    }

    public enum OCREntityType {
        UNKNOWN(-1),
        NUMBER(0),
        ADDRESS(1);

        private int id;

        OCREntityType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "OpenMultiModal", namespace = AIApiConstants.MultiModal.NAME)
    public static class OpenMultiModal implements InstructionPayload {
        private Optional<Integer> index = Optional.a();
        private Optional<ResourceType> resource_type = Optional.a();
        private Optional<List<MultiModalScenesMessage>> scenes_message = Optional.a();

        public Optional<Integer> getIndex() {
            return this.index;
        }

        public Optional<ResourceType> getResourceType() {
            return this.resource_type;
        }

        public Optional<List<MultiModalScenesMessage>> getScenesMessage() {
            return this.scenes_message;
        }

        public OpenMultiModal setIndex(int i) {
            this.index = Optional.e(Integer.valueOf(i));
            return this;
        }

        public OpenMultiModal setResourceType(ResourceType resourceType) {
            this.resource_type = Optional.e(resourceType);
            return this;
        }

        public OpenMultiModal setScenesMessage(List<MultiModalScenesMessage> list) {
            this.scenes_message = Optional.e(list);
            return this;
        }
    }

    public static class Paragraph {
        private Optional<String> paragraph_text = Optional.a();
        private Optional<List<Line>> lines = Optional.a();

        public Optional<List<Line>> getLines() {
            return this.lines;
        }

        public Optional<String> getParagraphText() {
            return this.paragraph_text;
        }

        public Paragraph setLines(List<Line> list) {
            this.lines = Optional.e(list);
            return this;
        }

        public Paragraph setParagraphText(String str) {
            this.paragraph_text = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "PersonalDataContext", namespace = AIApiConstants.MultiModal.NAME)
    public static class PersonalDataContext implements ContextPayload {
        private Optional<List<ResourceInfo>> infos = Optional.a();

        public Optional<List<ResourceInfo>> getInfos() {
            return this.infos;
        }

        public PersonalDataContext setInfos(List<ResourceInfo> list) {
            this.infos = Optional.e(list);
            return this;
        }
    }

    @NamespaceName(name = "PersonalDataSearch", namespace = AIApiConstants.MultiModal.NAME)
    public static class PersonalDataSearch implements EventPayload {
        private Optional<List<ResourceInfo>> resource_infos = Optional.a();
        private Optional<String> query = Optional.a();

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<List<ResourceInfo>> getResourceInfos() {
            return this.resource_infos;
        }

        public PersonalDataSearch setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public PersonalDataSearch setResourceInfos(List<ResourceInfo> list) {
            this.resource_infos = Optional.e(list);
            return this;
        }
    }

    @NamespaceName(name = "PersonalDataUnderstand", namespace = AIApiConstants.MultiModal.NAME)
    public static class PersonalDataUnderstand implements EventPayload {

        @Deprecated
        private Optional<List<ResourceInfo>> resource_infos = Optional.a();
        private Optional<String> query = Optional.a();

        public Optional<String> getQuery() {
            return this.query;
        }

        @Deprecated
        public Optional<List<ResourceInfo>> getResourceInfos() {
            return this.resource_infos;
        }

        public PersonalDataUnderstand setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        @Deprecated
        public PersonalDataUnderstand setResourceInfos(List<ResourceInfo> list) {
            this.resource_infos = Optional.e(list);
            return this;
        }
    }

    public static class RefItem {
        private Optional<String> title = Optional.a();
        private Optional<String> type = Optional.a();
        private Optional<String> contents = Optional.a();
        private Optional<String> resource_id = Optional.a();

        public Optional<String> getContents() {
            return this.contents;
        }

        public Optional<String> getResourceId() {
            return this.resource_id;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public Optional<String> getType() {
            return this.type;
        }

        public RefItem setContents(String str) {
            this.contents = Optional.e(str);
            return this;
        }

        public RefItem setResourceId(String str) {
            this.resource_id = Optional.e(str);
            return this;
        }

        public RefItem setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }

        public RefItem setType(String str) {
            this.type = Optional.e(str);
            return this;
        }
    }

    public static class RequestCarIdentify {

        @Required
        private CarIdentifyLocation location;

        public RequestCarIdentify() {
        }

        public RequestCarIdentify(CarIdentifyLocation carIdentifyLocation) {
            this.location = carIdentifyLocation;
        }

        @Required
        public CarIdentifyLocation getLocation() {
            return this.location;
        }

        @Required
        public RequestCarIdentify setLocation(CarIdentifyLocation carIdentifyLocation) {
            this.location = carIdentifyLocation;
            return this;
        }
    }

    public static class RequestRobotIdentify {

        @Required
        private RobotIdentifyCameraLocation location;

        public RequestRobotIdentify() {
        }

        public RequestRobotIdentify(RobotIdentifyCameraLocation robotIdentifyCameraLocation) {
            this.location = robotIdentifyCameraLocation;
        }

        @Required
        public RobotIdentifyCameraLocation getLocation() {
            return this.location;
        }

        @Required
        public RequestRobotIdentify setLocation(RobotIdentifyCameraLocation robotIdentifyCameraLocation) {
            this.location = robotIdentifyCameraLocation;
            return this;
        }
    }

    public static class ResourceInfo {
        private Optional<Integer> index = Optional.a();
        private Optional<String> title = Optional.a();
        private Optional<String> desc = Optional.a();
        private Optional<String> type = Optional.a();
        private Optional<List<String>> contents = Optional.a();
        private Optional<String> resource_id = Optional.a();

        public Optional<List<String>> getContents() {
            return this.contents;
        }

        public Optional<String> getDesc() {
            return this.desc;
        }

        public Optional<Integer> getIndex() {
            return this.index;
        }

        public Optional<String> getResourceId() {
            return this.resource_id;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public Optional<String> getType() {
            return this.type;
        }

        public ResourceInfo setContents(List<String> list) {
            this.contents = Optional.e(list);
            return this;
        }

        public ResourceInfo setDesc(String str) {
            this.desc = Optional.e(str);
            return this;
        }

        public ResourceInfo setIndex(int i) {
            this.index = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ResourceInfo setResourceId(String str) {
            this.resource_id = Optional.e(str);
            return this;
        }

        public ResourceInfo setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }

        public ResourceInfo setType(String str) {
            this.type = Optional.e(str);
            return this;
        }
    }

    public enum ResourceType {
        UNKNOWN(-1),
        IMAGE(0),
        DOCUMENT(1),
        NOTE(2),
        RECORDING(3),
        MESSAGE(4);

        private int id;

        ResourceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum RobotIdentifyCameraLocation {
        UNKNOWN(-1),
        FRONT(0),
        UPWARD(1);

        private int id;

        RobotIdentifyCameraLocation(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SingleChar {
        private Optional<String> char_text = Optional.a();
        private Optional<Float> char_confidence = Optional.a();
        private Optional<Location> location = Optional.a();

        public Optional<Float> getCharConfidence() {
            return this.char_confidence;
        }

        public Optional<String> getCharText() {
            return this.char_text;
        }

        public Optional<Location> getLocation() {
            return this.location;
        }

        public SingleChar setCharConfidence(float f) {
            this.char_confidence = Optional.e(Float.valueOf(f));
            return this;
        }

        public SingleChar setCharText(String str) {
            this.char_text = Optional.e(str);
            return this;
        }

        public SingleChar setLocation(Location location) {
            this.location = Optional.e(location);
            return this;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Switch.NAME, namespace = AIApiConstants.MultiModal.NAME)
    public static class Switch implements InstructionPayload {

        @Required
        private List<SwitchOperation> operations;

        public Switch() {
        }

        public Switch(List<SwitchOperation> list) {
            this.operations = list;
        }

        @Required
        public List<SwitchOperation> getOperations() {
            return this.operations;
        }

        @Required
        public Switch setOperations(List<SwitchOperation> list) {
            this.operations = list;
            return this;
        }
    }

    public static class SwitchOperation {

        @Required
        private boolean enabled;

        @Required
        private FeatureName name;

        public SwitchOperation() {
        }

        public SwitchOperation(FeatureName featureName, boolean z) {
            this.name = featureName;
            this.enabled = z;
        }

        @Required
        public FeatureName getName() {
            return this.name;
        }

        @Required
        public boolean isEnabled() {
            return this.enabled;
        }

        @Required
        public SwitchOperation setEnabled(boolean z) {
            this.enabled = z;
            return this;
        }

        @Required
        public SwitchOperation setName(FeatureName featureName) {
            this.name = featureName;
            return this;
        }
    }

    public static class UploadMultiModalMessage {

        @Required
        private UploadMultiModalMessageCode code;

        @Required
        private String message;

        public UploadMultiModalMessage() {
        }

        public UploadMultiModalMessage(UploadMultiModalMessageCode uploadMultiModalMessageCode, String str) {
            this.code = uploadMultiModalMessageCode;
            this.message = str;
        }

        @Required
        public UploadMultiModalMessageCode getCode() {
            return this.code;
        }

        @Required
        public String getMessage() {
            return this.message;
        }

        @Required
        public UploadMultiModalMessage setCode(UploadMultiModalMessageCode uploadMultiModalMessageCode) {
            this.code = uploadMultiModalMessageCode;
            return this;
        }

        @Required
        public UploadMultiModalMessage setMessage(String str) {
            this.message = str;
            return this;
        }
    }

    public enum UploadMultiModalMessageCode {
        UNKNOWN(-1),
        NO_IMAGE_LOAD(0),
        LOAD_IMAGE_FAIL(1),
        NO_DOCUMENT_LOAD(2),
        LOAD_DOCUMENT_FAIL(3);

        private int id;

        UploadMultiModalMessageCode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum UploadMultiModalScene {
        UNKNOWN(-1),
        CAR_IDENTIFY(0),
        PERSON_IDENTIFY(1),
        AI_SEARCH(2),
        RESOUCE_OPEN(3),
        SCREEN_ANSWER(4),
        SCREEN_DOCUMENT_ANSWER(5),
        SCREEN_ARTICLE_ANSWER(6),
        SCREEN_MAP(7),
        SCREEN_PHONE_CALL(8),
        SCREEN_EXPRESS(9),
        SCREEN_OPEN_TAO(10);

        private int id;

        UploadMultiModalScene(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum UseAiMemoryScene {
        UNKNOWN(-1),
        PERSONAL_DATA(0),
        AI_SEARCH(1);

        private int id;

        UseAiMemoryScene(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum VisionImageSource {
        UNKNOWN(-1),
        CAMERA_FOV30(0),
        CAMERA_FOV120(1);

        private int id;

        VisionImageSource(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "VisionRecognizeAggregateResult", namespace = AIApiConstants.MultiModal.NAME)
    public static class VisionRecognizeAggregateResult implements EventPayload {
        private Optional<List<FaceParam>> faces = Optional.a();
        private Optional<GestureParam> gesture = Optional.a();
        private Optional<HumanDetectionParam> human_detection = Optional.a();
        private Optional<List<VisionImage>> images = Optional.a();

        public Optional<List<FaceParam>> getFaces() {
            return this.faces;
        }

        public Optional<GestureParam> getGesture() {
            return this.gesture;
        }

        public Optional<HumanDetectionParam> getHumanDetection() {
            return this.human_detection;
        }

        public Optional<List<VisionImage>> getImages() {
            return this.images;
        }

        public VisionRecognizeAggregateResult setFaces(List<FaceParam> list) {
            this.faces = Optional.e(list);
            return this;
        }

        public VisionRecognizeAggregateResult setGesture(GestureParam gestureParam) {
            this.gesture = Optional.e(gestureParam);
            return this;
        }

        public VisionRecognizeAggregateResult setHumanDetection(HumanDetectionParam humanDetectionParam) {
            this.human_detection = Optional.e(humanDetectionParam);
            return this;
        }

        public VisionRecognizeAggregateResult setImages(List<VisionImage> list) {
            this.images = Optional.e(list);
            return this;
        }
    }

    @NamespaceName(name = "VisionRecognizeFinished", namespace = AIApiConstants.MultiModal.NAME)
    public static class VisionRecognizeFinished implements EventPayload {
    }

    @NamespaceName(name = "VisionRecognizeStarted", namespace = AIApiConstants.MultiModal.NAME)
    public static class VisionRecognizeStarted implements EventPayload {
    }

    public enum VisionRecognizeType {
        UNKNOWN(-1),
        FACE(0),
        GESTURE(1),
        IMAGES(2);

        private int id;

        VisionRecognizeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "PersonalData", namespace = AIApiConstants.MultiModal.NAME)
    public static class PersonalData implements InstructionPayload {

        @Required
        private boolean has_result;
        private Optional<List<RefItem>> ref_items = Optional.a();

        public PersonalData() {
        }

        public Optional<List<RefItem>> getRefItems() {
            return this.ref_items;
        }

        @Required
        public boolean isHasResult() {
            return this.has_result;
        }

        @Required
        public PersonalData setHasResult(boolean z) {
            this.has_result = z;
            return this;
        }

        public PersonalData setRefItems(List<RefItem> list) {
            this.ref_items = Optional.e(list);
            return this;
        }

        public PersonalData(boolean z) {
            this.has_result = z;
        }
    }

    public static class CarIdentifyItem {

        @Required
        private CarIdentifyCoordinate car_identify_coordinate;
        private Optional<String> side_img_url = Optional.a();
        private Optional<VisionImageSource> image_source = Optional.a();

        public CarIdentifyItem() {
        }

        @Required
        public CarIdentifyCoordinate getCarIdentifyCoordinate() {
            return this.car_identify_coordinate;
        }

        public Optional<VisionImageSource> getImageSource() {
            return this.image_source;
        }

        public Optional<String> getSideImgUrl() {
            return this.side_img_url;
        }

        @Required
        public CarIdentifyItem setCarIdentifyCoordinate(CarIdentifyCoordinate carIdentifyCoordinate) {
            this.car_identify_coordinate = carIdentifyCoordinate;
            return this;
        }

        public CarIdentifyItem setImageSource(VisionImageSource visionImageSource) {
            this.image_source = Optional.e(visionImageSource);
            return this;
        }

        public CarIdentifyItem setSideImgUrl(String str) {
            this.side_img_url = Optional.e(str);
            return this;
        }

        public CarIdentifyItem(CarIdentifyCoordinate carIdentifyCoordinate) {
            this.car_identify_coordinate = carIdentifyCoordinate;
        }
    }

    @NamespaceName(name = "ImageUnderstand", namespace = AIApiConstants.MultiModal.NAME)
    public static class ImageUnderstand implements EventPayload {

        @Required
        private List<String> image_ids;
        private Optional<String> query = Optional.a();
        private Optional<OCR> ocr_info = Optional.a();

        public ImageUnderstand() {
        }

        @Required
        public List<String> getImageIds() {
            return this.image_ids;
        }

        public Optional<OCR> getOcrInfo() {
            return this.ocr_info;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        @Required
        public ImageUnderstand setImageIds(List<String> list) {
            this.image_ids = list;
            return this;
        }

        public ImageUnderstand setOcrInfo(OCR ocr) {
            this.ocr_info = Optional.e(ocr);
            return this;
        }

        public ImageUnderstand setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public ImageUnderstand(List<String> list) {
            this.image_ids = list;
        }
    }

    public static class VisionImage {

        @Required
        private String file_id;

        @Required
        private int height;

        @Required
        private int width;
        private Optional<String> format = Optional.a();
        private Optional<VisionImageSource> image_source = Optional.a();

        public VisionImage() {
        }

        @Required
        public String getFileId() {
            return this.file_id;
        }

        public Optional<String> getFormat() {
            return this.format;
        }

        @Required
        public int getHeight() {
            return this.height;
        }

        public Optional<VisionImageSource> getImageSource() {
            return this.image_source;
        }

        @Required
        public int getWidth() {
            return this.width;
        }

        @Required
        public VisionImage setFileId(String str) {
            this.file_id = str;
            return this;
        }

        public VisionImage setFormat(String str) {
            this.format = Optional.e(str);
            return this;
        }

        @Required
        public VisionImage setHeight(int i) {
            this.height = i;
            return this;
        }

        public VisionImage setImageSource(VisionImageSource visionImageSource) {
            this.image_source = Optional.e(visionImageSource);
            return this;
        }

        @Required
        public VisionImage setWidth(int i) {
            this.width = i;
            return this;
        }

        public VisionImage(String str, int i, int i2) {
            this.file_id = str;
            this.width = i;
            this.height = i2;
        }
    }

    @NamespaceName(name = "VisionRecognizeResult", namespace = AIApiConstants.MultiModal.NAME)
    public static class VisionRecognizeResult implements EventPayload {
        private Optional<List<FaceParam>> face_param = Optional.a();
        private Optional<GestureParam> gesture_param = Optional.a();
        private Optional<List<VisionImage>> images = Optional.a();

        @Required
        private VisionRecognizeType type;

        public VisionRecognizeResult() {
        }

        public Optional<List<FaceParam>> getFaceParam() {
            return this.face_param;
        }

        public Optional<GestureParam> getGestureParam() {
            return this.gesture_param;
        }

        public Optional<List<VisionImage>> getImages() {
            return this.images;
        }

        @Required
        public VisionRecognizeType getType() {
            return this.type;
        }

        public VisionRecognizeResult setFaceParam(List<FaceParam> list) {
            this.face_param = Optional.e(list);
            return this;
        }

        public VisionRecognizeResult setGestureParam(GestureParam gestureParam) {
            this.gesture_param = Optional.e(gestureParam);
            return this;
        }

        public VisionRecognizeResult setImages(List<VisionImage> list) {
            this.images = Optional.e(list);
            return this;
        }

        @Required
        public VisionRecognizeResult setType(VisionRecognizeType visionRecognizeType) {
            this.type = visionRecognizeType;
            return this;
        }

        public VisionRecognizeResult(VisionRecognizeType visionRecognizeType) {
            this.type = visionRecognizeType;
        }
    }

    @NamespaceName(name = "UploadMultiModal", namespace = AIApiConstants.MultiModal.NAME)
    public static class UploadMultiModal implements InstructionPayload {

        @Required
        private UploadMultiModalScene scene;
        private Optional<RequestCarIdentify> request_car_Identify = Optional.a();
        private Optional<List<UploadMultiModalMessage>> messages = Optional.a();
        private Optional<RequestRobotIdentify> request_robot_identify = Optional.a();
        private Optional<Integer> index = Optional.a();
        private Optional<ResourceType> resource_type = Optional.a();
        private Optional<Boolean> store_record = Optional.a();

        public UploadMultiModal() {
        }

        public Optional<Integer> getIndex() {
            return this.index;
        }

        public Optional<List<UploadMultiModalMessage>> getMessages() {
            return this.messages;
        }

        public Optional<RequestCarIdentify> getRequestCarIdentify() {
            return this.request_car_Identify;
        }

        public Optional<RequestRobotIdentify> getRequestRobotIdentify() {
            return this.request_robot_identify;
        }

        public Optional<ResourceType> getResourceType() {
            return this.resource_type;
        }

        @Required
        public UploadMultiModalScene getScene() {
            return this.scene;
        }

        public Optional<Boolean> isStoreRecord() {
            return this.store_record;
        }

        public UploadMultiModal setIndex(int i) {
            this.index = Optional.e(Integer.valueOf(i));
            return this;
        }

        public UploadMultiModal setMessages(List<UploadMultiModalMessage> list) {
            this.messages = Optional.e(list);
            return this;
        }

        public UploadMultiModal setRequestCarIdentify(RequestCarIdentify requestCarIdentify) {
            this.request_car_Identify = Optional.e(requestCarIdentify);
            return this;
        }

        public UploadMultiModal setRequestRobotIdentify(RequestRobotIdentify requestRobotIdentify) {
            this.request_robot_identify = Optional.e(requestRobotIdentify);
            return this;
        }

        public UploadMultiModal setResourceType(ResourceType resourceType) {
            this.resource_type = Optional.e(resourceType);
            return this;
        }

        @Required
        public UploadMultiModal setScene(UploadMultiModalScene uploadMultiModalScene) {
            this.scene = uploadMultiModalScene;
            return this;
        }

        public UploadMultiModal setStoreRecord(boolean z) {
            this.store_record = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public UploadMultiModal(UploadMultiModalScene uploadMultiModalScene) {
            this.scene = uploadMultiModalScene;
        }
    }
}
