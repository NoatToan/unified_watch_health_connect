package com.xiaomi.ai.api.nlp;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.iud;

/* JADX INFO: loaded from: classes7.dex */
public class Robot {

    public static class CommonTask extends Task {

        @Required
        private TaskType task_type = TaskType.COMMON;
        private Optional<String> name = Optional.a();

        public Optional<String> getName() {
            return this.name;
        }

        @Override // com.xiaomi.ai.api.nlp.Robot.Task
        @Required
        public TaskType getTaskType() {
            return this.task_type;
        }

        public CommonTask setName(String str) {
            this.name = Optional.e(str);
            return this;
        }
    }

    public static class DeliveryTask extends Task {

        @Required
        private TaskType task_type = TaskType.DELIVERY;
        private Optional<String> name = Optional.a();
        private Optional<String> pack = Optional.a();
        private Optional<String> take_from = Optional.a();
        private Optional<String> deliver_to = Optional.a();
        private Optional<String> password = Optional.a();

        public Optional<String> getDeliverTo() {
            return this.deliver_to;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getPack() {
            return this.pack;
        }

        public Optional<String> getPassword() {
            return this.password;
        }

        public Optional<String> getTakeFrom() {
            return this.take_from;
        }

        @Override // com.xiaomi.ai.api.nlp.Robot.Task
        @Required
        public TaskType getTaskType() {
            return this.task_type;
        }

        public DeliveryTask setDeliverTo(String str) {
            this.deliver_to = Optional.e(str);
            return this;
        }

        public DeliveryTask setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public DeliveryTask setPack(String str) {
            this.pack = Optional.e(str);
            return this;
        }

        public DeliveryTask setPassword(String str) {
            this.password = Optional.e(str);
            return this;
        }

        public DeliveryTask setTakeFrom(String str) {
            this.take_from = Optional.e(str);
            return this;
        }
    }

    public static class MessageTask extends Task {

        @Required
        private TaskType task_type = TaskType.MESSAGE;
        private Optional<String> name = Optional.a();
        private Optional<String> dest = Optional.a();
        private Optional<String> listener = Optional.a();
        private Optional<String> text = Optional.a();

        public Optional<String> getDest() {
            return this.dest;
        }

        public Optional<String> getListener() {
            return this.listener;
        }

        public Optional<String> getName() {
            return this.name;
        }

        @Override // com.xiaomi.ai.api.nlp.Robot.Task
        @Required
        public TaskType getTaskType() {
            return this.task_type;
        }

        public Optional<String> getText() {
            return this.text;
        }

        public MessageTask setDest(String str) {
            this.dest = Optional.e(str);
            return this;
        }

        public MessageTask setListener(String str) {
            this.listener = Optional.e(str);
            return this;
        }

        public MessageTask setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public MessageTask setText(String str) {
            this.text = Optional.e(str);
            return this;
        }
    }

    @JsonTypeInfo(include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "task_type", use = JsonTypeInfo.Id.NAME, visible = true)
    @iud({@iud.a(name = "COMMON", value = CommonTask.class), @iud.a(name = "MESSAGE", value = MessageTask.class), @iud.a(name = "DELIVERY", value = DeliveryTask.class)})
    public static abstract class Task {
        public abstract TaskType getTaskType();
    }

    public enum TaskType {
        UNKNOWN(-1),
        COMMON(0),
        DELIVERY(1),
        MESSAGE(2);

        private int id;

        TaskType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }
}
