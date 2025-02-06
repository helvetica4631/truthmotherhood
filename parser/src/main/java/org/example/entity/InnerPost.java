package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class InnerPost extends Post {

    @Override
    public String toString() {
        return "InnerPost{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", images=" + images +
                '}';
    }
}
