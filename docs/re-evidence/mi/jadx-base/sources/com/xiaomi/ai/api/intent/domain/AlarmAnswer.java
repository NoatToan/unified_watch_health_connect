package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.fitness.pay.export.data.response.OrderStatus;

/* JADX INFO: loaded from: classes7.dex */
public class AlarmAnswer {

    public enum AnswerType {
        Confirm(1, "Confirm"),
        Cancel(2, OrderStatus.CANCEL),
        Index(3, "Index"),
        All(4, "All"),
        Once(5, "Once"),
        Always(6, "Always"),
        Special(7, "Special"),
        Some(8, "Some");

        private int id;
        private String name;

        AnswerType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static AnswerType find(String str) {
            for (AnswerType answerType : values()) {
                if (answerType.name.equals(str)) {
                    return answerType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static AnswerType read(String str) {
            return find(str);
        }

        public static String write(AnswerType answerType) {
            return answerType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum QuestionType {
        YesOrNo(1, "YesOrNo"),
        WhichOne(2, "WhichOne"),
        OnceOrAlways(3, "OnceOrAlways"),
        AllOrNot(4, "AllOrNot"),
        AllOperateInstruct(5, "AllOperateInstruct"),
        Some(8, "Some");

        private int id;
        private String name;

        QuestionType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static QuestionType find(String str) {
            for (QuestionType questionType : values()) {
                if (questionType.name.equals(str)) {
                    return questionType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static QuestionType read(String str) {
            return find(str);
        }

        public static String write(QuestionType questionType) {
            return questionType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }
}
